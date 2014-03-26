package au.com.jaylin.pimon.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.PIMessageHandlerLocal;
import au.com.jaylin.persistence.ejbs.ReadMessageLogException;
import au.com.jaylin.persistence.ejbs.helpers.LogEntry;
import au.com.jaylin.persistence.ejbs.helpers.OperationStatus;
import au.com.jaylin.persistence.ejbs.helpers.PITimeStamp;

import com.google.gson.Gson;
import com.sap.tc.logging.Location;

/**
 * Uses Jersey 2.3 (https://jersey.java.net/)
 * Note: The Jersey servlet instantiates this class (new) on every request. 
 */
@Path("/api")
public class PIMonAPI {
	private static final String PAYLOAD_START_OF_XML_MARKER_SOAPFAULT = "CONTENT-DESCRIPTION: MAINDOCUMENT";
	private static final String PAYLOAD_START_OF_XML_MARKER = "<?XML VERSION=\"1.0\" ENCODING=\"UTF-8\"?>";
	private static final String PAYLOAD_END_OF_XML_MARKER = "--SAP_";
	
	private PIMessageHandlerLocal messageHandler = null;
	
	private Location logger = Location.getLocation("pimon.application.rest");
	
	
	public PIMonAPI() {
		logger.infoT("PIMonAPI -> Constructor");
		
		Context ctx;
		
		try {
			ctx = new InitialContext(); 
			messageHandler = (PIMessageHandlerLocal) ctx.lookup("ejb:/appName=jaylin.com.au/zpi_app, jarName=jaylin.com.au~zpi_ejb.jar, beanName=PIMessageHandler, interfaceName=au.com.jaylin.persistence.ejbs.PIMessageHandlerLocal");
		}
		catch (Exception e) {
			throw new RuntimeException("Fatal exception. JNDI Lookup of PIMessageHandlerLocal failed!" + e.getMessage());
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/{filter}")
	public Response getIFlowsFiltered(@PathParam("filter") String filter, @QueryParam("errors") @DefaultValue("") String errorsFlag, @QueryParam("from") @DefaultValue("") String dateFrom, @QueryParam("to") @DefaultValue("") String dateTo) {
		Response r = null;
		boolean customDates = false; 	
		Map<String, Date> timestamps = null;
		
		if(filter.equals(PITimeStamp.FilterOpts.others.toString())){
			customDates = true;
		}
		
		if (customDates == true) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				Date dtFrm = formatter.parse(dateFrom + "T00:00:00");
				Date dtTo = formatter.parse(dateTo + "T23:59:59");
				if (dtTo.after(dtFrm)) {
					timestamps = messageHandler.buildCustomTimestamps(dtFrm, dtTo);
				}
			} catch (ParseException e) {
				timestamps = null;
			}
		}else {
			//One of the standard expressions like 'today', 'yesterday' passed in
			timestamps = messageHandler.buildTimestamps(filter);
		}
		
		if (timestampsIsValid(timestamps)) {
			IflowListBuilder iflowBuilder = new IflowListBuilderImp(messageHandler);
			List<IFlow> filteredIflows = iflowBuilder.build(timestamps, (errorsFlag.equals("X"))? true : false); 
			r = Response.ok().entity(new Gson().toJson(filteredIflows)).build();
		} else {
			if (customDates == true) {
				r = Response.serverError().entity(String.format("Invalid dates passed in, dateFrom: '%1$s', dateTo: '%2$s'. YYYY-MM-DD format required", dateFrom, dateTo)).build();
			} else {
				r = Response.serverError().entity(String.format("Invalid time filter value: '%1$s'", filter)).build();
			}
		}
		
		return r;
	}

