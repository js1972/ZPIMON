package au.com.jaylin.persistence.ejbs;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.sap.engine.services.configuration.appconfiguration.ApplicationPropertiesAccess;
import com.sap.engine.services.configuration.appconfiguration.ApplicationPropertiesChangeListener;


@RunWith(MockitoJUnitRunner.class)
public class ApplicationProperties_Test {
	
	@Mock
	InitialContext ctx;
	
	@InjectMocks
	ApplicationProperties appProperties;
	
	@Test
	public void testCreateApplicationProperties() throws NamingException {
		when((ApplicationPropertiesAccess)ctx.lookup("ApplicationConfiguration")).thenReturn(new ApplicationPropertiesAccess() {
			
			@Override
			public void removeApplicationPropertiesChangedListener(
					ApplicationPropertiesChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Properties getSystemProfile() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Properties getApplicationProperties() {
				// build up test double for java properties object
				Properties p = new Properties();
				p.setProperty("HOST_URL", "http://abc.company.com:50001");
				return p;
			}
			
			@Override
			public void addApplicationPropertiesChangedListener(
					ApplicationPropertiesChangeListener arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
//		String url = appProperties.getHostUrl();
	}
}
