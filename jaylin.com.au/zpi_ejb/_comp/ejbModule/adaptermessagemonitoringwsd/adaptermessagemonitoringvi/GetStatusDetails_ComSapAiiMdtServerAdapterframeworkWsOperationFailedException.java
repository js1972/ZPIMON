
package adaptermessagemonitoringwsd.adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException;

public class GetStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException
    extends JAXBElement<OperationFailedException>
{

    protected final static QName NAME = new QName("urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", "getStatusDetails_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException");

    public GetStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException(OperationFailedException value) {
        super(NAME, ((Class) OperationFailedException.class), null, value);
    }

    public GetStatusDetails_ComSapAiiMdtServerAdapterframeworkWsOperationFailedException() {
        super(NAME, ((Class) OperationFailedException.class), null, null);
    }

}
