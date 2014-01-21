package au.com.jaylin.persistence.ejbs;

import javax.ejb.Local;

import adaptermessagemonitoringwsd.AdapterMessageMonitoringVi;

@Local
public interface WebServiceEndPointLocal {
	public AdapterMessageMonitoringVi call();
}
