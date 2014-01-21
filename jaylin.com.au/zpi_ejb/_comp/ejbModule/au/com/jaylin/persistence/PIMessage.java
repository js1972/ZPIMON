package au.com.jaylin.persistence;

import javax.persistence.*;
import java.lang.String;
import java.util.Date;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries( { @NamedQuery(name = "PIMessage.findById", query = "SELECT t FROM PIMessage t WHERE t.id = :id"), @NamedQuery(name = "PIMessage.findByIflow", query = "SELECT t FROM PIMessage t WHERE t.iflow = :iflow"), @NamedQuery(name = "PIMessage.findBySender_party", query = "SELECT t FROM PIMessage t WHERE t.sender_party = :sender_party"), @NamedQuery(name = "PIMessage.findBySender_name", query = "SELECT t FROM PIMessage t WHERE t.sender_name = :sender_name"), @NamedQuery(name = "PIMessage.findBySender_namespace", query = "SELECT t FROM PIMessage t WHERE t.sender_namespace = :sender_namespace"), @NamedQuery(name = "PIMessage.findBySender_interface", query = "SELECT t FROM PIMessage t WHERE t.sender_interface = :sender_interface"), @NamedQuery(name = "PIMessage.findByStatus", query = "SELECT t FROM PIMessage t WHERE t.status = :status"), @NamedQuery(name = "PIMessage.findByMessage_key", query = "SELECT t FROM PIMessage t WHERE t.message_key = :message_key"), @NamedQuery(name = "PIMessage.findByRef_id", query = "SELECT t FROM PIMessage t WHERE t.ref_id = :ref_id"), @NamedQuery(name = "PIMessage.findByPayload", query = "SELECT t FROM PIMessage t WHERE t.payload = :payload"), @NamedQuery(name = "PIMessage.findByEnd_time", query = "SELECT t FROM PIMessage t WHERE t.end_time = :end_time"), @NamedQuery(name = "PIMessage.findByStart_time", query = "SELECT t FROM PIMessage t WHERE t.start_time = :start_time") })
@Entity(name = "PIMessage")
@Table(name = "Z_PIMESSAGE")
public class PIMessage {

	@Id
	private String id;
	@Basic
	private String iflow;
	@Basic
	private String sender_party;
	@Basic
	private String sender_name;
	@Basic
	private String sender_namespace;
	@Basic
	private String sender_interface;
	@Basic
	private String status;
	@Basic
	private String message_key;
	@Basic
	private String ref_id;
	@Basic
	@Lob
	private String payload;
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date end_time;
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date start_time;

	public void setId(String param) {
		this.id = param;
	}

	public String getId() {
		return id;
	}

	public void setIflow(String param) {
		this.iflow = param;
	}

	public String getIflow() {
		return iflow;
	}

	public void setSender_party(String param) {
		this.sender_party = param;
	}

	public String getSender_party() {
		return sender_party;
	}

	public void setSender_name(String param) {
		this.sender_name = param;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_namespace(String param) {
		this.sender_namespace = param;
	}

	public String getSender_namespace() {
		return sender_namespace;
	}

	public void setSender_interface(String param) {
		this.sender_interface = param;
	}

	public String getSender_interface() {
		return sender_interface;
	}

	public void setStatus(String param) {
		this.status = param;
	}

	public String getStatus() {
		return status;
	}

	public void setMessage_key(String param) {
		this.message_key = param;
	}

	public String getMessage_key() {
		return message_key;
	}

	public void setRef_id(String param) {
		this.ref_id = param;
	}

	public String getRef_id() {
		return ref_id;
	}

	public void setPayload(String param) {
		this.payload = param;
	}

	public String getPayload() {
		return payload;
	}

	public void setEnd_time(Date param) {
		this.end_time = param;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setStart_time(Date param) {
		this.start_time = param;
	}

	public Date getStart_time() {
		return start_time;
	}

}