
package ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageSearchReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSearchReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="list" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}ArrayOfAdapterFrameworkData" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="warning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayPermissionWarning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSearchReturnValue", propOrder = {
    "date",
    "list",
    "number",
    "warning",
    "displayPermissionWarning"
})
public class MessageSearchReturnValue {

    @XmlElementRef(name = "date", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> date;
    @XmlElementRef(name = "list", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAdapterFrameworkData> list;
    protected int number;
    protected boolean warning;
    protected boolean displayPermissionWarning;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDate(JAXBElement<XMLGregorianCalendar> value) {
        this.date = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdapterFrameworkData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdapterFrameworkData> getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdapterFrameworkData }{@code >}
     *     
     */
    public void setList(JAXBElement<ArrayOfAdapterFrameworkData> value) {
        this.list = ((JAXBElement<ArrayOfAdapterFrameworkData> ) value);
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     */
    public boolean isWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     */
    public void setWarning(boolean value) {
        this.warning = value;
    }

    /**
     * Gets the value of the displayPermissionWarning property.
     * 
     */
    public boolean isDisplayPermissionWarning() {
        return displayPermissionWarning;
    }

    /**
     * Sets the value of the displayPermissionWarning property.
     * 
     */
    public void setDisplayPermissionWarning(boolean value) {
        this.displayPermissionWarning = value;
    }

}
