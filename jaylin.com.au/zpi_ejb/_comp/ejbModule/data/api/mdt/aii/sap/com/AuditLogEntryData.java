
package data.api.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lang.java2.ArrayOfString;


/**
 * <p>Java class for AuditLogEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditLogEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="textKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="params" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditLogEntryData", propOrder = {
    "timeStamp",
    "textKey",
    "params",
    "status",
    "localizedText"
})
public class AuditLogEntryData {

    @XmlElementRef(name = "timeStamp", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> timeStamp;
    @XmlElementRef(name = "textKey", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> textKey;
    @XmlElementRef(name = "params", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> params;
    @XmlElementRef(name = "status", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "localizedText", namespace = "urn:com.sap.aii.mdt.api.data", type = JAXBElement.class)
    protected JAXBElement<String> localizedText;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTimeStamp(JAXBElement<XMLGregorianCalendar> value) {
        this.timeStamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the textKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextKey() {
        return textKey;
    }

    /**
     * Sets the value of the textKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextKey(JAXBElement<String> value) {
        this.textKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setParams(JAXBElement<ArrayOfString> value) {
        this.params = ((JAXBElement<ArrayOfString> ) value);
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
     * Gets the value of the localizedText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalizedText() {
        return localizedText;
    }

    /**
     * Sets the value of the localizedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalizedText(JAXBElement<String> value) {
        this.localizedText = ((JAXBElement<String> ) value);
    }

}
