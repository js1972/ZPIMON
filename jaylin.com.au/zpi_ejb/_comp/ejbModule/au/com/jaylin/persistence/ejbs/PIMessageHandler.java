/**
 * This EJB handles all persistence related tasks for the PI message data.
 */
package au.com.jaylin.persistence.ejbs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBElement;

import com.sap.tc.logging.Location;

import lang.java2.ArrayOfString;

import data.api.mdt.aii.sap.com.ArrayOfAuditLogEntryData;
import data.api.mdt.aii.sap.com.AuditLogEntryData;

import ws.adapterframework.server.mdt.aii.sap.com.AdapterFilter;
import ws.adapterframework.server.mdt.aii.sap.com.AdapterFrameworkData;
import ws.adapterframework.server.mdt.aii.sap.com.AdminActionResult;
import ws.adapterframework.server.mdt.aii.sap.com.AdminActionResultMap;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAdapterFrameworkData;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAdminActionResult;
import ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue;

import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.helpers.LogEntry;
import au.com.jaylin.persistence.ejbs.helpers.OperationStatus;
import au.com.jaylin.persistence.ejbs.helpers.PITimeStamp;
import au.com.jaylin.persistence.ejbs.helpers.TimestampException;
import au.com.jaylin.persistence.facades.PIMessageFacadeLocal;

class MessageDetails {
	String refId;
	String payload;
}

/**
 * Session Bean implementation class PIMessageHandler
 */
@Stateless
public class PIMessageHandler implements PIMessageHandlerLocal {
	
	@EJB
	private PIMessageFacadeLocal piMessageFacade;
	@EJB
	ApplicationPropertiesLocal appProperties;
	@EJB	
	WebServiceEndPointLocal ws;
        
    private AdapterFilter filter;
    private Map<String, String> conversationAndRefToIds; //MessageId, ConversationId
    private List<PIMessage> messagesToStore;
    private Location logger = Location.getLocation("pimon.application.ejb");
    
    public PIMessageHandler() {
    	filter = new AdapterFilter();
    	messagesToStore = new ArrayList<PIMessage>();
    	conversationAndRefToIds = new HashMap<String, String>();
    }
    
    /**
     * Call the MessageList web service on PI to read messages within a date
     * range and cache them into a local db (java dictionary) with the help 
     * of the PIMonMsgsFacade JPA facade.
     * The filter dates are determined as follows:
     * fromDate - If there is no cached data a hard-coded date is used; else
     * the latest message end date in the cache is used.
     * toDate - This is set at NOW!
     */
    public OperationStatus readPIDataAndCache() {
    	OperationStatus status = new OperationStatus();
    	
    	messagesToStore.clear();
    	conversationAndRefToIds.clear();
    	
    	setupWSFilterParams();
	
    	List<AdapterFrameworkData> messages = callWSAndGetMessageList();    	
    	groupAndStoreMessages(messages);
    	
    	//TODO *** ADD ERROR MANAGEMENT HERE ***
    	status.status = "success";
    	return status; 
    }

    private List<AdapterFrameworkData> callWSAndGetMessageList() {
    	MessageSearchReturnValue result = null;
    	try {
    		result = ws.call().getMessageList(filter, appProperties.getMessageMaxResults());
    	}
    	catch (Exception e) {
    		logger.errorT("PIMessageHandler.callWSAndGetMessageList() -> getMessageList() WS call failed: " + e.getMessage());
    	}
    	
    	logger.infoT("PIMessageHandler.callWSAndGetMessageList() -> getMessageList() WS call SUCCESS");
    	
    	JAXBElement<ArrayOfAdapterFrameworkData> listNode = result.getList();
    	ArrayOfAdapterFrameworkData a = listNode.getValue();
    	return a.getAdapterFrameworkData();
	}
    
    /**
     * Just calls the standard JPA facade classes: read entity
     */
    public List<PIMessage> readMessagePayload(String msgId) {
    	return piMessageFacade.findPIMonMsgsById(msgId);
    }
    
