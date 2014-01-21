
package esiext.data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esiext.data.api.mdt.aii.sap.com package. 
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

    private final static QName _WSMessageFilterExtApplicationComponent_QNAME = new QName("urn:com.sap.aii.mdt.api.data.esiext", "applicationComponent");
    private final static QName _WSMessageFilterExtServiceDefinition_QNAME = new QName("urn:com.sap.aii.mdt.api.data.esiext", "serviceDefinition");
    private final static QName _WSMessageFilterExtSoftwareComponent_QNAME = new QName("urn:com.sap.aii.mdt.api.data.esiext", "softwareComponent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esiext.data.api.mdt.aii.sap.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageFilterExt }
     * 
     */
    public MessageFilterExt createMessageFilterExt() {
        return new MessageFilterExt();
    }

    /**
     * Create an instance of {@link WSMessageFilterExt }
     * 
     */
    public WSMessageFilterExt createWSMessageFilterExt() {
        return new WSMessageFilterExt();
    }

    /**
     * Create an instance of {@link WSMessageDataExt }
     * 
     */
    public WSMessageDataExt createWSMessageDataExt() {
        return new WSMessageDataExt();
    }

    /**
     * Create an instance of {@link MessageDataExt }
     * 
     */
    public MessageDataExt createMessageDataExt() {
        return new MessageDataExt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data.esiext", name = "applicationComponent", scope = WSMessageFilterExt.class)
    public JAXBElement<String> createWSMessageFilterExtApplicationComponent(String value) {
        return new JAXBElement<String>(_WSMessageFilterExtApplicationComponent_QNAME, String.class, WSMessageFilterExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data.esiext", name = "serviceDefinition", scope = WSMessageFilterExt.class)
    public JAXBElement<String> createWSMessageFilterExtServiceDefinition(String value) {
        return new JAXBElement<String>(_WSMessageFilterExtServiceDefinition_QNAME, String.class, WSMessageFilterExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.sap.aii.mdt.api.data.esiext", name = "softwareComponent", scope = WSMessageFilterExt.class)
    public JAXBElement<String> createWSMessageFilterExtSoftwareComponent(String value) {
        return new JAXBElement<String>(_WSMessageFilterExtSoftwareComponent_QNAME, String.class, WSMessageFilterExt.class, value);
    }

}
