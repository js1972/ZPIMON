
package ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import lang.java2.ArrayOfString;


/**
 * <p>Java class for AdminActionResultMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminActionResultMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyList" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="resultList" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}ArrayOfAdminActionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminActionResultMap", propOrder = {
    "keyList",
    "resultList"
})
public class AdminActionResultMap {

    @XmlElementRef(name = "keyList", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> keyList;
    @XmlElementRef(name = "resultList", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAdminActionResult> resultList;

    /**
     * Gets the value of the keyList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getKeyList() {
        return keyList;
    }

    /**
     * Sets the value of the keyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setKeyList(JAXBElement<ArrayOfString> value) {
        this.keyList = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the resultList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdminActionResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdminActionResult> getResultList() {
        return resultList;
    }

    /**
     * Sets the value of the resultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdminActionResult }{@code >}
     *     
     */
    public void setResultList(JAXBElement<ArrayOfAdminActionResult> value) {
        this.resultList = ((JAXBElement<ArrayOfAdminActionResult> ) value);
    }

}