    public List<LogEntry> readMessageLogByMsgId(String msgId) {
    	ArrayOfAuditLogEntryData auditLogEntryDataArray = null;
    	List<AuditLogEntryData> logEntriesAsXML = null;
    	List<LogEntry> logEntries = new ArrayList<LogEntry>();
    	
    	try {
    		List<PIMessage> messages = piMessageFacade.findPIMonMsgsById(msgId);
        	PIMessage message = messages.get(0);
        	
    		auditLogEntryDataArray = ws.call().getLogEntries(message.getMessage_key(), false, appProperties.getLogEntryMaxResults(), null, null);
    	}
    	catch (IndexOutOfBoundsException ioob) {
    		logger.errorT("Failed to read message in readMessageLogByMsgId(): '" + msgId + "'; Exception: " + ioob.getMessage());
    		throw new ReadMessageLogException("Failed to read message: '" + msgId + "'; Exception: " + ioob.getMessage());
    	}
    	catch (Exception e) {
    		logger.errorT("WS call for getLogEntries() failed for msgid: '" + msgId + "'; Error: " + e.getMessage());
    		throw new ReadMessageLogException("WS call for getLogEntries() failed for msgid: '" + msgId + "'; Error: " + e.getMessage());
		}
    	
    	logEntriesAsXML = auditLogEntryDataArray.getAuditLogEntryData();
    	for (AuditLogEntryData logEntryAsXML : logEntriesAsXML) {
    		LogEntry log = new LogEntry();
    		log.status = logEntryAsXML.getStatus().getValue().trim();
    		log.timestamp = logEntryAsXML.getTimeStamp().getValue().toGregorianCalendar().getTime();
    		log.text = logEntryAsXML.getLocalizedText().getValue().trim();
    		logEntries.add(log);
    	}
    	
    	return logEntries;
    }
    
    public OperationStatus cancelIndividualMessageByMsgId(String msgId) {
    	OperationStatus status = new OperationStatus();
    	AdminActionResultMap results = null;
    	ArrayOfString messageKeys = new ArrayOfString();
    	List<PIMessage> messages = piMessageFacade.findPIMonMsgsById(msgId);
    	PIMessage message = messages.get(0);
    	
    	messageKeys.getString().add(message.getMessage_key());
    	
    	try {
    		results = ws.call().cancelMessages(messageKeys);
    	}
    	catch (Exception e) {
    		//TODO what goes here?!?
    		throw new RuntimeException("*** HOLY SHIT *** FAILED TO CANCEL MSG LOG FOR MSGKEY: " + message.getMessage_key() + " --- " + e.getMessage() + " --- " + e.getClass());
		}
    	
    	JAXBElement<ArrayOfAdminActionResult> resultsAsXML = results.getResultList();
    	ArrayOfAdminActionResult a = resultsAsXML.getValue();
    	List<AdminActionResult> l = a.getAdminActionResult();

    	if (l.get(0).isSuccessful()) {
    		updateMessageWithCancelledStatusByEntity(message);
    		status.status = "success";
    	} else {
    		status.status = "failed";
    		status.description = l.get(0).getResultText().getValue();
    	}

    	return status;
    }
    
    private void updateMessageWithCancelledStatusByEntity(PIMessage message) {
    	message.setStatus("canceled");
		piMessageFacade.update(message);
	}

	public OperationStatus resendIndividualMessageByMsgId(String msgId) {
    	OperationStatus status = new OperationStatus();
    	AdminActionResultMap results = null;
    	ArrayOfString messageKeys = new ArrayOfString();
    	List<PIMessage> messages = piMessageFacade.findPIMonMsgsById(msgId);
    	PIMessage message = messages.get(0);
    	
    	messageKeys.getString().add(message.getMessage_key());
    	
    	try {
    		results = ws.call().resendMessages(messageKeys);
    	}
    	catch (Exception e) {
    		//TODO what goes here?!?
    		throw new RuntimeException("*** HOLY SHIT *** FAILED TO RE-SEND MSG LOG FOR MSGKEY: " + message.getMessage_key() + " --- " + e.getMessage() + " --- " + e.getClass());
		}
    	
    	JAXBElement<ArrayOfAdminActionResult> resultsAsXML = results.getResultList();
    	ArrayOfAdminActionResult a = resultsAsXML.getValue();
    	List<AdminActionResult> l = a.getAdminActionResult();

    	if (l.get(0).isSuccessful()) {
    		status.status = "success";
    	} else {
    		status.status = "failed";
    		status.description = l.get(0).getResultText().getValue();
    	}

    	return status;
    }
    
