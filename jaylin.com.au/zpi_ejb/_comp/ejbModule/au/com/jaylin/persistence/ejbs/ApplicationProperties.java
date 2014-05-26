package au.com.jaylin.persistence.ejbs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
	private static final String BASE_DATE = "BASE_DATE";
	private static final String MESSAGE_MAX_RESULTS = "MESSAGE_MAX_RESULTS";
	private static final String LOG_ENTRY_MAX_RESULTS = "LOG_ENTRY_MAX_RESULTS";
	
	private Location logger = Location.getLocation("pimon.application.properties");
	private String hostUrl;
	private String username;
	private String password;
	private String baseDate;
	private String messageMaxResults;
	private String logEntryMaxResults;
	
    public ApplicationProperties() {
    	try {
    		InitialContext ctx = new InitialContext();
    		ApplicationPropertiesAccess appConfigAccess = (ApplicationPropertiesAccess) ctx.lookup("ApplicationConfiguration");
    		Properties appProps = appConfigAccess.getApplicationProperties();
    		
    		logger.infoT("Properties file loaded");
    		
    		hostUrl = appProps.getProperty(HOST_URL);
    		username = appProps.getProperty(USERNAME);
    		password = appProps.getProperty(PASSWORD);
    		baseDate = appProps.getProperty(BASE_DATE);
    		messageMaxResults = appProps.getProperty(MESSAGE_MAX_RESULTS);
    		logEntryMaxResults = appProps.getProperty(LOG_ENTRY_MAX_RESULTS);
    	}
    	catch (Exception e) {
    		logger.errorT("EXCEPTION: " + e.getMessage());
    		throw new RuntimeException("UNABLE TO READ APPLICATION PROPERTIES: " + e.getMessage());
    	}
    	
//    	// check entered url - remove trailing slash if it exists and check for protocol
//    	if (hostUrl.endsWith("/")) {
//    		hostUrl = hostUrl.substring(0, hostUrl.length() - 1);
//    	}
//    	if (!hostUrl.matches("^(http|https)://")) {
//    		logger.errorT("ApplicationProperties exception: Invalid host url provided. Missing protocol (http|https)");
//    		throw new RuntimeException("ApplicationProperties: Invalid host url provided. Missing protocol (http|https)");
//    	}
//    	
//    	// check entered start date follows dd/mm/yyyy or dd-mm-yyyy pattern (note: backslashes are escaped by another backslash)
//    	if (!startDate.matches("/(\\d+)(-|\\/)(\\d+)(?:-|\\/)(?:(\\d+)\\s+(\\d+):(\\d+)(?::(\\d+))?(?:\\.(\\d+))?)?/")) {
//    		logger.errorT("ApplicationProperties exception: Invalid start_date provided. Format must be dd/mm/yyyy or dd-mm-yyyy: " + startDate);
//    		throw new RuntimeException("ApplicationProperties exception: Invalid start_date provided. Format must be dd/mm/yyyy or dd-mm-yyyy: " + startDate);
//    	}
//    	
//    	if (Integer.parseInt(maxResults) == 0) {
//    		logger.errorT("ApplicationProperties exception: max_results cannot be 0");
//    		throw new RuntimeException("ApplicationProperties exception: max_results cannot be 0");
//    	}
    }

	public String getHostUrl() {
		return hostUrl;
	}

	public String getUsername() {
		if (username.equals("")) {
			throw new RuntimeException("ApplicationProperties exception: Enter a username");
		}
		return username;
	}

	public String getPassword() {
		if (password.equals("")) {
			throw new RuntimeException("ApplicationProperties exception: Enter a password");
		}
		return password;
	}
	
	public Date getBaseDate() {
		Date d = null;
		
		try {
			d = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(baseDate);
		} catch (ParseException e) {
			throw new RuntimeException("ApplicationProperties exception: Unable to parse start_date: " + baseDate);
		};
		
		return d;
	}
	
	public int getMessageMaxResults() {
		return Integer.parseInt(messageMaxResults);
	}
	
	public int getLogEntryMaxResults() {
		return Integer.parseInt(logEntryMaxResults);
	}	
}
