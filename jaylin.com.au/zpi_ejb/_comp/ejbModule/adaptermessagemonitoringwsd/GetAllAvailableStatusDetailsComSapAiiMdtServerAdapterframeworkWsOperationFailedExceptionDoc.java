package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getAllAvailableStatusDetails_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException")
public class GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException _GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  public GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo){
    super(message);
    this._GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo, Throwable cause){
    super(message, cause);
    this._GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException getFaultInfo(){
    return this._GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
  }

}
