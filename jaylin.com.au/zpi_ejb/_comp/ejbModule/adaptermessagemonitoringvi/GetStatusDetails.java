
package adaptermessagemonitoringvi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lang.java2.ArrayOfString;
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
 *         &lt;element name="errorCodes" type="{urn:java/lang}ArrayOfString"/>
 *         &lt;element name="locale" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}Locale"/>
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
    "errorCodes",
    "locale"
})
@XmlRootElement(name = "getStatusDetails")
public class GetStatusDetails {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString errorCodes;
    @XmlElement(required = true, nillable = true)
    protected Locale locale;

    /**
     * Gets the value of the errorCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getErrorCodes() {
        return errorCodes;
    }

    /**
     * Sets the value of the errorCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setErrorCodes(ArrayOfString value) {
        this.errorCodes = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

}
