
package esiext.ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import data.api.mdt.aii.sap.com.BooleanAttribute;
import data.api.mdt.aii.sap.com.MessageInterface;
import data.api.mdt.aii.sap.com.MessageParty;
import lang.java2.ArrayOfString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esiext.ws.adapterframework.server.mdt.aii.sap.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MessagingSystemFilterConnectionName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "connectionName");
    private final static QName _MessagingSystemFilterMessageType_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "messageType");
    private final static QName _MessagingSystemFilterInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "interface");
    private final static QName _MessagingSystemFilterScheduleTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "scheduleTime");
    private final static QName _MessagingSystemFilterToTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "toTime");
    private final static QName _MessagingSystemFilterProtocol_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "protocol");
    private final static QName _MessagingSystemFilterStatus_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "status");
    private final static QName _MessagingSystemFilterMessageIDs_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "messageIDs");
    private final static QName _MessagingSystemFilterErrorCode_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "errorCode");
    private final static QName _MessagingSystemFilterSenderParty_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "senderParty");
    private final static QName _MessagingSystemFilterReferenceIDs_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "referenceIDs");
    private final static QName _MessagingSystemFilterSenderName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "senderName");
    private final static QName _MessagingSystemFilterMessageFormat_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "messageFormat");
    private final static QName _MessagingSystemFilterFromTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "fromTime");
    private final static QName _MessagingSystemFilterValidUntil_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "validUntil");
    private final static QName _MessagingSystemFilterSenderInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "senderInterface");
    private final static QName _MessagingSystemFilterStatuses_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "statuses");
    private final static QName _MessagingSystemFilterCorrelationID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "correlationID");
    private final static QName _MessagingSystemFilterQualityOfService_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "qualityOfService");
    private final static QName _MessagingSystemFilterPersistUntil_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "persistUntil");
    private final static QName _MessagingSystemFilterDirection_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "direction");
    private final static QName _MessagingSystemFilterReceiverName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "receiverName");
    private final static QName _MessagingSystemFilterSequenceID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "sequenceID");
    private final static QName _MessagingSystemFilterSerializationContext_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "serializationContext");
    private final static QName _MessagingSystemFilterReceiverInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "receiverInterface");
    private final static QName _MessagingSystemFilterReceiverParty_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "receiverParty");
    private final static QName _MessagingSystemFilterTransport_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "transport");
    private final static QName _MessagingSystemFilterErrorCategory_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "errorCategory");
    private final static QName _MessagingSystemDataEndpoint_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "endpoint");
    private final static QName _MessagingSystemDataEditable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "editable");
    private final static QName _MessagingSystemDataCredential_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "credential");
    private final static QName _MessagingSystemDataRestartable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "restartable");
    private final static QName _MessagingSystemDataMessageKey_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "messageKey");
    private final static QName _MessagingSystemDataEndTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "endTime");
    private final static QName _MessagingSystemDataReferenceID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "referenceID");
    private final static QName _MessagingSystemDataVersion_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "version");
    private final static QName _MessagingSystemDataSequenceNumber_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "sequenceNumber");
    private final static QName _MessagingSystemDataHeaders_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "headers");
    private final static QName _MessagingSystemDataCancelable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "cancelable");
    private final static QName _MessagingSystemDataWasEdited_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "wasEdited");
    private final static QName _MessagingSystemDataStartTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "startTime");
    private final static QName _MessagingSystemDataMessageID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", "messageID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esiext.ws.adapterframework.server.mdt.aii.sap.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSMessageDataExtImpl }
     * 
     */
    public WSMessageDataExtImpl createWSMessageDataExtImpl() {
        return new WSMessageDataExtImpl();
    }

    /**
     * Create an instance of {@link MessagingSystemFilter }
     * 
     */
    public MessagingSystemFilter createMessagingSystemFilter() {
        return new MessagingSystemFilter();
    }

    /**
     * Create an instance of {@link WSMessageFilterExtImpl }
     * 
     */
    public WSMessageFilterExtImpl createWSMessageFilterExtImpl() {
        return new WSMessageFilterExtImpl();
    }

    /**
     * Create an instance of {@link MessagingSystemData }
     * 
     */
    public MessagingSystemData createMessagingSystemData() {
        return new MessagingSystemData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "connectionName", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterConnectionName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterConnectionName_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageType", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterMessageType(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterMessageType_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "interface", scope = MessagingSystemFilter.class)
    public JAXBElement<MessageInterface> createMessagingSystemFilterInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterInterface_QNAME, MessageInterface.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "scheduleTime", scope = MessagingSystemFilter.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemFilterScheduleTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterScheduleTime_QNAME, XMLGregorianCalendar.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "toTime", scope = MessagingSystemFilter.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemFilterToTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterToTime_QNAME, XMLGregorianCalendar.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "protocol", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterProtocol(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterProtocol_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "status", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterStatus(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterStatus_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageIDs", scope = MessagingSystemFilter.class)
    public JAXBElement<ArrayOfString> createMessagingSystemFilterMessageIDs(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_MessagingSystemFilterMessageIDs_QNAME, ArrayOfString.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "errorCode", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterErrorCode(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterErrorCode_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderParty", scope = MessagingSystemFilter.class)
    public JAXBElement<MessageParty> createMessagingSystemFilterSenderParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_MessagingSystemFilterSenderParty_QNAME, MessageParty.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "referenceIDs", scope = MessagingSystemFilter.class)
    public JAXBElement<ArrayOfString> createMessagingSystemFilterReferenceIDs(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_MessagingSystemFilterReferenceIDs_QNAME, ArrayOfString.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderName", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterSenderName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterSenderName_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageFormat", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterMessageFormat(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterMessageFormat_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "fromTime", scope = MessagingSystemFilter.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemFilterFromTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterFromTime_QNAME, XMLGregorianCalendar.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "validUntil", scope = MessagingSystemFilter.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemFilterValidUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterValidUntil_QNAME, XMLGregorianCalendar.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderInterface", scope = MessagingSystemFilter.class)
    public JAXBElement<MessageInterface> createMessagingSystemFilterSenderInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterSenderInterface_QNAME, MessageInterface.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "statuses", scope = MessagingSystemFilter.class)
    public JAXBElement<ArrayOfString> createMessagingSystemFilterStatuses(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_MessagingSystemFilterStatuses_QNAME, ArrayOfString.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "correlationID", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterCorrelationID(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterCorrelationID_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "qualityOfService", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterQualityOfService(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterQualityOfService_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "persistUntil", scope = MessagingSystemFilter.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemFilterPersistUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterPersistUntil_QNAME, XMLGregorianCalendar.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "direction", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterDirection(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterDirection_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverName", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterReceiverName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterReceiverName_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "sequenceID", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterSequenceID(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterSequenceID_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "serializationContext", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterSerializationContext(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterSerializationContext_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverInterface", scope = MessagingSystemFilter.class)
    public JAXBElement<MessageInterface> createMessagingSystemFilterReceiverInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterReceiverInterface_QNAME, MessageInterface.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverParty", scope = MessagingSystemFilter.class)
    public JAXBElement<MessageParty> createMessagingSystemFilterReceiverParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_MessagingSystemFilterReceiverParty_QNAME, MessageParty.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "transport", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterTransport(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterTransport_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "errorCategory", scope = MessagingSystemFilter.class)
    public JAXBElement<String> createMessagingSystemFilterErrorCategory(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterErrorCategory_QNAME, String.class, MessagingSystemFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "connectionName", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataConnectionName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterConnectionName_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "interface", scope = MessagingSystemData.class)
    public JAXBElement<MessageInterface> createMessagingSystemDataInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterInterface_QNAME, MessageInterface.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageType", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataMessageType(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterMessageType_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "scheduleTime", scope = MessagingSystemData.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemDataScheduleTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterScheduleTime_QNAME, XMLGregorianCalendar.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "endpoint", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataEndpoint(String value) {
        return new JAXBElement<String>(_MessagingSystemDataEndpoint_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "editable", scope = MessagingSystemData.class)
    public JAXBElement<BooleanAttribute> createMessagingSystemDataEditable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_MessagingSystemDataEditable_QNAME, BooleanAttribute.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "credential", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataCredential(String value) {
        return new JAXBElement<String>(_MessagingSystemDataCredential_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "protocol", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataProtocol(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterProtocol_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "status", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataStatus(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterStatus_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderParty", scope = MessagingSystemData.class)
    public JAXBElement<MessageParty> createMessagingSystemDataSenderParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_MessagingSystemFilterSenderParty_QNAME, MessageParty.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "errorCode", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataErrorCode(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterErrorCode_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "restartable", scope = MessagingSystemData.class)
    public JAXBElement<BooleanAttribute> createMessagingSystemDataRestartable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_MessagingSystemDataRestartable_QNAME, BooleanAttribute.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderName", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataSenderName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterSenderName_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "validUntil", scope = MessagingSystemData.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemDataValidUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterValidUntil_QNAME, XMLGregorianCalendar.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "senderInterface", scope = MessagingSystemData.class)
    public JAXBElement<MessageInterface> createMessagingSystemDataSenderInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterSenderInterface_QNAME, MessageInterface.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageKey", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataMessageKey(String value) {
        return new JAXBElement<String>(_MessagingSystemDataMessageKey_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "endTime", scope = MessagingSystemData.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemDataEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemDataEndTime_QNAME, XMLGregorianCalendar.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "referenceID", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataReferenceID(String value) {
        return new JAXBElement<String>(_MessagingSystemDataReferenceID_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "version", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataVersion(String value) {
        return new JAXBElement<String>(_MessagingSystemDataVersion_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "sequenceNumber", scope = MessagingSystemData.class)
    public JAXBElement<Long> createMessagingSystemDataSequenceNumber(Long value) {
        return new JAXBElement<Long>(_MessagingSystemDataSequenceNumber_QNAME, Long.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "headers", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataHeaders(String value) {
        return new JAXBElement<String>(_MessagingSystemDataHeaders_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "qualityOfService", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataQualityOfService(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterQualityOfService_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "direction", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataDirection(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterDirection_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "persistUntil", scope = MessagingSystemData.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemDataPersistUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemFilterPersistUntil_QNAME, XMLGregorianCalendar.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "serializationContext", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataSerializationContext(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterSerializationContext_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "cancelable", scope = MessagingSystemData.class)
    public JAXBElement<BooleanAttribute> createMessagingSystemDataCancelable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_MessagingSystemDataCancelable_QNAME, BooleanAttribute.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverName", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataReceiverName(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterReceiverName_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverInterface", scope = MessagingSystemData.class)
    public JAXBElement<MessageInterface> createMessagingSystemDataReceiverInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_MessagingSystemFilterReceiverInterface_QNAME, MessageInterface.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "wasEdited", scope = MessagingSystemData.class)
    public JAXBElement<BooleanAttribute> createMessagingSystemDataWasEdited(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_MessagingSystemDataWasEdited_QNAME, BooleanAttribute.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "startTime", scope = MessagingSystemData.class)
    public JAXBElement<XMLGregorianCalendar> createMessagingSystemDataStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessagingSystemDataStartTime_QNAME, XMLGregorianCalendar.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "messageID", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataMessageID(String value) {
        return new JAXBElement<String>(_MessagingSystemDataMessageID_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "receiverParty", scope = MessagingSystemData.class)
    public JAXBElement<MessageParty> createMessagingSystemDataReceiverParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_MessagingSystemFilterReceiverParty_QNAME, MessageParty.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "transport", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataTransport(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterTransport_QNAME, String.class, MessagingSystemData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws.esiext", name = "errorCategory", scope = MessagingSystemData.class)
    public JAXBElement<String> createMessagingSystemDataErrorCategory(String value) {
        return new JAXBElement<String>(_MessagingSystemFilterErrorCategory_QNAME, String.class, MessagingSystemData.class, value);
    }

}
