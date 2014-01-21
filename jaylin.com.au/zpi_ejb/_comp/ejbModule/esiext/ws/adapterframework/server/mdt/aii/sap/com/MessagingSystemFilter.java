
package esiext.ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import data.api.mdt.aii.sap.com.MessageInterface;
import data.api.mdt.aii.sap.com.MessageParty;
import lang.java2.ArrayOfString;


/**
 * <p>Java class for MessagingSystemFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingSystemFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="messageFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageIDs" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="onlyFaultyMessages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="persistUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualityOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverInterface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverParty" type="{urn:com.sap.aii.mdt.api.data}MessageParty" minOccurs="0"/>
 *         &lt;element name="referenceIDs" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retryInterval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="senderInterface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderParty" type="{urn:com.sap.aii.mdt.api.data}MessageParty" minOccurs="0"/>
 *         &lt;element name="sequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serializationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statuses" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="timesFailed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="wasEdited" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingSystemFilter", propOrder = {
    "archive",
    "connectionName",
    "correlationID",
    "dateType",
    "direction",
    "errorCategory",
    "errorCode",
    "fromTime",
    "_interface",
    "messageFormat",
    "messageIDs",
    "messageType",
    "nodeId",
    "onlyFaultyMessages",
    "persistUntil",
    "protocol",
    "qualityOfService",
    "receiverInterface",
    "receiverName",
    "receiverParty",
    "referenceIDs",
    "retries",
    "retryInterval",
    "scheduleTime",
    "senderInterface",
    "senderName",
    "senderParty",
    "sequenceID",
    "serializationContext",
    "status",
    "statuses",
    "timesFailed",
    "toTime",
    "transport",
    "validUntil",
    "wasEdited"
})
public class MessagingSystemFilter {

    protected boolean archive;
    @XmlElementRef(name = "connectionName", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> connectionName;
    @XmlElementRef(name = "correlationID", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> correlationID;
    protected int dateType;
    @XmlElementRef(name = "direction", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> direction;
    @XmlElementRef(name = "errorCategory", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> errorCategory;
    @XmlElementRef(name = "errorCode", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "fromTime", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fromTime;
    @XmlElementRef(name = "interface", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageInterface> _interface;
    @XmlElementRef(name = "messageFormat", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> messageFormat;
    @XmlElementRef(name = "messageIDs", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> messageIDs;
    @XmlElementRef(name = "messageType", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> messageType;
    protected int nodeId;
    protected boolean onlyFaultyMessages;
    @XmlElementRef(name = "persistUntil", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> persistUntil;
    @XmlElementRef(name = "protocol", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> protocol;
    @XmlElementRef(name = "qualityOfService", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> qualityOfService;
    @XmlElementRef(name = "receiverInterface", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageInterface> receiverInterface;
    @XmlElementRef(name = "receiverName", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> receiverName;
    @XmlElementRef(name = "receiverParty", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageParty> receiverParty;
    @XmlElementRef(name = "referenceIDs", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> referenceIDs;
    protected int retries;
    protected long retryInterval;
    @XmlElementRef(name = "scheduleTime", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> scheduleTime;
    @XmlElementRef(name = "senderInterface", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageInterface> senderInterface;
    @XmlElementRef(name = "senderName", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> senderName;
    @XmlElementRef(name = "senderParty", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageParty> senderParty;
    @XmlElementRef(name = "sequenceID", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> sequenceID;
    @XmlElementRef(name = "serializationContext", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> serializationContext;
    @XmlElementRef(name = "status", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "statuses", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> statuses;
    protected int timesFailed;
    @XmlElementRef(name = "toTime", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> toTime;
    @XmlElementRef(name = "transport", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> transport;
    @XmlElementRef(name = "validUntil", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validUntil;
    protected boolean wasEdited;

    /**
     * Gets the value of the archive property.
     * 
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     */
    public void setArchive(boolean value) {
        this.archive = value;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConnectionName(JAXBElement<String> value) {
        this.connectionName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrelationID(JAXBElement<String> value) {
        this.correlationID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dateType property.
     * 
     */
    public int getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     */
    public void setDateType(int value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirection(JAXBElement<String> value) {
        this.direction = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCategory() {
        return errorCategory;
    }

    /**
     * Sets the value of the errorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCategory(JAXBElement<String> value) {
        this.errorCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFromTime(JAXBElement<XMLGregorianCalendar> value) {
        this.fromTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public JAXBElement<MessageInterface> getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public void setInterface(JAXBElement<MessageInterface> value) {
        this._interface = ((JAXBElement<MessageInterface> ) value);
    }

    /**
     * Gets the value of the messageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageFormat() {
        return messageFormat;
    }

    /**
     * Sets the value of the messageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageFormat(JAXBElement<String> value) {
        this.messageFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the messageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getMessageIDs() {
        return messageIDs;
    }

    /**
     * Sets the value of the messageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setMessageIDs(JAXBElement<ArrayOfString> value) {
        this.messageIDs = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageType(JAXBElement<String> value) {
        this.messageType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nodeId property.
     * 
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     */
    public void setNodeId(int value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the onlyFaultyMessages property.
     * 
     */
    public boolean isOnlyFaultyMessages() {
        return onlyFaultyMessages;
    }

    /**
     * Sets the value of the onlyFaultyMessages property.
     * 
     */
    public void setOnlyFaultyMessages(boolean value) {
        this.onlyFaultyMessages = value;
    }

    /**
     * Gets the value of the persistUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPersistUntil() {
        return persistUntil;
    }

    /**
     * Sets the value of the persistUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPersistUntil(JAXBElement<XMLGregorianCalendar> value) {
        this.persistUntil = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocol(JAXBElement<String> value) {
        this.protocol = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qualityOfService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualityOfService() {
        return qualityOfService;
    }

    /**
     * Sets the value of the qualityOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualityOfService(JAXBElement<String> value) {
        this.qualityOfService = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receiverInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public JAXBElement<MessageInterface> getReceiverInterface() {
        return receiverInterface;
    }

    /**
     * Sets the value of the receiverInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public void setReceiverInterface(JAXBElement<MessageInterface> value) {
        this.receiverInterface = ((JAXBElement<MessageInterface> ) value);
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverName(JAXBElement<String> value) {
        this.receiverName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receiverParty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageParty }{@code >}
     *     
     */
    public JAXBElement<MessageParty> getReceiverParty() {
        return receiverParty;
    }

    /**
     * Sets the value of the receiverParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageParty }{@code >}
     *     
     */
    public void setReceiverParty(JAXBElement<MessageParty> value) {
        this.receiverParty = ((JAXBElement<MessageParty> ) value);
    }

    /**
     * Gets the value of the referenceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getReferenceIDs() {
        return referenceIDs;
    }

    /**
     * Sets the value of the referenceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setReferenceIDs(JAXBElement<ArrayOfString> value) {
        this.referenceIDs = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the retries property.
     * 
     */
    public int getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     */
    public void setRetries(int value) {
        this.retries = value;
    }

    /**
     * Gets the value of the retryInterval property.
     * 
     */
    public long getRetryInterval() {
        return retryInterval;
    }

    /**
     * Sets the value of the retryInterval property.
     * 
     */
    public void setRetryInterval(long value) {
        this.retryInterval = value;
    }

    /**
     * Gets the value of the scheduleTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleTime() {
        return scheduleTime;
    }

    /**
     * Sets the value of the scheduleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleTime(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the senderInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public JAXBElement<MessageInterface> getSenderInterface() {
        return senderInterface;
    }

    /**
     * Sets the value of the senderInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}
     *     
     */
    public void setSenderInterface(JAXBElement<MessageInterface> value) {
        this.senderInterface = ((JAXBElement<MessageInterface> ) value);
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderName(JAXBElement<String> value) {
        this.senderName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the senderParty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageParty }{@code >}
     *     
     */
    public JAXBElement<MessageParty> getSenderParty() {
        return senderParty;
    }

    /**
     * Sets the value of the senderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageParty }{@code >}
     *     
     */
    public void setSenderParty(JAXBElement<MessageParty> value) {
        this.senderParty = ((JAXBElement<MessageParty> ) value);
    }

    /**
     * Gets the value of the sequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequenceID() {
        return sequenceID;
    }

    /**
     * Sets the value of the sequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequenceID(JAXBElement<String> value) {
        this.sequenceID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serializationContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerializationContext() {
        return serializationContext;
    }

    /**
     * Sets the value of the serializationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerializationContext(JAXBElement<String> value) {
        this.serializationContext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setStatuses(JAXBElement<ArrayOfString> value) {
        this.statuses = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the timesFailed property.
     * 
     */
    public int getTimesFailed() {
        return timesFailed;
    }

    /**
     * Sets the value of the timesFailed property.
     * 
     */
    public void setTimesFailed(int value) {
        this.timesFailed = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setToTime(JAXBElement<XMLGregorianCalendar> value) {
        this.toTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransport(JAXBElement<String> value) {
        this.transport = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidUntil(JAXBElement<XMLGregorianCalendar> value) {
        this.validUntil = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the wasEdited property.
     * 
     */
    public boolean isWasEdited() {
        return wasEdited;
    }

    /**
     * Sets the value of the wasEdited property.
     * 
     */
    public void setWasEdited(boolean value) {
        this.wasEdited = value;
    }

}
