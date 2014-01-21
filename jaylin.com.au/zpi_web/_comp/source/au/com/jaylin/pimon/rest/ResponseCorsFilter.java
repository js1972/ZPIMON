package au.com.jaylin.pimon.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class ResponseCorsFilter implements ContainerResponseFilter {
	
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		responseContext.getHeaders().add("Access-Control-Allow-Credentials", true);
		responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		
		List<String> reqHead = requestContext.getHeaders().get("Access-Control-Request-Headers");
		if(null != reqHead) {
			responseContext.getHeaders().put("Access-Control-Allow-Headers", new ArrayList<Object>(reqHead));
		}
	}
}
