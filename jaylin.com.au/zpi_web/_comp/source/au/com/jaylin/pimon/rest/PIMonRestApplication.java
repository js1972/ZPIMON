package au.com.jaylin.pimon.rest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Jersey Resource Config class. This is where you setup the Jersey application.
 * The web.xml points to this.
 * The packages method allows us to specify what packages Jersey is to search for classes.
 * The register method allows us to register things like filter classes (as is used here 
 * for setting CORS headers).
 *  
 * @author jscott
 *
 */
public class PIMonRestApplication extends ResourceConfig {
	public PIMonRestApplication() {
        packages(true, "au.com.jaylin.pimon.rest");   
        register(au.com.jaylin.pimon.rest.ResponseCorsFilter.class);
    }
}
