package com.jsonasdataprovider.base.page;

import java.sql.Connection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.jsonasdataprovider.core.constants.TestConstantsJson;

public class JsonasDataProviderRunnnerbase extends PropertiesBase implements TestConstantsJson {
	
	  protected PropertiesBase properties;
	    
	    
		
	    /** The Connection */
//	    public static Connection oracleServerConnection;   
//	    public static Connection sqlServerConnection;
//	    public static Connection profileConnection;
	    
	    //connection to SQl server, oracle server can be done here....
	    
	    //@before test method. before suite will be written here.
	    /** The logger */
		private static final Logger logger = LogManager.getLogger(JsonasDataProviderRunnnerbase.class.getName());
	    /**
	     * Constructor
	     */
		public JsonasDataProviderRunnnerbase() {
			properties = new PropertiesBase();
			
		}
	    @BeforeTest
	    public void connectedtoDB(){
	    	
	    }
	    
	    public PropertiesBase getProperties() {
	        return properties;
	    }

	    public void setProperties(PropertiesBase properties) {
	        this.properties = properties;
	    }
	  	
	    @BeforeSuite(alwaysRun = true)
	    @Parameters({"browser",
	    	    "username","applicationName",
	            "password"})
	    public void setUpBeforeSuite(String browser, String username, String applicationName, String password ) throws Exception {
	        logger.info("Setting up the test class...");
	        try {
	            properties.setUsername(username);
	            properties.setApplicationName(applicationName);
	            properties.setBrowser(browser);
	            properties.setPassword(password);
	          
	            logger.info("\nTest properties: "
	                    + "\nUsername: " + properties.getUsername() + ", "
	                    + "\nPassword: " + properties.getPassword() + ", "
	                    + "\nbrowser: " + properties.getBrowser() + ", "
	                    + "\napplicationName: " + properties.getApplicationName() );            
	        } catch (Exception error) {
	            logger.error(error.getMessage());
	            Assert.fail(error.getMessage());
	        }
	        logger.info("Setup the test class.");
	    }

}
