
package ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import exception.sap.com.BaseException;
import lang.java2.ArrayOfString;


/**
 * <p>Java class for OperationFailedException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationFailedException">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.exception}BaseException">
 *       &lt;sequence>
 *         &lt;element name="args" type="{urn:java/lang}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationFailedException", propOrder = {
    "args",
    "code"
})
public class OperationFailedException
    extends BaseException
{

    @XmlElementRef(name = "args", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> args;
    protected int code;

    /**
     * Gets the value of the args property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setArgs(JAXBElement<ArrayOfString> value) {
        this.args = ((JAXBElement<ArrayOfString> ) value);
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

}
