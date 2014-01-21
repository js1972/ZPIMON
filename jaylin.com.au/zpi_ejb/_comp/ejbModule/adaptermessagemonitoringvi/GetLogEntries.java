
package adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws.adapterframework.server.mdt.aii.sap.com.Locale;


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
 *         &lt;element name="messageKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="locale" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}Locale" minOccurs="0"/>
 *         &lt;element name="olderThan" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "messageKey",
    "archive",
    "maxResults",
    "locale",
    "olderThan"
})
@XmlRootElement(name = "getLogEntries")
public class GetLogEntries {

    @XmlElement(required = true, nillable = true)
    protected String messageKey;
    protected boolean archive;
    protected Integer maxResults;
    @XmlElementRef(name = "locale", namespace = "urn:AdapterMessageMonitoringVi", type = JAXBElement.class)
    protected JAXBElement<Locale> locale;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar olderThan;

    /**
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageKey(String value) {
        this.messageKey = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     */
    public void setArchive(boolean value) {
        this.archive = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = ((JAXBElement<Locale> ) value);
    }

    /**
     * Gets the value of the olderThan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOlderThan() {
        return olderThan;
    }

    /**
     * Sets the value of the olderThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOlderThan(XMLGregorianCalendar value) {
        this.olderThan = value;
    }

}
