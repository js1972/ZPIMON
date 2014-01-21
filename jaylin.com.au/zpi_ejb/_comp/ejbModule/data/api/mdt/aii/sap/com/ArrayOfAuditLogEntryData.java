
package data.api.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAuditLogEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAuditLogEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditLogEntryData" type="{urn:com.sap.aii.mdt.api.data}AuditLogEntryData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuditLogEntryData", propOrder = {
    "auditLogEntryData"
})
public class ArrayOfAuditLogEntryData {

    @XmlElement(name = "AuditLogEntryData", nillable = true)
    protected List<AuditLogEntryData> auditLogEntryData;

    /**
     * Gets the value of the auditLogEntryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditLogEntryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLogEntryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditLogEntryData }
     * 
     * 
     */
    public List<AuditLogEntryData> getAuditLogEntryData() {
        if (auditLogEntryData == null) {
            auditLogEntryData = new ArrayList<AuditLogEntryData>();
        }
        return this.auditLogEntryData;
    }

}