    /**
     * Setup the message list filter. We select messages on a sliding window basis
     * which means we go back a certain amount of time so as to collect changes to
     * previous messages. We currently use a sliding window of 1 DAY up till NOW.
     * 
     * Note: we can use local times - Java converts to PI's internal UTC!
     * 
     * The QName for the JAXBElement<XMLGregorianCalendar> values needs to be of the form:
     * "ns2:fromTime" - this was determined by sending the WS call to a soapUI proxy. We
     * need the namespace prefix as well as the field name.
     * 
     * @return
     */
    private void setupWSFilterParams() {
    	Date d = piMessageFacade.getPIMonMsgsLatestEndTime();
    	if (d == null) {
    		logger.infoT(String.format("No previous messages found, using default base date: %s to find messages from", appProperties.getBaseDate().toString()));
    		d = appProperties.getBaseDate();
    	}
    	
		filter.setFromTime(new PITimeStamp().getXMLTimeStampWithSlidingWindow(d, PITimeStamp.TimeStampType.from));
    	filter.setToTime(new PITimeStamp().getXMLTimeStampWithSlidingWindow(new Date(), PITimeStamp.TimeStampType.to));
    	filter.setArchive(false);
    	filter.setDateType(0);
    	filter.setNodeId(0);
    	filter.setOnlyFaultyMessages(false);
    	filter.setRetries(0);
    	filter.setRetryInterval(0);
    	filter.setTimesFailed(0);
    	filter.setWasEdited(false);
    	
    	logger.infoT("PIMessageHandler -> setupWSFilterParams()");
    	logger.infoT("From Time: " + d);
    	logger.infoT("To Time: " + new Date());
    }
    
    /**
     * Call the WS operation: getMessageBytesJavaLangStringBoolean to 
     * retrieve the message payload.
     * Also scan the payload to determine the refId field which is what
     * we use to group together messages.
     * Save any sync message conversation id's for later processing.
     * 
     * @param msgKey
     * @param msgId
     * @return MessageDetails - an object containing the refId and payload as Strings.
     */
    private MessageDetails callMessageDetailsWS(String msgKey, String msgId) {
    	MessageDetails md = new MessageDetails();
    	byte[] byteArray = null;
    	
    	if (msgKey == null || msgKey.equals("")) {
    		return md;
    	}
    	
    	try {
    		byteArray = ws.call().getMessageBytesJavaLangStringBoolean(msgKey, false);
    	}
    	catch (Exception e) {
    		throw new RuntimeException("Read message payload web service failed: ws.call().getMessageBytesJavaLangStringBoolean(msgKey, false). MsgId: " + msgId + ", MsgKey: " + msgKey);
		}
    	
    	logger.infoT("PIMessageHandler.callMessageDetailsWS(): getMessageBytesJavaLangStringBoolean() WS SUCCESS");
    	
    	md.payload = new String(byteArray);
    	md.refId = calculateRefId(msgId, md.payload);
    	
    	return md;
    }
    
