
package data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lang.java.Comparable;
import lang.java2.ArrayOfString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data.api.mdt.aii.sap.com package. 
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

    private final static QName _MessageInterfaceName_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "name");
    private final static QName _MessageInterfaceNamespace_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "namespace");
    private final static QName _AuditLogEntryDataTimeStamp_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "timeStamp");
    private final static QName _AuditLogEntryDataLocalizedText_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "localizedText");
    private final static QName _AuditLogEntryDataStatus_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "status");
    private final static QName _AuditLogEntryDataTextKey_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "textKey");
    private final static QName _AuditLogEntryDataParams_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "params");
    private final static QName _MessagePartySchema_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "schema");
    private final static QName _MessagePartyAgency_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "agency");
    private final static QName _BooleanAttributeValue_QNAME = new QName("urn:com.sap.aii.mdt.api.data", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data.api.mdt.aii.sap.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageInterface }
     * 
     */
    public MessageInterface createMessageInterface() {
        return new MessageInterface();
    }

    /**
     * Create an instance of {@link AttributeValue }
     * 
     */
    public AttributeValue createAttributeValue() {
        return new AttributeValue();
    }

    /**
     * Create an instance of {@link ArrayOfMessageParty }
     * 
     */
    public ArrayOfMessageParty createArrayOfMessageParty() {
        return new ArrayOfMessageParty();
    }

    /**
     * Create an instance of {@link ArrayOfMessageInterface }
     * 
     */
    public ArrayOfMessageInterface createArrayOfMessageInterface() {
        return new ArrayOfMessageInterface();
    }

    /**
     * Create an instance of {@link BooleanAttribute }
     * 
     */
    public BooleanAttribute createBooleanAttribute() {
        return new BooleanAttribute();
    }

    /**
     * Create an instance of {@link WrapperAttribute }
     * 
     */
    public WrapperAttribute createWrapperAttribute() {
        return new WrapperAttribute();
    }

    /**
     * Create an instance of {@link AuditLogEntryData }
     * 
     */
    public AuditLogEntryData createAuditLogEntryData() {
        return new AuditLogEntryData();
    }

    /**
     * Create an instance of {@link MessageParty }
     * 
     */
    public MessageParty createMessageParty() {
        return new MessageParty();
    }

    /**
     * Create an instance of {@link ArrayOfAuditLogEntryData }
     * 
     */
    public ArrayOfAuditLogEntryData createArrayOfAuditLogEntryData() {
        return new ArrayOfAuditLogEntryData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "name", scope = MessageInterface.class)
    public JAXBElement<String> createMessageInterfaceName(String value) {
        return new JAXBElement<String>(_MessageInterfaceName_QNAME, String.class, MessageInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "namespace", scope = MessageInterface.class)
    public JAXBElement<String> createMessageInterfaceNamespace(String value) {
        return new JAXBElement<String>(_MessageInterfaceNamespace_QNAME, String.class, MessageInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "timeStamp", scope = AuditLogEntryData.class)
    public JAXBElement<XMLGregorianCalendar> createAuditLogEntryDataTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AuditLogEntryDataTimeStamp_QNAME, XMLGregorianCalendar.class, AuditLogEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "localizedText", scope = AuditLogEntryData.class)
    public JAXBElement<String> createAuditLogEntryDataLocalizedText(String value) {
        return new JAXBElement<String>(_AuditLogEntryDataLocalizedText_QNAME, String.class, AuditLogEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "status", scope = AuditLogEntryData.class)
    public JAXBElement<String> createAuditLogEntryDataStatus(String value) {
        return new JAXBElement<String>(_AuditLogEntryDataStatus_QNAME, String.class, AuditLogEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "textKey", scope = AuditLogEntryData.class)
    public JAXBElement<String> createAuditLogEntryDataTextKey(String value) {
        return new JAXBElement<String>(_AuditLogEntryDataTextKey_QNAME, String.class, AuditLogEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "params", scope = AuditLogEntryData.class)
    public JAXBElement<ArrayOfString> createAuditLogEntryDataParams(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_AuditLogEntryDataParams_QNAME, ArrayOfString.class, AuditLogEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "name", scope = MessageParty.class)
    public JAXBElement<String> createMessagePartyName(String value) {
        return new JAXBElement<String>(_MessageInterfaceName_QNAME, String.class, MessageParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "schema", scope = MessageParty.class)
    public JAXBElement<String> createMessagePartySchema(String value) {
        return new JAXBElement<String>(_MessagePartySchema_QNAME, String.class, MessageParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "agency", scope = MessageParty.class)
    public JAXBElement<String> createMessagePartyAgency(String value) {
        return new JAXBElement<String>(_MessagePartyAgency_QNAME, String.class, MessageParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "value", scope = BooleanAttribute.class)
    public JAXBElement<Boolean> createBooleanAttributeValue(Boolean value) {
        return new JAXBElement<Boolean>(_BooleanAttributeValue_QNAME, Boolean.class, BooleanAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comparable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data", name = "value", scope = WrapperAttribute.class)
    public JAXBElement<Comparable> createWrapperAttributeValue(Comparable value) {
        return new JAXBElement<Comparable>(_BooleanAttributeValue_QNAME, Comparable.class, WrapperAttribute.class, value);
    }

}
