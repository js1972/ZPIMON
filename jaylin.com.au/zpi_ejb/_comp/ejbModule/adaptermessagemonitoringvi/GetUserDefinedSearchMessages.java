
package adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.adapterframework.server.mdt.aii.sap.com.AdapterFilter;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfBusinessAttribute;


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
 *         &lt;element name="filter" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}AdapterFilter"/>
 *         &lt;element name="maxMessages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attributes" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}ArrayOfBusinessAttribute"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "maxMessages",
    "attributes",
    "operator"
})
@XmlRootElement(name = "getUserDefinedSearchMessages")
public class GetUserDefinedSearchMessages {

    @XmlElement(required = true, nillable = true)
    protected AdapterFilter filter;
    @XmlElementRef(name = "maxMessages", namespace = "urn:AdapterMessageMonitoringVi", type = JAXBElement.class)
    protected JAXBElement<Integer> maxMessages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfBusinessAttribute attributes;
    @XmlElement(required = true, nillable = true)
    protected String operator;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link AdapterFilter }
     *     
     */
    public AdapterFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdapterFilter }
     *     
     */
    public void setFilter(AdapterFilter value) {
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

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBusinessAttribute }
     *     
     */
    public ArrayOfBusinessAttribute getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBusinessAttribute }
     *     
     */
    public void setAttributes(ArrayOfBusinessAttribute value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
