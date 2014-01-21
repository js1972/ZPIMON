
package esiext.data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMessageFilterExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMessageFilterExt">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.aii.mdt.api.data.esiext}MessageFilterExt">
 *       &lt;sequence>
 *         &lt;element name="applicationComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softwareComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMessageFilterExt", propOrder = {
    "applicationComponent",
    "serviceDefinition",
    "softwareComponent"
})
public class WSMessageFilterExt
    extends MessageFilterExt
{

    @XmlElementRef(name = "applicationComponent", namespace = "urn:com.sap.aii.mdt.api.data.esiext", type = JAXBElement.class)
    protected JAXBElement<String> applicationComponent;
    @XmlElementRef(name = "serviceDefinition", namespace = "urn:com.sap.aii.mdt.api.data.esiext", type = JAXBElement.class)
    protected JAXBElement<String> serviceDefinition;
    @XmlElementRef(name = "softwareComponent", namespace = "urn:com.sap.aii.mdt.api.data.esiext", type = JAXBElement.class)
    protected JAXBElement<String> softwareComponent;

    /**
     * Gets the value of the applicationComponent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationComponent() {
        return applicationComponent;
    }

    /**
     * Sets the value of the applicationComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationComponent(JAXBElement<String> value) {
        this.applicationComponent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serviceDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceDefinition() {
        return serviceDefinition;
    }

    /**
     * Sets the value of the serviceDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceDefinition(JAXBElement<String> value) {
        this.serviceDefinition = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the softwareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoftwareComponent() {
        return softwareComponent;
    }

    /**
     * Sets the value of the softwareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoftwareComponent(JAXBElement<String> value) {
        this.softwareComponent = ((JAXBElement<String> ) value);
    }

}
