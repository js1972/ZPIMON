package au.com.jaylin.pimon.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.sap.tc.logging.Location;

import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.PIMessageHandlerLocal;

public class IflowListBuilderImp implements IflowListBuilder {
	private PIMessageHandlerLocal messagePersistenceHandler;
	private List<PIMessage> iflowMessages;
	private List<IFlow> iflowsIntermediate;
	private List<IFlow> iflows;
	private StatusValues worstMessageStatus = StatusValues.NONE;
	
	private Location logger = Location.getLocation("pimon.application.rest");
	
	public IflowListBuilderImp(PIMessageHandlerLocal messageHandler) {
		messagePersistenceHandler = messageHandler;
		iflowsIntermediate = new ArrayList<IFlow>();
		iflows = new ArrayList<IFlow>();
	}
	
	@Override
	public List<IFlow> build(Map<String, Date> timestamps, boolean errorsOnly) {
		logger.infoT("Iflow list builder");
		
		iflowMessages = messagePersistenceHandler.readIflows(timestamps);
		logger.infoT("iflowMessages size: " + iflowMessages.size());
		
		buildNewIflowListWithInitialIndicator();
		sortIflowListPriorToGrouping();
		groupIflowListByRefId();
		sortIflowResultListByEndTimeDescending();
		if (errorsOnly) {
			logger.infoT("*** READING ERROR IFLOWS ONLY ***");
			removeSuccessfulMessagesLeavingErrorsOnly();
		}
		
		return iflows;
	}

	private void removeSuccessfulMessagesLeavingErrorsOnly() {
		List<IFlow> tmpErrorIflows = new ArrayList<IFlow>();
		
		for (IFlow iflow : iflows) {
			if (getStatusAsEnum(iflow.status) == StatusValues.systemerror) {
				tmpErrorIflows.add(iflow);
			}
		}
		
		iflows.clear();
		iflows = new ArrayList<IFlow>(tmpErrorIflows);
	}

	private void sortIflowResultListByEndTimeDescending() {
		Collections.sort(iflows, new Comparator<IFlow>() {
			@Override
			public int compare(IFlow o1, IFlow o2) {
				int compareResult = o1.endTime.compareTo(o2.endTime);
				compareResult *= -1;
				return compareResult;
			}
		});
	}

	private void groupIflowListByRefId() {
		String oldRefId = "";
		Date earliestStartTime = null;
		Date latestEndTime = null;
		int currentIndex = 0;
		String savedIflow = "";
		String savedSenderParty = "";
		String savedSenderName = "";
		
		worstMessageStatus = StatusValues.NONE;
		for (IFlow iflow : iflowsIntermediate) {
			//at new ref_id
			if (!iflow.ref_id.equals(oldRefId)) {
				oldRefId = iflow.ref_id;
				earliestStartTime = iflow.startTime;
		        latestEndTime = iflow.endTime;
		        
		        savedIflow = iflow.iflow;
				savedSenderParty = iflow.sender_party;
				savedSenderName = iflow.sender_name;
			}
			
			setWorstMessageStatus(iflow.status);
			
			if (iflow.startTime.before(earliestStartTime)) {
	        	earliestStartTime = iflow.startTime;
			}
			if (iflow.endTime.after(latestEndTime)) {
	        	latestEndTime = iflow.endTime;
			}
			
			//at end of ref_id.
	        // Add an entry to the result list - one record for all the messages included in
	        // an iFlow.
			// Read ahead to the next iflow in the list to see if the refId has changed - if
			// it has then the current refId is the last one of the group, so roll-up the
			// data into the resultIflow list.
			//log.add("current index: " + currentIndex);
			IFlow nextIflow = null;
			try {
				int nextIndex = currentIndex + 1;
				nextIflow = iflowsIntermediate.get(nextIndex);
			}
			catch (IndexOutOfBoundsException e) {
				nextIflow = new IFlow();
				nextIflow.ref_id = "";  //force a change as this is the last iflow in the list 
			}
			
			if (!nextIflow.ref_id.equals(oldRefId)) {
				IFlow resultIflow = new IFlow();
				resultIflow.iflow = savedIflow;
				resultIflow.sender_party = savedSenderParty;
				resultIflow.sender_name = savedSenderName;
				resultIflow.endTime = latestEndTime;
				resultIflow.startTime = earliestStartTime;
				resultIflow.status = new StatusFormat().format(worstMessageStatus);
				resultIflow.ref_id = iflow.ref_id;
	        	iflows.add(resultIflow);
	        
	        	worstMessageStatus = StatusValues.NONE;
			}
			
			currentIndex++;
		}  // IFLOW LOOP
	}

