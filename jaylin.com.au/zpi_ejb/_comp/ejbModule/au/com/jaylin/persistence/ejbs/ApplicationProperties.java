package au.com.jaylin.persistence.ejbs;

import java.util.Properties;

import javax.ejb.Stateless;
import javax.naming.InitialContext;
import com.sap.engine.services.configuration.appconfiguration.ApplicationPropertiesAccess;

import com.sap.tc.logging.Location;

/**
 * Session Bean implementation class ApplicationProperties
 * 
 * This class reads application properties as defined in NetWeaver Administrator under:
 * Java System Properties -> Applications -> zpi_app jaylin.com.au
 * 
 * These properties are *primed* by the file sap.application.global.properties in the 
 * Application META-INF folder. Future changes shall only be performed in NWA.
 * The properties managed here are for the logon to the PI AEX system to call web
 * services: Hostname:port, username, password.
 * 
 */
@Stateless
public class ApplicationProperties implements ApplicationPropertiesLocal {
	private static final String HOST_URL = "HOST_URL";
	private static final String USERNAME = "USERNAME";
	private static final String PASSWORD = "PASSWORD";
	
	private Location logger = Location.getLocation("pimon.application.properties");
	private String hostUrl;
	private String username;
	private String password;
	
    public ApplicationProperties() {
    	logger.infoT("Creating the logger");
    	try {
    		InitialContext ctx = new InitialContext();
    		ApplicationPropertiesAccess appConfigAccess = (ApplicationPropertiesAccess) ctx.lookup("ApplicationConfiguration");
    		Properties appProps = appConfigAccess.getApplicationProperties();
    		
    		logger.infoT("Properties file loaded");
    		
    		hostUrl = appProps.getProperty(HOST_URL);
    		username = appProps.getProperty(USERNAME);
    		password = appProps.getProperty(PASSWORD);
    	}
    	catch (Exception e) {
    		logger.errorT("EXCEPTION: " + e.getMessage());
    		throw new RuntimeException("UNABLE TO READ APPLICATION PROPERTIES : " + e.getMessage());
    	}
    }

	public String getHostUrl() {
		return hostUrl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
