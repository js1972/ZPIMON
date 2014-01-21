
package adaptermessagemonitoringwsd.adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException;

public class GetAllAvailableStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException
    extends JAXBElement<OperationFailedException>
{

    protected final static QName NAME = new QName("urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", "getAllAvailableStatusDetails_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException");

    public GetAllAvailableStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException(OperationFailedException value) {
        super(NAME, ((Class) OperationFailedException.class), null, value);
    }

    public GetAllAvailableStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException() {
        super(NAME, ((Class) OperationFailedException.class), null, null);
    }

}