    /**
     * Calculate the refId which is the unique string used to group iflow
     * messages together.
     * 
     * @param msgId
     * @param payload
     * @return String refId
     */
    private String calculateRefId(String msgId, String payload) {
    	String upperCasePayload = payload.toUpperCase();
    	String refId = "";
    	int i = upperCasePayload.indexOf("CONVERSATIONID");
    	
    	if (i > -1) {
    		i += 15;
    		refId = payload.substring(i, i + 36);
    		if (refId != null && !refId.isEmpty()) {
    			this.conversationAndRefToIds.put(msgId, refId);     //store for later use
    		}
    	} else {
    		i = upperCasePayload.indexOf("<SAP:REFTOMESSAGEID>");
    		if (i > -1) {
    			i += 20;
    			refId = payload.substring(i, i + 36);
    			if (refId != null && !refId.isEmpty()) {
    				this.conversationAndRefToIds.put(msgId, refId);
    			}
    		} else {
    			i = upperCasePayload.indexOf("XIRA</SAP:ADAPTER><SAP:MESSAGEID>");
    			if (i > -1) {
    				i += 33;
    				refId = payload.substring(i, i + 36);
    				
    				// if this is a sync message there can be two XIRA hoplists - get the one equal to this messageId
    				int foundSyncIndex = upperCasePayload.indexOf("<SAP:PROCESSINGMODE>SYNCHRONOUS");
    				if (foundSyncIndex > -1) {
    					if (!refId.equals(msgId)) {
    						i = upperCasePayload.indexOf("XIRA</SAP:ADAPTER><SAP:MESSAGEID>", i);
    						if (i > -1) {
    							i += 33;
    		    				refId = payload.substring(i, i + 36);
    						}
    					}
    				}
    			} else {
    				logger.errorT("PIMessageHandler.calculateRefId() *** NO REF_ID FOUND *** MsgId: " + msgId);
    			}
    		}
    	}
    	
    	logger.infoT("PIMessageHandler.calculateRefId() -> MsgId: |" + msgId + "|, RefId: |" + refId + "|");
    	
		return refId;
	}

	/**
     * Go through the map of conversation id's:
     * For each message where the id equals the map entries conversation id,
     * lookup the corresponding message from the maps message id and set the
     * refId's to be equal. 
     * This is how we join together the outbound and inbound messages in a
     * grouped iflow -> ie. async/sync bridge.
     * 
     * conversationAndRefToIds: Key is msgId; value is conversationId
     */
    private void matchMessagesToConvIdOrRefToId() {
    	String tmpRefId = "";

    	for (Map.Entry<String, String> entry : this.conversationAndRefToIds.entrySet()) {
    		tmpRefId = "";
    		
    		// get the refId of the message that matches the conversation id
    		for (PIMessage m : messagesToStore) {
    			if (m.getId().equals(entry.getValue())) {   //if message id eq conversation id
    				tmpRefId = m.getRef_id();
    				break;
    			}
    		}
    		
    		if (tmpRefId.equals("")) {
    			// could not find a message id for the conversation - look at existing messages as
    			// it may have already been cached / stored
    			List<PIMessage> oldMessages = piMessageFacade.findPIMonMsgsById(entry.getValue());
    			if (oldMessages.size() > 0) {
    				tmpRefId = (oldMessages.get(0).getRef_id() == null || oldMessages.get(0).getRef_id().equals(""))? null : oldMessages.get(0).getRef_id();
    				if (tmpRefId == null) {
    					logger.errorT("*** ERROR - cannot find a message matching the conversation id: " + entry.getValue() + " - refId set to null!");
    				}
    			}
    		}
    		
    		// set the saved refId to the message that started the conversation
    		for (PIMessage n : messagesToStore) {
    	    	if (n.getId().equals(entry.getKey())) { //if message id eq message id of the conversation
    	    		n.setRef_id(tmpRefId);
    	    		logger.infoT("*** SWAPPED REFID *** set the refId for msgId: " + n.getId() + " to " + tmpRefId);
    	    	}
    	    }
    	}
    }
    
    /**
     * Convert string to JPA friendly value - empty strings and strings
     * with trailing whitespace are not allowed with OpenSQL.
     * 
     * @param s
     * @return String - Return a trimmed String object or null if the 
     * String is empty.
     */
    private String assignStringValue(String s) {
    	return (s == null || s.isEmpty())? null : (s.trim().length() == 0)? null : s.trim();
    }
    
    /**
     * Store the messages using JPA.
     * First we just build up a list of the message entities to store, 
     * then we loop over them and correct any synchronous messages so
     * that the outbound and inbound are linked.
     * Lastly, we loop over the corrected list of message entities and
     * persist them.
     * 
     * @param msgs - Collection of JPA message entities
     */
    private void groupAndStoreMessages(List<AdapterFrameworkData> msgs) {
    	logger.infoT("PIMessageHandler.groupAndStoreMessages()");
    	
    	readPayloadsAndBuildMessageEntities(msgs);
    	matchMessagesToConvIdOrRefToId();
    	persistMessageEntities();
    }
    
