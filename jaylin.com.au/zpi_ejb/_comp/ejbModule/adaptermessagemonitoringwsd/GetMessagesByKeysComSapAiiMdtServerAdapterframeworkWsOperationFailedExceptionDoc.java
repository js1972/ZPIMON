package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getMessagesByKeys_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException")
public class GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException _GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  public GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo){
    super(message);
    this._GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo, Throwable cause){
    super(message, cause);
    this._GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException getFaultInfo(){
    return this._GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
  }

}
