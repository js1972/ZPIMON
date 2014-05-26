package au.com.jaylin.persistence.ejbs;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface ApplicationPropertiesLocal {
	public String getHostUrl();
	public String getUsername();
	public String getPassword();
	public int getMessageMaxResults();
	public Date getBaseDate();
	public int getLogEntryMaxResults();
}
