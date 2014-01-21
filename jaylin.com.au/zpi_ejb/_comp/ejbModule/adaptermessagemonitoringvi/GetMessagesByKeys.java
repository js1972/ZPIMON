
package adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lang.java2.ArrayOfString;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{urn:java/lang}ArrayOfString"/>
 *         &lt;element name="maxMessages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filter",
    "maxMessages"
})
@XmlRootElement(name = "getMessagesByKeys")
public class GetMessagesByKeys {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString filter;
    @XmlElementRef(name = "maxMessages", namespace = "urn:AdapterMessageMonitoringVi", type = JAXBElement.class)
    protected JAXBElement<Integer> maxMessages;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFilter(ArrayOfString value) {
        this.filter = value;
    }

    /**
     * Gets the value of the maxMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxMessages() {
        return maxMessages;
    }

    /**
     * Sets the value of the maxMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxMessages(JAXBElement<Integer> value) {
        this.maxMessages = ((JAXBElement<Integer> ) value);
    }

}