	/**
	 * Set the Worst Message Status value based on the incoming status. Order of priority is:
	 * 
	 * -- systemerror
	 * -- waiting
	 * -- delivering
	 * -- holding
	 * -- canceled
	 * -- transfertoexternalapplication
	 * -- success
	 * 
	 * Note: SAP mis-spells cancelled as canceled.
 	 */
	private void setWorstMessageStatus(String iflowMessageStatus) {
		StatusValues enumVal = getStatusAsEnum(iflowMessageStatus);
		
		switch (enumVal) {
		case success:
			if (this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.waiting && 
				this.worstMessageStatus != StatusValues.delivering && 
				this.worstMessageStatus != StatusValues.transfertoexternalapplication && 
				this.worstMessageStatus != StatusValues.canceled) {
				
				this.worstMessageStatus = enumVal;
			}
			break;
			
		case processedsuccessfully:
			if (this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.waiting && 
				this.worstMessageStatus != StatusValues.delivering && 
				this.worstMessageStatus != StatusValues.transfertoexternalapplication && 
				this.worstMessageStatus != StatusValues.canceled) {
				
				this.worstMessageStatus = StatusValues.success;
			}
			break;
			
		case systemerror:
			this.worstMessageStatus = enumVal;
			break;
			
		case waiting:
			if (this.worstMessageStatus != StatusValues.systemerror) {
				this.worstMessageStatus = enumVal;
			}
			break;
			
		case delivering:
			if (this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.waiting) {
				
				this.worstMessageStatus = enumVal;
			}
			break;
			
		case transfertoexternalapplication:
			if (this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.delivering && 
				this.worstMessageStatus != StatusValues.waiting && 
				this.worstMessageStatus != StatusValues.canceled) {
				
				this.worstMessageStatus = StatusValues.erppostingerror;
			}
			break;
			
		case canceled:
			if (this.worstMessageStatus != StatusValues.canceled && 
				this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.waiting) {
				
				this.worstMessageStatus = enumVal;
			}
			break;
			
		case holding:
			if (this.worstMessageStatus != StatusValues.systemerror && 
				this.worstMessageStatus != StatusValues.waiting && 
				this.worstMessageStatus != StatusValues.delivering) {
				
				this.worstMessageStatus = enumVal;
			}
			break;
			
		default:
			this.worstMessageStatus = StatusValues.NONE;
			break;
			
		}
	}

	/**
	 * Helper function to return a status enum value from StatusValues
	 * when given a string status.
	 * 
	 * @param status
	 * @return
	 */
	private StatusValues getStatusAsEnum(String status) {
		StatusValues enumVal = StatusValues.NONE;
		String cleanStatus = status.replaceAll("\\s+","");  // Remove all whitespace
		
		cleanStatus = cleanStatus.toLowerCase();
		try {
			enumVal = StatusValues.valueOf(cleanStatus);
		}
		catch (Exception e) {
			//do nothing for now... an invalid PI status was found
		}
		
		return enumVal;
	}
	
	private void sortIflowListPriorToGrouping() {
		Collections.sort(iflowsIntermediate, new Comparator<IFlow>() {
			@Override
			public int compare(IFlow iflow1, IFlow iflow2) {
				int compareRefIdValue = iflow1.ref_id.compareTo(iflow2.ref_id);
				if (compareRefIdValue == 0) {
					int compareInitialIflowValue = (iflow1.initial == iflow2.initial)? 0 : ((iflow1.initial == true)? -1 : 1);
					if (compareInitialIflowValue == 0) {
						return iflow1.endTime.compareTo(iflow2.endTime) * -1;
					} else {
						return compareInitialIflowValue;
					}
				} else {
					return compareRefIdValue;
				}
			}
		});
	}

	private void buildNewIflowListWithInitialIndicator() {
		String prevRefId = "";
		
		// sort by refid ascending, then start time ascending
		Collections.sort(iflowMessages, new Comparator<PIMessage>() {
			@Override
			public int compare(PIMessage msg1, PIMessage msg2) {
				int comparator = msg1.getRef_id().compareTo(msg2.getRef_id());
				if (comparator == 0) {
					return msg1.getStart_time().compareTo(msg2.getStart_time());
				}
				return comparator;
			}
		});
		
		for (PIMessage message : iflowMessages) {
			IFlow iflow = new IFlow();
			iflow.iflow = message.getIflow();
			iflow.sender_party = message.getSender_party();
			iflow.sender_name = message.getSender_name();
			iflow.sender_namespace = message.getSender_namespace();
			iflow.sender_interface = message.getSender_interface();
			iflow.status = message.getStatus();
			iflow.ref_id = message.getRef_id();
			iflow.endTime = message.getEnd_time();
			iflow.startTime = message.getStart_time();
			
			// at new iflow (refid) set the initial-iflow flag
			iflow.initial = false;
			if (!message.getRef_id().equals(prevRefId)) {
				iflow.initial = true;
				prevRefId = message.getRef_id();
			}
			
			iflowsIntermediate.add(iflow);
		}
	}

}
