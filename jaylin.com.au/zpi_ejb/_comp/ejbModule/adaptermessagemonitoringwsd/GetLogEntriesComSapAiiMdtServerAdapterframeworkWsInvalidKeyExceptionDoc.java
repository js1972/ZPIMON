package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException")
public class GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException _GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo){
    super(message);
    this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo, Throwable cause){
    super(message, cause);
    this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException getFaultInfo(){
    return this._GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
  }

}