	private boolean timestampsIsValid(Map<String, Date> timestamps) {
		if (timestamps == null) {
			return false;
		}
		else {
			return true;
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/{refid}/messages/")
	public String getIFlowMessages(@PathParam("refid") String refid) {
		List<PIMessage> messages = messageHandler.readIflowMessagesByRefid(refid);
		
		// Sort messages by endTime descending
		Collections.sort(messages, new Comparator<PIMessage>() {
			@Override
			public int compare(PIMessage msg1, PIMessage msg2) {
				if (msg1.getEnd_time() == null) {
					return 1;
				}
				if (msg2.getEnd_time() == null) {
					return -1;
				}
				int compareResult = msg1.getEnd_time().compareTo(msg2.getEnd_time());
				compareResult *= -1;
				return compareResult;
			}
		});
		
		return new Gson().toJson(PrettyPrintStatusNames(messages));
	}
	
	private List<PIMessage> PrettyPrintStatusNames(List<PIMessage> messages) {
		for (PIMessage message : messages) {
			StatusValues enumVal = StatusValues.getStatusAsEnum(message.getStatus());
			message.setStatus(StatusValues.format(enumVal));
		}
		
		return messages;
	}

	/**
	 * Extract the message payload for a given message Id.
	 * Find the "displayable" message payload within a message payload via
	 * start and end markers. this excludes all the XI header information.
	 * If the resulting payload looks like an xml document, return it as XML.
	 * If the resulting payload does not look like a complete XML document or
	 * it includes an <attachment> tag (meaning there are multiple payloads)
	 * then return it as text.
	 * 
	 * @param msgid
	 * @return String Actual "displayable" message payload
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
	@Path("iflows/messages/{msgid}/payload/")
	public Response getMessagePayload(@PathParam("msgid") String msgid) {
		Response r = null;
		String contentType = MediaType.TEXT_PLAIN;
		try {
			String payload = extractMessagePayload(readMessage(msgid));
			if(payload != null && payload.startsWith("<?xml") && payload.indexOf("<Attachment>") == -1) {
				contentType = MediaType.APPLICATION_XML;
			}
			r = Response.ok(null, contentType).entity(payload).build();
		}
		catch (ReadMessageException rme) {
			logger.errorT("Error reading payload for msgid: '" + msgid + "'. " + rme.getMessage());
			r = Response.serverError().entity("Unable to read the message payload. See trace file for more detail.").build();
		}
		
		return r;
	}
	
	private String readMessage(String msgid) {
		try {
			List<PIMessage> messages = messageHandler.readMessagePayload(msgid);
			return messages.get(0).getPayload();
		}
		catch (Exception e) {
			throw new ReadMessageException(e.getMessage());
		}
	}

	private String extractMessagePayload(String messageBody) {
		int startOfXMLPayload = messageBody.toUpperCase().indexOf(PAYLOAD_START_OF_XML_MARKER);
		if (startOfXMLPayload <= 0) {
			startOfXMLPayload = messageBody.toUpperCase().indexOf(PAYLOAD_START_OF_XML_MARKER_SOAPFAULT);
			if (startOfXMLPayload > -1) {
				startOfXMLPayload += 37;
			}
		}
		if (startOfXMLPayload <= 0) {
			throw new ReadMessageException("Unable to find XML markers in messageBody");
		}
		
		int endOfXMLPayload = messageBody.toUpperCase().lastIndexOf(PAYLOAD_END_OF_XML_MARKER);
		
		try {
			return messageBody.substring(startOfXMLPayload, endOfXMLPayload);
		}
		catch (Exception e) {
			throw new ReadMessageException("Unable to find XML markers in messageBody: " + e.getMessage());
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/messages/{msgid}/log/")
	public Response getMessageLog(@PathParam("msgid") String msgId) {
		Response r = null;
		List<LogEntry> logEntries = null;
		
		try {
			logEntries = messageHandler.readMessageLogByMsgId(msgId);
			r = Response.ok().entity(new Gson().toJson(logEntries)).build();
		}
		catch(ReadMessageLogException rmle) {
			logger.errorT("Error reading payload for msgid: '" + msgId + "'. " + rmle.getMessage());
			r = Response.serverError().entity("Unable to read payload for this message. See trace file for more detail.").build();
		}
		
		return r;
	}
	
	/**
	 * Use regex to get info about the message from payload.
	 * Note the "(?i)" in java regex means case-insensitive!
	 * This is an embedded pattern in the Java Matcher
	 * (Pattern.CASE_INSENSITIVE). 
	 * 
	 * @param msgId
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/messages/{msgid}/info/")
	public Response getMessageInfo(@PathParam("msgid") String msgId) {
		Response r = null;
		MessageHeaderDetails msgHdr = new MessageHeaderDetails();
		String payload = "";
		
		msgHdr.msgId = msgId;
		
		try {
			payload = readMessage(msgId);
			
			Pattern patternMode = Pattern.compile("(?i)<SAP:ProcessingMode>(.+?)</SAP:ProcessingMode>");
			Matcher matcherMode = patternMode.matcher(payload);
			while (matcherMode.find()) {
				msgHdr.mode = matcherMode.group(1);
			} 
			
			Pattern patternQos = Pattern.compile("(?i)<SAP:QualityOfService>(.+?)</SAP:QualityOfService>");
			Matcher matcherQos = patternQos.matcher(payload);
			while (matcherQos.find()) {
				msgHdr.qos = matcherQos.group(1);
			}
			
			Pattern patternQueueId = Pattern.compile("(?i)<SAP:QueueId>(.+?)</SAP:QueueId>");
			Matcher matcherQueueId = patternQueueId.matcher(payload);
			while (matcherQueueId.find()) {
				msgHdr.queueId = matcherQueueId.group(1);
			}
			
			Pattern patternSender = Pattern.compile("(?i)<SAP:Main.*?>.*?<SAP:Sender>.*?<SAP:Service>(.+?)</SAP:Service>");
			Matcher matcherSender = patternSender.matcher(payload);
			while (matcherSender.find()) {
				msgHdr.sender = matcherSender.group(1);
			}
			
			Pattern patternReceiver = Pattern.compile("(?i)<SAP:Main.*?>.*?<SAP:Receiver>.*?<SAP:Service>(.+?)</SAP:Service>");
			Matcher matcherReceiver = patternReceiver.matcher(payload);
			while (matcherReceiver.find()) {
				msgHdr.receiver = matcherReceiver.group(1);
			}
			
			r = Response.ok().entity(new Gson().toJson(msgHdr)).build();
		}
		catch(ReadMessageException rme) {
			logger.errorT("Error reading payload for msgid: '" + msgId + "'. " + rme.getMessage());
			r = Response.serverError().entity("Unable to read payload for this message. See trace file for more detail.").build();
		}
		
		return r;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/messages/{msgid}/cancel/")
	public Response cancelIndividualMessage(@PathParam("msgid") String msgId) {
		logger.infoT("PIMonAPI -> cancelIndividualMessage");
		
		Response r = null;
		
		OperationStatus status = messageHandler.cancelIndividualMessageByMsgId(msgId);
		if (status.status.equals("success")) {
			r = Response.ok().build();
		} else {
			r = Response.serverError().entity(new Gson().toJson(status)).build();
		}
		
		return r;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("iflows/messages/{msgid}/resend/")
	public Response resendIndividualMessage(@PathParam("msgid") String msgId) {
		logger.infoT("PIMonAPI -> resendIndividualMessage");
		
		Response r = null;
		
		OperationStatus status = messageHandler.resendIndividualMessageByMsgId(msgId);
		if (status.status.equals("success")) {
			r = Response.ok().build();
		} else {
			r = Response.serverError().entity(new Gson().toJson(status)).build();
		}
		
		return r;

	}
	/**
	 * Enables a message's reference id to be updated if something goes wrong
	 * 
	 * @param msgId - The message id to update
	 * @param refId - The new reference id
	 * @return
	 */
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("messages/{msgid}")
	public Response updateMessageReferenceId(@PathParam("msgid") String msgId, @QueryParam("refid") String refId) {
		logger.infoT("PIMonAPI -> updateMessageReferenceId");
		
		Response r = null;
		
		if(refId != null) {
			OperationStatus status = messageHandler.updateReferenceKey(msgId, refId);
			if (status.status.equals("success")) {
				r = Response.ok().build();
			} else {
				r = Response.serverError().entity(new Gson().toJson(status)).build();
			}
		}
		else {
			r = Response.serverError().entity(new Gson().toJson("No reference key provided")).build();
		}
		return r;
	}	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("update")
	public Response update() {
		logger.infoT("PIMonAPI -> update");
		
		Response r = null;
		
		OperationStatus status = messageHandler.readPIDataAndCache();
		if (status.status.equals("success")) {
			r = Response.ok().build();
		} else {
			r = Response.serverError().entity(new Gson().toJson(status)).build();
		}
		
		return r;
	}
	
	/**
	 * Read a 30 day (monthly) sliding window of statistics on the cached messages.
	 * Also reads some *all-time* stats => Need to consider refactoring this...
	 * 
	 * @param String period - currently only "monthly" is supported. 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("stats/{period}")
	public String getStats(@PathParam("period") String period) {
		logger.infoT("PIMonAPI -> getStats");
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		GregorianCalendar fromDate = new GregorianCalendar();
		
		if (period.equals("monthly")) {
			fromDate.add(Calendar.DAY_OF_YEAR, -30);
			timestamps.put("begin", fromDate.getTime());
			timestamps.put("end", new Date());
		} else {
			return "not implemented";
		}
		
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(messageHandler);
		List<IFlow> filteredIflows = iflowBuilder.build(timestamps, false); 
		
		//get iflow stats
		PIStatistics stats = new PIStatistics();
		
		stats.iflowPerDay = filteredIflows.size() / 30;
		stats.iflowErrorsPerDay = 0;
		for (IFlow iflow : filteredIflows) {
			if (iflow.status.equals("system error") || iflow.status.equals("cancelled")) {
				stats.iflowErrorsPerDay += 1;
			}
		}
		stats.iflowErrorsPerDay /= 30;
		
		stats.iflowOutstandingErrors = 0;
		for (IFlow iflow : filteredIflows) {
			if (iflow.status.equals("system error")) {
				stats.iflowOutstandingErrors += 1;
			}
		}
		
		//get message stats
		//Note that RAW status value - wrap this in a class like the iflows!!
		List<PIMessage> messages = messageHandler.readMessagesByTimeRange(timestamps);
		stats.messagePerDay = messages.size() / 30;
		stats.messageErrorsPerDay = 0;
		for (PIMessage message : messages) {
			if (StatusValues.getStatusAsEnum(message.getStatus()) == StatusValues.systemerror || StatusValues.getStatusAsEnum(message.getStatus()) == StatusValues.canceled) {
				stats.messageErrorsPerDay += 1;
			}
		}
		stats.messageErrorsPerDay /= 30;
		
		stats.messageOutstandingErrors = 0;
		for (PIMessage message : messages) {
			if (StatusValues.getStatusAsEnum(message.getStatus()) == StatusValues.systemerror) {
				stats.messageOutstandingErrors += 1;
			}
		}
		
		
		//get ALL-TIME message stats
		stats.errorsAllTime = messageHandler.readNumberOfMessagesInError();
		stats.deliveringAllTime = messageHandler.readNumberOfMessagesStuckDelivering();
		
		//build time-series data for the chart
		Map<Long, Integer> dataPoints = messageHandler.buildTimeSeriesOfSuccessfulMessages();
		stats.messageTimeSeries = dataPoints;

		return new Gson().toJson(stats);
	}
	
	/**
	 * TEST METHOD - return the filter time-stamps
	 * @param filter
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("test_filter/{filter}")
	public String testFilter(@PathParam("filter") String filter) {
		logger.infoT("PIMonAPI -> testFilter *** TEST METHOD CALL ***");
		Map<String, Date> m = messageHandler.buildTimestamps(filter);
		return (m.isEmpty())? "invalid filter" : new Gson().toJson(m);
	}
}