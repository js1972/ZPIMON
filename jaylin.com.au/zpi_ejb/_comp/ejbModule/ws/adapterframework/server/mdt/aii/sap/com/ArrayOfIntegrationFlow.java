
package ws.adapterframework.server.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegrationFlow" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}IntegrationFlow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationFlow", propOrder = {
    "integrationFlow"
})
public class ArrayOfIntegrationFlow {

    @XmlElement(name = "IntegrationFlow", nillable = true)
    protected List<IntegrationFlow> integrationFlow;

    /**
     * Gets the value of the integrationFlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationFlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationFlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegrationFlow }
     * 
     * 
     */
    public List<IntegrationFlow> getIntegrationFlow() {
        if (integrationFlow == null) {
            integrationFlow = new ArrayList<IntegrationFlow>();
        }
        return this.integrationFlow;
    }

}
