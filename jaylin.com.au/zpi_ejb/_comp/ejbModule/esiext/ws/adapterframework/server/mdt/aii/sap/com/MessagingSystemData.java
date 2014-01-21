
package esiext.ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import data.api.mdt.aii.sap.com.BooleanAttribute;
import data.api.mdt.aii.sap.com.MessageInterface;
import data.api.mdt.aii.sap.com.MessageParty;


/**
 * <p>Java class for MessagingSystemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingSystemData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelable" type="{urn:com.sap.aii.mdt.api.data}BooleanAttribute" minOccurs="0"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editable" type="{urn:com.sap.aii.mdt.api.data}BooleanAttribute" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="isPersistent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="persistUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualityOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverInterface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverParty" type="{urn:com.sap.aii.mdt.api.data}MessageParty" minOccurs="0"/>
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restartable" type="{urn:com.sap.aii.mdt.api.data}BooleanAttribute" minOccurs="0"/>
 *         &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retryInterval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scheduleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="senderInterface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" minOccurs="0"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderParty" type="{urn:com.sap.aii.mdt.api.data}MessageParty" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serializationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timesFailed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wasEdited" type="{urn:com.sap.aii.mdt.api.data}BooleanAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingSystemData", propOrder = {
    "cancelable",
    "connectionName",
    "credential",
    "direction",
    "editable",
    "endTime",
    "endpoint",
    "errorCategory",
    "errorCode",
    "headers",
    "_interface",
    "isPersistent",
    "messageID",
    "messageKey",
    "messageType",
    "nodeId",
    "persistUntil",
    "protocol",
    "qualityOfService",
    "receiverInterface",
    "receiverName",
    "receiverParty",
    "referenceID",
    "restartable",
    "retries",
    "retryInterval",
    "scheduleTime",
    "senderInterface",
    "senderName",
    "senderParty",
    "sequenceNumber",
    "serializationContext",
    "startTime",
    "status",
    "timesFailed",
    "transport",
    "validUntil",
    "version",
    "wasEdited"
})
public class MessagingSystemData {

    @XmlElementRef(name = "cancelable", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<BooleanAttribute> cancelable;
    @XmlElementRef(name = "connectionName", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> connectionName;
    @XmlElementRef(name = "credential", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> credential;
    @XmlElementRef(name = "direction", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> direction;
    @XmlElementRef(name = "editable", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<BooleanAttribute> editable;
    @XmlElementRef(name = "endTime", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "endpoint", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> endpoint;
    @XmlElementRef(name = "errorCategory", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> errorCategory;
    @XmlElementRef(name = "errorCode", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "headers", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> headers;
    @XmlElementRef(name = "interface", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<MessageInterface> _interface;
    protected boolean isPersistent;
    @XmlElementRef(name = "messageID", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> messageID;
    @XmlElementRef(name = "messageKey", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> messageKey;
    @XmlElementRef(name = "messageType", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> messageType;
    protected int nodeId;
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
    @XmlElementRef(name = "referenceID", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> referenceID;
    @XmlElementRef(name = "restartable", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<BooleanAttribute> restartable;
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
    @XmlElementRef(name = "sequenceNumber", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<Long> sequenceNumber;
    @XmlElementRef(name = "serializationContext", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> serializationContext;
    @XmlElementRef(name = "startTime", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "status", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> status;
    protected long timesFailed;
    @XmlElementRef(name = "transport", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> transport;
    @XmlElementRef(name = "validUntil", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validUntil;
    @XmlElementRef(name = "version", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<String> version;
    @XmlElementRef(name = "wasEdited", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", type = JAXBElement.class)
    protected JAXBElement<BooleanAttribute> wasEdited;

    /**
     * Gets the value of the cancelable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public JAXBElement<BooleanAttribute> getCancelable() {
        return cancelable;
    }

    /**
     * Sets the value of the cancelable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public void setCancelable(JAXBElement<BooleanAttribute> value) {
        this.cancelable = ((JAXBElement<BooleanAttribute> ) value);
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
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredential(JAXBElement<String> value) {
        this.credential = ((JAXBElement<String> ) value);
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
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public JAXBElement<BooleanAttribute> getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public void setEditable(JAXBElement<BooleanAttribute> value) {
        this.editable = ((JAXBElement<BooleanAttribute> ) value);
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpoint(JAXBElement<String> value) {
        this.endpoint = ((JAXBElement<String> ) value);
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
     * Gets the value of the headers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaders(JAXBElement<String> value) {
        this.headers = ((JAXBElement<String> ) value);
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
     * Gets the value of the isPersistent property.
     * 
     */
    public boolean isIsPersistent() {
        return isPersistent;
    }

    /**
     * Sets the value of the isPersistent property.
     * 
     */
    public void setIsPersistent(boolean value) {
        this.isPersistent = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageID(JAXBElement<String> value) {
        this.messageID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageKey(JAXBElement<String> value) {
        this.messageKey = ((JAXBElement<String> ) value);
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
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceID(JAXBElement<String> value) {
        this.referenceID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the restartable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public JAXBElement<BooleanAttribute> getRestartable() {
        return restartable;
    }

    /**
     * Sets the value of the restartable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public void setRestartable(JAXBElement<BooleanAttribute> value) {
        this.restartable = ((JAXBElement<BooleanAttribute> ) value);
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
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSequenceNumber(JAXBElement<Long> value) {
        this.sequenceNumber = ((JAXBElement<Long> ) value);
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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the timesFailed property.
     * 
     */
    public long getTimesFailed() {
        return timesFailed;
    }

    /**
     * Sets the value of the timesFailed property.
     * 
     */
    public void setTimesFailed(long value) {
        this.timesFailed = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the wasEdited property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public JAXBElement<BooleanAttribute> getWasEdited() {
        return wasEdited;
    }

    /**
     * Sets the value of the wasEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}
     *     
     */
    public void setWasEdited(JAXBElement<BooleanAttribute> value) {
        this.wasEdited = ((JAXBElement<BooleanAttribute> ) value);
    }

}
