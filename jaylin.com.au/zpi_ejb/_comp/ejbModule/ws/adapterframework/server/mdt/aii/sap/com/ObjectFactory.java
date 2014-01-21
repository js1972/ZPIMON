
package ws.adapterframework.server.mdt.aii.sap.com;

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
 * generated in the ws.adapterframework.server.mdt.aii.sap.com package. 
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

    private final static QName _IntegrationFlowDescription_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "description");
    private final static QName _IntegrationFlowName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "name");
    private final static QName _IntegrationFlowId_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "id");
    private final static QName _AdapterFrameworkDataStatus_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "status");
    private final static QName _AdapterFrameworkDataApplicationComponent_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "applicationComponent");
    private final static QName _AdapterFrameworkDataProtocol_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "protocol");
    private final static QName _AdapterFrameworkDataEndpoint_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "endpoint");
    private final static QName _AdapterFrameworkDataEditable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "editable");
    private final static QName _AdapterFrameworkDataCredential_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "credential");
    private final static QName _AdapterFrameworkDataScheduleTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "scheduleTime");
    private final static QName _AdapterFrameworkDataInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "interface");
    private final static QName _AdapterFrameworkDataMessageType_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "messageType");
    private final static QName _AdapterFrameworkDataConnectionName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "connectionName");
    private final static QName _AdapterFrameworkDataSenderName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "senderName");
    private final static QName _AdapterFrameworkDataServiceDefinition_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "serviceDefinition");
    private final static QName _AdapterFrameworkDataRestartable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "restartable");
    private final static QName _AdapterFrameworkDataSenderParty_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "senderParty");
    private final static QName _AdapterFrameworkDataErrorCode_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "errorCode");
    private final static QName _AdapterFrameworkDataDirection_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "direction");
    private final static QName _AdapterFrameworkDataPersistUntil_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "persistUntil");
    private final static QName _AdapterFrameworkDataQualityOfService_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "qualityOfService");
    private final static QName _AdapterFrameworkDataScenarioIdentifier_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "scenarioIdentifier");
    private final static QName _AdapterFrameworkDataHeaders_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "headers");
    private final static QName _AdapterFrameworkDataSequenceNumber_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "sequenceNumber");
    private final static QName _AdapterFrameworkDataVersion_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "version");
    private final static QName _AdapterFrameworkDataEndTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "endTime");
    private final static QName _AdapterFrameworkDataMessageKey_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "messageKey");
    private final static QName _AdapterFrameworkDataReferenceID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "referenceID");
    private final static QName _AdapterFrameworkDataSenderInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "senderInterface");
    private final static QName _AdapterFrameworkDataValidUntil_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "validUntil");
    private final static QName _AdapterFrameworkDataBusinessMessage_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "businessMessage");
    private final static QName _AdapterFrameworkDataErrorCategory_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "errorCategory");
    private final static QName _AdapterFrameworkDataTransport_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "transport");
    private final static QName _AdapterFrameworkDataReceiverParty_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "receiverParty");
    private final static QName _AdapterFrameworkDataMessageID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "messageID");
    private final static QName _AdapterFrameworkDataPayloadPermissionWarning_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "payloadPermissionWarning");
    private final static QName _AdapterFrameworkDataWasEdited_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "wasEdited");
    private final static QName _AdapterFrameworkDataStartTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "startTime");
    private final static QName _AdapterFrameworkDataReceiverInterface_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "receiverInterface");
    private final static QName _AdapterFrameworkDataSoftwareComponent_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "softwareComponent");
    private final static QName _AdapterFrameworkDataBusinessAttributes_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "businessAttributes");
    private final static QName _AdapterFrameworkDataSerializationContext_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "serializationContext");
    private final static QName _AdapterFrameworkDataCancelable_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "cancelable");
    private final static QName _AdapterFrameworkDataReceiverName_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "receiverName");
    private final static QName _AdapterFilterMessageIDs_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "messageIDs");
    private final static QName _AdapterFilterToTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "toTime");
    private final static QName _AdapterFilterMessageFormat_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "messageFormat");
    private final static QName _AdapterFilterReferenceIDs_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "referenceIDs");
    private final static QName _AdapterFilterCorrelationID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "correlationID");
    private final static QName _AdapterFilterStatuses_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "statuses");
    private final static QName _AdapterFilterFromTime_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "fromTime");
    private final static QName _AdapterFilterSequenceID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "sequenceID");
    private final static QName _OperationFailedExceptionArgs_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "args");
    private final static QName _AdminActionResultMapResultList_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "resultList");
    private final static QName _AdminActionResultMapKeyList_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "keyList");
    private final static QName _AdminActionResultResultText_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "resultText");
    private final static QName _AdminActionResultResultCode_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "resultCode");
    private final static QName _LocaleCountry_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "country");
    private final static QName _LocaleVariant_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "variant");
    private final static QName _LocaleLanguage_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "language");
    private final static QName _StatusDetailText_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "text");
    private final static QName _StatusDetailErrorLabelID_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "errorLabelID");
    private final static QName _MessageSearchReturnValueDate_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "date");
    private final static QName _MessageSearchReturnValueList_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "list");
    private final static QName _BusinessAttributeValue_QNAME = new QName("urn:com.sap.aii.mdt.server.adapterframework.ws", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.adapterframework.server.mdt.aii.sap.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntegrationFlow }
     * 
     */
    public IntegrationFlow createIntegrationFlow() {
        return new IntegrationFlow();
    }

    /**
     * Create an instance of {@link AdapterFilter }
     * 
     */
    public AdapterFilter createAdapterFilter() {
        return new AdapterFilter();
    }

    /**
     * Create an instance of {@link OperationFailedException }
     * 
     */
    public OperationFailedException createOperationFailedException() {
        return new OperationFailedException();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessAttribute }
     * 
     */
    public ArrayOfBusinessAttribute createArrayOfBusinessAttribute() {
        return new ArrayOfBusinessAttribute();
    }

    /**
     * Create an instance of {@link AttributeMetadata }
     * 
     */
    public AttributeMetadata createAttributeMetadata() {
        return new AttributeMetadata();
    }

    /**
     * Create an instance of {@link MessageSearchReturnValue }
     * 
     */
    public MessageSearchReturnValue createMessageSearchReturnValue() {
        return new MessageSearchReturnValue();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeMetadata }
     * 
     */
    public ArrayOfAttributeMetadata createArrayOfAttributeMetadata() {
        return new ArrayOfAttributeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfAdapterFrameworkData }
     * 
     */
    public ArrayOfAdapterFrameworkData createArrayOfAdapterFrameworkData() {
        return new ArrayOfAdapterFrameworkData();
    }

    /**
     * Create an instance of {@link BusinessAttribute }
     * 
     */
    public BusinessAttribute createBusinessAttribute() {
        return new BusinessAttribute();
    }

    /**
     * Create an instance of {@link ArrayOfAdminActionResult }
     * 
     */
    public ArrayOfAdminActionResult createArrayOfAdminActionResult() {
        return new ArrayOfAdminActionResult();
    }

    /**
     * Create an instance of {@link ArrayOfStatusDetail }
     * 
     */
    public ArrayOfStatusDetail createArrayOfStatusDetail() {
        return new ArrayOfStatusDetail();
    }

    /**
     * Create an instance of {@link AdapterFrameworkData }
     * 
     */
    public AdapterFrameworkData createAdapterFrameworkData() {
        return new AdapterFrameworkData();
    }

    /**
     * Create an instance of {@link AdminActionResultMap }
     * 
     */
    public AdminActionResultMap createAdminActionResultMap() {
        return new AdminActionResultMap();
    }

    /**
     * Create an instance of {@link AdminActionResult }
     * 
     */
    public AdminActionResult createAdminActionResult() {
        return new AdminActionResult();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationFlow }
     * 
     */
    public ArrayOfIntegrationFlow createArrayOfIntegrationFlow() {
        return new ArrayOfIntegrationFlow();
    }

    /**
     * Create an instance of {@link InvalidKeyException }
     * 
     */
    public InvalidKeyException createInvalidKeyException() {
        return new InvalidKeyException();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link StatusDetail }
     * 
     */
    public StatusDetail createStatusDetail() {
        return new StatusDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "description", scope = IntegrationFlow.class)
    public JAXBElement<String> createIntegrationFlowDescription(String value) {
        return new JAXBElement<String>(_IntegrationFlowDescription_QNAME, String.class, IntegrationFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "name", scope = IntegrationFlow.class)
    public JAXBElement<String> createIntegrationFlowName(String value) {
        return new JAXBElement<String>(_IntegrationFlowName_QNAME, String.class, IntegrationFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "id", scope = IntegrationFlow.class)
    public JAXBElement<String> createIntegrationFlowId(String value) {
        return new JAXBElement<String>(_IntegrationFlowId_QNAME, String.class, IntegrationFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "status", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataStatus(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataStatus_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "applicationComponent", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataApplicationComponent(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataApplicationComponent_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "protocol", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataProtocol(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataProtocol_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "endpoint", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataEndpoint(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataEndpoint_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "editable", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataEditable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataEditable_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "credential", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataCredential(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataCredential_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "scheduleTime", scope = AdapterFrameworkData.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFrameworkDataScheduleTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataScheduleTime_QNAME, XMLGregorianCalendar.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "interface", scope = AdapterFrameworkData.class)
    public JAXBElement<MessageInterface> createAdapterFrameworkDataInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataInterface_QNAME, MessageInterface.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageType", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataMessageType(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataMessageType_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "connectionName", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataConnectionName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataConnectionName_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderName", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataSenderName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSenderName_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "serviceDefinition", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataServiceDefinition(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataServiceDefinition_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "restartable", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataRestartable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataRestartable_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderParty", scope = AdapterFrameworkData.class)
    public JAXBElement<MessageParty> createAdapterFrameworkDataSenderParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_AdapterFrameworkDataSenderParty_QNAME, MessageParty.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "errorCode", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataErrorCode(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataErrorCode_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "direction", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataDirection(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataDirection_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "persistUntil", scope = AdapterFrameworkData.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFrameworkDataPersistUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataPersistUntil_QNAME, XMLGregorianCalendar.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "qualityOfService", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataQualityOfService(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataQualityOfService_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "scenarioIdentifier", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataScenarioIdentifier(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataScenarioIdentifier_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "headers", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataHeaders(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataHeaders_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "sequenceNumber", scope = AdapterFrameworkData.class)
    public JAXBElement<Long> createAdapterFrameworkDataSequenceNumber(Long value) {
        return new JAXBElement<Long>(_AdapterFrameworkDataSequenceNumber_QNAME, Long.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "version", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataVersion(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataVersion_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "endTime", scope = AdapterFrameworkData.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFrameworkDataEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataEndTime_QNAME, XMLGregorianCalendar.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageKey", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataMessageKey(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataMessageKey_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "referenceID", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataReferenceID(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataReferenceID_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderInterface", scope = AdapterFrameworkData.class)
    public JAXBElement<MessageInterface> createAdapterFrameworkDataSenderInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataSenderInterface_QNAME, MessageInterface.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "validUntil", scope = AdapterFrameworkData.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFrameworkDataValidUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataValidUntil_QNAME, XMLGregorianCalendar.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "businessMessage", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataBusinessMessage(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataBusinessMessage_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "errorCategory", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataErrorCategory(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataErrorCategory_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "transport", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataTransport(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataTransport_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverParty", scope = AdapterFrameworkData.class)
    public JAXBElement<MessageParty> createAdapterFrameworkDataReceiverParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_AdapterFrameworkDataReceiverParty_QNAME, MessageParty.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageID", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataMessageID(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataMessageID_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "payloadPermissionWarning", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataPayloadPermissionWarning(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataPayloadPermissionWarning_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "wasEdited", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataWasEdited(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataWasEdited_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "startTime", scope = AdapterFrameworkData.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFrameworkDataStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataStartTime_QNAME, XMLGregorianCalendar.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverInterface", scope = AdapterFrameworkData.class)
    public JAXBElement<MessageInterface> createAdapterFrameworkDataReceiverInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataReceiverInterface_QNAME, MessageInterface.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "softwareComponent", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataSoftwareComponent(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSoftwareComponent_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "businessAttributes", scope = AdapterFrameworkData.class)
    public JAXBElement<ArrayOfBusinessAttribute> createAdapterFrameworkDataBusinessAttributes(ArrayOfBusinessAttribute value) {
        return new JAXBElement<ArrayOfBusinessAttribute>(_AdapterFrameworkDataBusinessAttributes_QNAME, ArrayOfBusinessAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "serializationContext", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataSerializationContext(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSerializationContext_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "cancelable", scope = AdapterFrameworkData.class)
    public JAXBElement<BooleanAttribute> createAdapterFrameworkDataCancelable(BooleanAttribute value) {
        return new JAXBElement<BooleanAttribute>(_AdapterFrameworkDataCancelable_QNAME, BooleanAttribute.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverName", scope = AdapterFrameworkData.class)
    public JAXBElement<String> createAdapterFrameworkDataReceiverName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataReceiverName_QNAME, String.class, AdapterFrameworkData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageIDs", scope = AdapterFilter.class)
    public JAXBElement<ArrayOfString> createAdapterFilterMessageIDs(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_AdapterFilterMessageIDs_QNAME, ArrayOfString.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "status", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterStatus(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataStatus_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "applicationComponent", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterApplicationComponent(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataApplicationComponent_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "protocol", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterProtocol(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataProtocol_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "toTime", scope = AdapterFilter.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFilterToTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFilterToTime_QNAME, XMLGregorianCalendar.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "scheduleTime", scope = AdapterFilter.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFilterScheduleTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataScheduleTime_QNAME, XMLGregorianCalendar.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageType", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterMessageType(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataMessageType_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "interface", scope = AdapterFilter.class)
    public JAXBElement<MessageInterface> createAdapterFilterInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataInterface_QNAME, MessageInterface.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "connectionName", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterConnectionName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataConnectionName_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageFormat", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterMessageFormat(String value) {
        return new JAXBElement<String>(_AdapterFilterMessageFormat_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderName", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterSenderName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSenderName_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "referenceIDs", scope = AdapterFilter.class)
    public JAXBElement<ArrayOfString> createAdapterFilterReferenceIDs(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_AdapterFilterReferenceIDs_QNAME, ArrayOfString.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "serviceDefinition", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterServiceDefinition(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataServiceDefinition_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "errorCode", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterErrorCode(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataErrorCode_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderParty", scope = AdapterFilter.class)
    public JAXBElement<MessageParty> createAdapterFilterSenderParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_AdapterFrameworkDataSenderParty_QNAME, MessageParty.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "persistUntil", scope = AdapterFilter.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFilterPersistUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataPersistUntil_QNAME, XMLGregorianCalendar.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "direction", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterDirection(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataDirection_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "qualityOfService", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterQualityOfService(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataQualityOfService_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "correlationID", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterCorrelationID(String value) {
        return new JAXBElement<String>(_AdapterFilterCorrelationID_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "statuses", scope = AdapterFilter.class)
    public JAXBElement<ArrayOfString> createAdapterFilterStatuses(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_AdapterFilterStatuses_QNAME, ArrayOfString.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "senderInterface", scope = AdapterFilter.class)
    public JAXBElement<MessageInterface> createAdapterFilterSenderInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataSenderInterface_QNAME, MessageInterface.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "validUntil", scope = AdapterFilter.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFilterValidUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFrameworkDataValidUntil_QNAME, XMLGregorianCalendar.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "fromTime", scope = AdapterFilter.class)
    public JAXBElement<XMLGregorianCalendar> createAdapterFilterFromTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdapterFilterFromTime_QNAME, XMLGregorianCalendar.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "errorCategory", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterErrorCategory(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataErrorCategory_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "transport", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterTransport(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataTransport_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverParty", scope = AdapterFilter.class)
    public JAXBElement<MessageParty> createAdapterFilterReceiverParty(MessageParty value) {
        return new JAXBElement<MessageParty>(_AdapterFrameworkDataReceiverParty_QNAME, MessageParty.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverInterface", scope = AdapterFilter.class)
    public JAXBElement<MessageInterface> createAdapterFilterReceiverInterface(MessageInterface value) {
        return new JAXBElement<MessageInterface>(_AdapterFrameworkDataReceiverInterface_QNAME, MessageInterface.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "softwareComponent", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterSoftwareComponent(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSoftwareComponent_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "receiverName", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterReceiverName(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataReceiverName_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "sequenceID", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterSequenceID(String value) {
        return new JAXBElement<String>(_AdapterFilterSequenceID_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "serializationContext", scope = AdapterFilter.class)
    public JAXBElement<String> createAdapterFilterSerializationContext(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataSerializationContext_QNAME, String.class, AdapterFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "args", scope = OperationFailedException.class)
    public JAXBElement<ArrayOfString> createOperationFailedExceptionArgs(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_OperationFailedExceptionArgs_QNAME, ArrayOfString.class, OperationFailedException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdminActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "resultList", scope = AdminActionResultMap.class)
    public JAXBElement<ArrayOfAdminActionResult> createAdminActionResultMapResultList(ArrayOfAdminActionResult value) {
        return new JAXBElement<ArrayOfAdminActionResult>(_AdminActionResultMapResultList_QNAME, ArrayOfAdminActionResult.class, AdminActionResultMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "keyList", scope = AdminActionResultMap.class)
    public JAXBElement<ArrayOfString> createAdminActionResultMapKeyList(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_AdminActionResultMapKeyList_QNAME, ArrayOfString.class, AdminActionResultMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "resultText", scope = AdminActionResult.class)
    public JAXBElement<String> createAdminActionResultResultText(String value) {
        return new JAXBElement<String>(_AdminActionResultResultText_QNAME, String.class, AdminActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "resultCode", scope = AdminActionResult.class)
    public JAXBElement<String> createAdminActionResultResultCode(String value) {
        return new JAXBElement<String>(_AdminActionResultResultCode_QNAME, String.class, AdminActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "country", scope = Locale.class)
    public JAXBElement<String> createLocaleCountry(String value) {
        return new JAXBElement<String>(_LocaleCountry_QNAME, String.class, Locale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "variant", scope = Locale.class)
    public JAXBElement<String> createLocaleVariant(String value) {
        return new JAXBElement<String>(_LocaleVariant_QNAME, String.class, Locale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "language", scope = Locale.class)
    public JAXBElement<String> createLocaleLanguage(String value) {
        return new JAXBElement<String>(_LocaleLanguage_QNAME, String.class, Locale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "messageKey", scope = InvalidKeyException.class)
    public JAXBElement<String> createInvalidKeyExceptionMessageKey(String value) {
        return new JAXBElement<String>(_AdapterFrameworkDataMessageKey_QNAME, String.class, InvalidKeyException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "description", scope = StatusDetail.class)
    public JAXBElement<String> createStatusDetailDescription(String value) {
        return new JAXBElement<String>(_IntegrationFlowDescription_QNAME, String.class, StatusDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "text", scope = StatusDetail.class)
    public JAXBElement<String> createStatusDetailText(String value) {
        return new JAXBElement<String>(_StatusDetailText_QNAME, String.class, StatusDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "errorLabelID", scope = StatusDetail.class)
    public JAXBElement<String> createStatusDetailErrorLabelID(String value) {
        return new JAXBElement<String>(_StatusDetailErrorLabelID_QNAME, String.class, StatusDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "description", scope = AttributeMetadata.class)
    public JAXBElement<String> createAttributeMetadataDescription(String value) {
        return new JAXBElement<String>(_IntegrationFlowDescription_QNAME, String.class, AttributeMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "name", scope = AttributeMetadata.class)
    public JAXBElement<String> createAttributeMetadataName(String value) {
        return new JAXBElement<String>(_IntegrationFlowName_QNAME, String.class, AttributeMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "date", scope = MessageSearchReturnValue.class)
    public JAXBElement<XMLGregorianCalendar> createMessageSearchReturnValueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageSearchReturnValueDate_QNAME, XMLGregorianCalendar.class, MessageSearchReturnValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdapterFrameworkData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "list", scope = MessageSearchReturnValue.class)
    public JAXBElement<ArrayOfAdapterFrameworkData> createMessageSearchReturnValueList(ArrayOfAdapterFrameworkData value) {
        return new JAXBElement<ArrayOfAdapterFrameworkData>(_MessageSearchReturnValueList_QNAME, ArrayOfAdapterFrameworkData.class, MessageSearchReturnValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "name", scope = BusinessAttribute.class)
    public JAXBElement<String> createBusinessAttributeName(String value) {
        return new JAXBElement<String>(_IntegrationFlowName_QNAME, String.class, BusinessAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", name = "value", scope = BusinessAttribute.class)
    public JAXBElement<String> createBusinessAttributeValue(String value) {
        return new JAXBElement<String>(_BusinessAttributeValue_QNAME, String.class, BusinessAttribute.class, value);
    }

}
