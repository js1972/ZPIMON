package au.com.jaylin.persistence.ejbs;

import javax.ejb.Local;


import java.util.Date;
import java.util.List;
import java.util.Map;

import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.helpers.LogEntry;
import au.com.jaylin.persistence.ejbs.helpers.OperationStatus;

@Local
public interface PIMessageHandlerLocal {
	public OperationStatus readPIDataAndCache ();
	public Map<String, Date> buildTimestamps(String filter);
	public Map<String, Date> buildCustomTimestamps(Date dateFrom, Date dateTo);
	public List<PIMessage> readIflows(Map<String, Date> timestamps);
	public List<PIMessage> readIflowMessagesByRefid (String refId);
	public List<PIMessage> readMessagePayload(String msgId);
	public List<LogEntry> readMessageLogByMsgId (String msgId);
	public OperationStatus cancelIndividualMessageByMsgId (String msgId);
	public OperationStatus resendIndividualMessageByMsgId (String msgId);
	public List<PIMessage> readMessagesByTimeRange (Map<String,Date> timestamps);
	public long readNumberOfMessagesInError ();
	public long readNumberOfMessagesStuckDelivering();
	public Map<Long, Integer> buildTimeSeriesOfSuccessfulMessages();
	public OperationStatus updateReferenceKey(String msgId, String referenceKey);
}
