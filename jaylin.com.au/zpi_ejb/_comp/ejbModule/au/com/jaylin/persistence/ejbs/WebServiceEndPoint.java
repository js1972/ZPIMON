package au.com.jaylin.persistence.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import adaptermessagemonitoringwsd.AdapterMessageMonitoring;
import adaptermessagemonitoringwsd.AdapterMessageMonitoringVi;

/**
 * Session Bean implementation class WebServiceEndPoint
 */
@Stateless
public class WebServiceEndPoint implements WebServiceEndPointLocal {
	@EJB
	ApplicationPropertiesLocal properties;
	
	@WebServiceRef(name="AdapterMessageMonitoring")
    private AdapterMessageMonitoring webServiceReference;
	
	AdapterMessageMonitoringVi port;
	
	
    public WebServiceEndPoint() {
    }

    @PostConstruct
    public void postInjectionConstructor() {
    	port = webServiceReference.getBasicPort();
    	BindingProvider bp = (BindingProvider)port;
		
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, properties.getUsername());
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, properties.getPassword());
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, properties.getHostUrl() + "/AdapterMessageMonitoring/basic?style=document");
    }
        
    public AdapterMessageMonitoringVi call() {
    	return port;
    }
}
