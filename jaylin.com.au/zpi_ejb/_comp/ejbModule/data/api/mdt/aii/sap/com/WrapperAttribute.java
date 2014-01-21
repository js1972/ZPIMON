
package data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import lang.java.Comparable;


/**
 * <p>Java class for WrapperAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrapperAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.aii.mdt.api.data}AttributeValue">
 *       &lt;sequence>
 *         &lt;element name="value" type="{urn:java.lang}Comparable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrapperAttribute", propOrder = {
    "value"
})
public class WrapperAttribute
    extends AttributeValue
{

    @XmlElementRef(name = "value", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<Comparable> value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Comparable }{@code >}
     *     
     */
    public JAXBElement<Comparable> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Comparable }{@code >}
     *     
     */
    public void setValue(JAXBElement<Comparable> value) {
        this.value = ((JAXBElement<Comparable> ) value);
    }

}
