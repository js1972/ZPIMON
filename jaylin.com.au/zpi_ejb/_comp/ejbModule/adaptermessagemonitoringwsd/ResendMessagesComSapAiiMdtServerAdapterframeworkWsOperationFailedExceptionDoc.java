package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "resendMessages_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException")
public class ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException _ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  public ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo){
    super(message);
    this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo, Throwable cause){
    super(message, cause);
    this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException getFaultInfo(){
    return this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
  }

}