    private void persistMessageEntities() {
    	for (PIMessage m : messagesToStore) {
    		if (m.getRef_id() == null || m.getRef_id().equals("")) {
    			m.setRef_id("*** NO REF ID ***");
    		}
    		piMessageFacade.update(m);  //actually performs an upsert!
    	}
	}

	private void readPayloadsAndBuildMessageEntities(List<AdapterFrameworkData> msgs) {
    	MessageDetails messageDetails;
    	
    	for (AdapterFrameworkData m : msgs) {

    		// ignore when no iflow - means it was an exception record
    		JAXBElement<String> scenarioJAXB = null;
    		String scenario = "";
    		try {
    			scenarioJAXB = m.getScenarioIdentifier();
    			scenario = scenarioJAXB.getValue();
    		}
    		catch (Exception e) {
    			continue;
    		}
    		
    		if (scenario != null && !scenario.equals("")) {
    			PIMessage msgData = new PIMessage();

    			String iFlowName = getIflowName(m);

    			msgData.setIflow(assignStringValue(iFlowName));
    			msgData.setId(assignStringValue(m.getMessageID().getValue()));
    			msgData.setMessage_key(assignStringValue(m.getMessageKey().getValue()));
    			msgData.setSender_interface(assignStringValue(m.getSenderInterface().getValue().getName().getValue()));
    			msgData.setSender_name(assignStringValue(m.getSenderName().getValue()));
    			msgData.setSender_namespace(assignStringValue(m.getSenderInterface().getValue().getNamespace().getValue()));
    			msgData.setSender_party(assignStringValue(m.getSenderParty().getValue().getName().getValue()));
    			msgData.setStart_time(m.getStartTime().getValue().toGregorianCalendar().getTime());
    			
    			// End time cane be null when message has "holding" status!
    			if (m.getEndTime() == null) {
    				msgData.setEnd_time(null);
    			} else {
    				msgData.setEnd_time(m.getEndTime().getValue().toGregorianCalendar().getTime());
    			}
    			
    			msgData.setStatus(assignStringValue(m.getStatus().getValue()));

    			messageDetails = callMessageDetailsWS(m.getMessageKey().getValue(), m.getMessageID().getValue());

    			msgData.setPayload(assignStringValue(messageDetails.payload));
    			msgData.setRef_id(assignStringValue(messageDetails.refId));

    			messagesToStore.add(msgData);
    		}
    	}
    }

	private String getIflowName(AdapterFrameworkData message) {
    	String iflowName = "";
    	
    	if (message.getScenarioIdentifier().getValue().startsWith("dir://ICO")) {
			iflowName = message.getSenderParty().getValue().getName().getValue() + "|" + message.getSenderName().getValue() + "|" + message.getSenderInterface().getValue().getName().getValue();
		} else {
			Pattern pattern = Pattern.compile("[^/]+$");
			Matcher matcher = pattern.matcher(message.getScenarioIdentifier().getValue());
			if (matcher.find()) {
				iflowName = message.getScenarioIdentifier().getValue().substring(matcher.start(), matcher.end());
			} else {
				iflowName = "!!! iFlow scenario identifier not recognised !!!";
			}
		}
    	
    	return iflowName;
	}

    public List<PIMessage> readIflows(Map<String, Date> timestamps) {
    	//do some date checks here first to save any sql errors!!
    	return piMessageFacade.findMessagesByTimeStampRange(timestamps.get("begin"), timestamps.get("end"));
    }
    
