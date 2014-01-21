package au.com.jaylin.persistence.facades;

import javax.ejb.Local;

import au.com.jaylin.persistence.PIMessage;

import java.util.Date;
import java.util.List;

@Local
public interface PIMessageFacadeLocal {

	public void create(PIMessage entity);

	public void update(PIMessage entity);

	public void delete(PIMessage entity);

	public PIMessage findPIMonMsgs(Object pk);

	public List<PIMessage> findAllPIMonMsgs();

	public int getPIMonMsgsItemCount();

	public int getStartIndex();

	public void setStartIndex(int startIndex);

	public int getBatchSize();

	public void setBatchSize(int batchSize);

	public List<PIMessage> findPIMonMsgsByIflow (java.lang.String iflow);

	public List<PIMessage> findPIMonMsgsBySender_party (java.lang.String sender_party);

	public List<PIMessage> findPIMonMsgsBySender_name (java.lang.String sender_name);

	public List<PIMessage> findPIMonMsgsBySender_namespace (java.lang.String sender_namespace);

	public List<PIMessage> findPIMonMsgsBySender_interface (java.lang.String sender_interface);

	public List<PIMessage> findPIMonMsgsByStatus (java.lang.String status);

	public List<PIMessage> findPIMonMsgsByMessage_key (java.lang.String message_key);

	public List<PIMessage> findPIMonMsgsByRef_id (java.lang.String ref_id);

	public List<PIMessage> findPIMonMsgsByPayload (java.lang.String payload);

	public List<PIMessage> findPIMonMsgsByEnd_time (java.util.Date end_time);

	public List<PIMessage> findPIMonMsgsByStart_time (java.util.Date start_time);

	public List<PIMessage> findPIMonMsgsById (java.lang.String id);

	public List<PIMessage> findAllPIMonMsgs(java.lang.String iflow,java.lang.String sender_party,java.lang.String sender_name,java.lang.String sender_namespace,java.lang.String sender_interface,java.lang.String status,java.lang.String message_key,java.lang.String ref_id,java.lang.String payload,java.util.Date end_time,java.util.Date start_time,java.lang.String id);

	public Date getPIMonMsgsLatestEndTime ();

	public int deleteAllMessages ();

	public List<PIMessage> findMessagesByTimeStampRange (Date startTime, Date endTime);

	public List<Object[]> findPIMonMsgsByRef_idNoPayload (String ref_id);

	public long numMessagesInError ();

	public long numMessagesInDeliveringMoreThanADay();
}
