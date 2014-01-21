package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException")
public class GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException _GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo){
    super(message);
    this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo, Throwable cause){
    super(message, cause);
    this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException getFaultInfo(){
    return this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
  }

}