    /**
     * Read the messages in an iflow by looking up the refId value. So that we
     * don't get the payload for every message we must specify the columns we
     * want in the SELECT -> therefore JPA cannot automatically generate the
     * entities and we do that manually here.
     * (Why don't we want the payload? A. It could be very big so only read it
     * when absolutely necessary!)
     */
    public List<PIMessage> readIflowMessagesByRefid(String refId) {
    	List<PIMessage> messages = new ArrayList<PIMessage>();
    	List<Object[]> list = piMessageFacade.findPIMonMsgsByRef_idNoPayload(refId);
    	
    	for (Object[] o : list) {
    		PIMessage m = new PIMessage();
    		m.setId((o[0] == null)? null : o[0].toString());
    		m.setSender_party((o[1] == null)? null : o[1].toString());
    		m.setSender_name((o[2] == null)? null : o[2].toString());
    		m.setSender_namespace((o[3] == null)? null : o[3].toString());
    		m.setSender_interface((o[4] == null)? null : o[4].toString());
    		m.setStatus((o[5] == null)? null : o[5].toString());
    		m.setMessage_key((o[6] == null)? null : o[6].toString());
    		m.setRef_id((o[7] == null)? null : o[7].toString());
    		m.setEnd_time((o[8] == null)? null : (Date)o[8]);
    		m.setStart_time((o[9] == null)? null : (Date)o[9]);
    		messages.add(m);
    	}
    	return messages;
    }
    
    /**
     * Give a filter string, return the start and end time-stamps
     * as an object.
     */
    public Map<String, Date> buildTimestamps(String filter) {
    	try {
    		return new PITimeStamp().buildTimestamps(filter);
    	}
    	catch (TimestampException te) {
    		return null;
    	}
    }
    
    public Map<String, Date> buildCustomTimestamps(Date dateFrom, Date dateTo) {
    	try {
    		return new PITimeStamp().buildCustomTimestamps(dateFrom, dateTo);
    	}
    	catch (TimestampException te) {
    		return null;
    	}
    }    
    
    public List<PIMessage> readMessagesByTimeRange(Map<String, Date> timestamps) {
    	return piMessageFacade.findMessagesByTimeStampRange(timestamps.get("begin"), timestamps.get("end"));
    }
    
    public long readNumberOfMessagesInError() {
    	return piMessageFacade.numMessagesInError();
    }
    
    public long readNumberOfMessagesStuckDelivering() {
    	return piMessageFacade.numMessagesInDeliveringMoreThanADay();
    }
    
    /**
     * Build a histogram of successful messages.
     * Read all successful messages from the db and process them in a HashMap
     * such that we have a count of the message per day.
     */
    public Map<Long, Integer> buildTimeSeriesOfSuccessfulMessages() {
    	logger.infoT("Enetered: buildTimeSeriesOfSuccessfulMessages()");
    	
    	List<PIMessage> messages = piMessageFacade.findPIMonMsgsByStatus("success");
    	logger.infoT("Successful messages size(): " + messages.size());
    	
    	//sort by start date
    	Collections.sort(messages, new Comparator<PIMessage>() {
			@Override
			public int compare(PIMessage msg1, PIMessage msg2) {
				int compareResult = msg1.getStart_time().compareTo(msg2.getStart_time());
				//compareResult *= -1;
				return compareResult;
			}
		});
    	
    	Map<Long, Integer> dps = new HashMap<Long, Integer>();
    	
    	for (PIMessage message : messages) {
    		//capture all the messages within each day
    		Date messageDate = message.getStart_time();
    		Calendar c = Calendar.getInstance();
    		c.setTime(messageDate);
    		c.set(Calendar.HOUR, 0);
    		c.set(Calendar.MINUTE, 0);
    		c.set(Calendar.SECOND, 0);
    		c.set(Calendar.MILLISECOND, 0);
    		Date d = c.getTime();
    		long time = d.getTime();
    		
    		//Integer value = new Integer(dps.get(time));
    		Integer value = dps.get(time);
    		
    		if (value != null) {
    			dps.put(time, value + 1);
    		} else {
    			dps.put(time, new Integer(1));
    		}
    	}
    	
    	logger.infoT("Done: buildTimeSeriesOfSuccessfulMessages()");
    	return dps;
    }
    
    @Override
    public OperationStatus updateReferenceKey(String message_id, String reference_key) {
    	OperationStatus result = new OperationStatus();
    	result.status = "failed";
    	List<PIMessage> messages = piMessageFacade.findPIMonMsgsById(message_id);
    	if(messages.size() == 1) {
    		PIMessage msg = messages.get(0);
    		msg.setRef_id(reference_key);
    		piMessageFacade.update(msg);
    		result.status = "success";
    	} else {
    		logger.errorT(String.format("No message found with id %s", message_id));
    	}
    	return result;
    }
}
