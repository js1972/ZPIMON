
package data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageParty">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.aii.mdt.api.data}AttributeValue">
 *       &lt;sequence>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageParty", propOrder = {
    "agency",
    "name",
    "schema"
})
public class MessageParty
    extends AttributeValue
{

    @XmlElementRef(name = "agency", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> agency;
    @XmlElementRef(name = "name", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "schema", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> schema;

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgency(JAXBElement<String> value) {
        this.agency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchema(JAXBElement<String> value) {
        this.schema = ((JAXBElement<String> ) value);
    }

}
