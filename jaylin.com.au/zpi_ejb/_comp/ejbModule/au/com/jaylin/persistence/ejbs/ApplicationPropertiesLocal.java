package au.com.jaylin.persistence.ejbs;
import javax.ejb.Local;

@Local
public interface ApplicationPropertiesLocal {
	public String getHostUrl();
	public String getUsername();
	public String getPassword();
}
