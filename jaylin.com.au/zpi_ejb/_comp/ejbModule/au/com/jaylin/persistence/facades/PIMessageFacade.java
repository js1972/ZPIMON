package au.com.jaylin.persistence.facades;

import javax.ejb.Stateless;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import au.com.jaylin.persistence.PIMessage;

import java.util.ArrayList;

/**
 * Session Bean implementation class PIMonMsgsFacade
 */
@Stateless
public class PIMessageFacade implements PIMessageFacadeLocal {
    private static final String ERROR_STATUS = "systemError";
	private static final String DELIVERING_STATUS = "delivering";
	private int startIndex = 0;
	private int batchSize = Integer.MAX_VALUE;

	@PersistenceContext
	private EntityManager em;

	public void create(PIMessage entity) { 
		em.persist(entity); 
	}

	public void update(PIMessage entity) { 
		em.merge(entity); 
	}

	public void delete(PIMessage entity) { 
		PIMessage obj = em.merge(entity); 
		em.remove(obj); 
	}

	public PIMessage findPIMonMsgs(Object pk) { 
		return (PIMessage) em.find(PIMessage.class, pk); 
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findAllPIMonMsgs() { 
	   Query query = em.createQuery("select object(o) from PIMessage as o");
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList(); 
	}

	public int getPIMonMsgsItemCount(){
		Query q = em.createQuery("select count(o) from PIMessage as o");
	   int itemCount = ((Long)q.getSingleResult()).intValue();
	   return itemCount;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public int getBatchSize() {
			return batchSize;
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByIflow (java.lang.String iflow){
		Query query = em.createNamedQuery("PIMessage.findByIflow");
		query.setParameter("iflow", iflow);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsBySender_party (java.lang.String sender_party){
		Query query = em.createNamedQuery("PIMessage.findBySender_party");
		query.setParameter("sender_party", sender_party);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsBySender_name (java.lang.String sender_name){
		Query query = em.createNamedQuery("PIMessage.findBySender_name");
		query.setParameter("sender_name", sender_name);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsBySender_namespace (java.lang.String sender_namespace){
		Query query = em.createNamedQuery("PIMessage.findBySender_namespace");
		query.setParameter("sender_namespace", sender_namespace);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsBySender_interface (java.lang.String sender_interface){
		Query query = em.createNamedQuery("PIMessage.findBySender_interface");
		query.setParameter("sender_interface", sender_interface);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByStatus (java.lang.String status){
		Query query = em.createNamedQuery("PIMessage.findByStatus");
		query.setParameter("status", status);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByMessage_key (java.lang.String message_key){
		Query query = em.createNamedQuery("PIMessage.findByMessage_key");
		query.setParameter("message_key", message_key);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByRef_id (java.lang.String ref_id){
		Query query = em.createNamedQuery("PIMessage.findByRef_id");
		query.setParameter("ref_id", ref_id);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByPayload (java.lang.String payload){
		Query query = em.createNamedQuery("PIMessage.findByPayload");
		query.setParameter("payload", payload);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByEnd_time (java.util.Date end_time){
		Query query = em.createNamedQuery("PIMessage.findByEnd_time");
		query.setParameter("end_time", end_time);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsByStart_time (java.util.Date start_time){
		Query query = em.createNamedQuery("PIMessage.findByStart_time");
		query.setParameter("start_time", start_time);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PIMessage> findPIMonMsgsById (java.lang.String id){
		Query query = em.createNamedQuery("PIMessage.findById");
		query.setParameter("id", id);
	   query.setFirstResult(getStartIndex());
		query.setMaxResults(getBatchSize());
		return query.getResultList();
	}

	public List<PIMessage> findAllPIMonMsgs(java.lang.String iflow, java.lang.String sender_party, java.lang.String sender_name, java.lang.String sender_namespace, java.lang.String sender_interface, java.lang.String status, java.lang.String message_key, java.lang.String ref_id, java.lang.String payload, java.util.Date end_time, java.util.Date start_time, java.lang.String id){
		List<PIMessage> result = new ArrayList<PIMessage>();
		if((iflow == null || iflow.equals(""))&& (sender_party == null || sender_party.equals(""))&& (sender_name == null || sender_name.equals(""))&& (sender_namespace == null || sender_namespace.equals(""))&& (sender_interface == null || sender_interface.equals(""))&& (status == null || status.equals(""))&& (message_key == null || message_key.equals(""))&& (ref_id == null || ref_id.equals(""))&& (payload == null || payload.equals(""))&& (end_time == null || end_time.equals(""))&& (start_time == null || start_time.equals(""))&& (id == null || id.equals(""))){
			result = findAllPIMonMsgs();
		}
		if(iflow != null && !"".equals(iflow)){
			List<PIMessage> tempResultIflow = findPIMonMsgsByIflow(iflow);
			for(PIMessage res : tempResultIflow){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(sender_party != null && !"".equals(sender_party)){
			List<PIMessage> tempResultSender_party = findPIMonMsgsBySender_party(sender_party);
			for(PIMessage res : tempResultSender_party){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(sender_name != null && !"".equals(sender_name)){
			List<PIMessage> tempResultSender_name = findPIMonMsgsBySender_name(sender_name);
			for(PIMessage res : tempResultSender_name){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(sender_namespace != null && !"".equals(sender_namespace)){
			List<PIMessage> tempResultSender_namespace = findPIMonMsgsBySender_namespace(sender_namespace);
			for(PIMessage res : tempResultSender_namespace){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(sender_interface != null && !"".equals(sender_interface)){
			List<PIMessage> tempResultSender_interface = findPIMonMsgsBySender_interface(sender_interface);
			for(PIMessage res : tempResultSender_interface){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(status != null && !"".equals(status)){
			List<PIMessage> tempResultStatus = findPIMonMsgsByStatus(status);
			for(PIMessage res : tempResultStatus){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(message_key != null && !"".equals(message_key)){
			List<PIMessage> tempResultMessage_key = findPIMonMsgsByMessage_key(message_key);
			for(PIMessage res : tempResultMessage_key){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(ref_id != null && !"".equals(ref_id)){
			List<PIMessage> tempResultRef_id = findPIMonMsgsByRef_id(ref_id);
			for(PIMessage res : tempResultRef_id){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(payload != null && !"".equals(payload)){
			List<PIMessage> tempResultPayload = findPIMonMsgsByPayload(payload);
			for(PIMessage res : tempResultPayload){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(end_time != null && !"".equals(end_time)){
			List<PIMessage> tempResultEnd_time = findPIMonMsgsByEnd_time(end_time);
			for(PIMessage res : tempResultEnd_time){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(start_time != null && !"".equals(start_time)){
			List<PIMessage> tempResultStart_time = findPIMonMsgsByStart_time(start_time);
			for(PIMessage res : tempResultStart_time){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		if(id != null && !"".equals(id)){
			List<PIMessage> tempResultId = findPIMonMsgsById(id);
			for(PIMessage res : tempResultId){
				if(!result.contains(res)){
					result.add(res);
				}
			}
		}
		return result;
	}

	/**
	 * Read the latest end_time timestamp from the messages table.
	 * @return Date
	 */
	public Date getPIMonMsgsLatestEndTime() {
		Query q = em.createQuery("select max(o.end_time) from PIMessage as o");
		Date d = ((Date)q.getSingleResult());
		return d;
	}
	
	/**
	 * Delete entire table contents
	 * @return String - the result of the operation
	 */
	public int deleteAllMessages() {
		Query q = em.createNativeQuery("delete from Z_PIMESSAGE");
		return (int) q.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public List<PIMessage> findMessagesByTimeStampRange(Date startTime, Date endTime) {
		Query query = em.createQuery("select m from PIMessage as m where m.start_time >= :start_time and m.end_time <= :end_time");
		query.setParameter("start_time", startTime, TemporalType.TIMESTAMP);
		query.setParameter("end_time", endTime, TemporalType.TIMESTAMP);
		return (List<PIMessage>) query.getResultList();
	}
	
	/**
	 * Find all PI messages for the given iflow (by refId) - but DO NOT return the payload!
	 * Note that we can only return an object array as JPA can't build our entity when specifying columns.
	 */
	@SuppressWarnings("unchecked")
	public List<Object[]> findPIMonMsgsByRef_idNoPayload (java.lang.String ref_id){
		Query query = em.createQuery("select m.id, m.sender_party, m.sender_name, m.sender_namespace, m.sender_interface, m.status, m.message_key, m.ref_id, m.end_time, m.start_time from PIMessage as m where m.ref_id = :ref_id");
		query.setParameter("ref_id", ref_id);
		return (List<Object[]>) query.getResultList();
	}
	
	public long numMessagesInError() {
		Query q = em.createQuery("select count(o) from PIMessage as o where o.status = :status");
		q.setParameter("status", ERROR_STATUS);
		return ((Long) q.getSingleResult()).longValue();
	}
	
	public long numMessagesInDeliveringMoreThanADay() {
		Query q = em.createQuery("select count(o) from PIMessage as o where o.status = :status and o.start_time < :start_time");
		q.setParameter("status", DELIVERING_STATUS);
		GregorianCalendar fromDate = new GregorianCalendar();
		fromDate.add(Calendar.DAY_OF_YEAR, -1);
		q.setParameter("start_time", fromDate, TemporalType.TIMESTAMP);
		return ((Long) q.getSingleResult()).longValue();
	}
}
