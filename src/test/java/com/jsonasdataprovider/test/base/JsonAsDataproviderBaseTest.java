package com.jsonasdataprovider.test.base;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.jsonasdataprovider.base.page.BrowserSetUp;
import com.jsonasdataprovider.base.page.JsonasDataProviderRunnnerbase;
import com.jsonasdataprovider.core.constants.TestConstantsJson;
import com.jsondataprovider.core.utils.ExtentManger;
import com.jsondataprovider.core.utils.JsonReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JsonAsDataproviderBaseTest extends JsonasDataProviderRunnnerbase implements TestConstantsJson{
	//1-threads can be implemented
	//2-data provider
	private static final Logger logger = LogManager.getLogger(JsonasDataProviderRunnnerbase.class.getName());
	protected static BrowserSetUp driver = new BrowserSetUp();
	public ExtentReports rep = ExtentManger.getInstance();
	public static ExtentTest test;
	
	@BeforeSuite
	public void setupbeforeSuite(ITestContext context){
		
		
		
	}
	@AfterSuite
	public void aftermethodsetup(){
		driver.close();
		driver.quit();
		
	}


	
	/*******************************Start Report-----*******************************************/
	 public void startReport(String tname){
	    test = rep.startTest(tname);
	    test.log(LogStatus.INFO, "Starting the testcase:-"+ tname);
	 }
	 
	@DataProvider(name ="jsontestdata")
	public Object[][] jsonDataProvide(Method testMethod, ITestContext context) throws Exception {
		String jsonFileName = testMethod.getName();
		System.out.println("test method is:"+jsonFileName);
		String filePath ="";
		logger.debug("Test data is loaded from file " + filePath
				+ " and the sheet is " + jsonFileName);
		Object[][] testObjArray = JsonReader.readJson();

		return (testObjArray);

	}
	

	
	/********************** Reporting **************************/

	 public void logINFO(String msg) {
	  test.log(LogStatus.INFO, msg);
	 }

	 public void logSKIP(String msg) {
	  test.log(LogStatus.SKIP, msg);
	 }

	 public void logPASS(String msg) {
	  test.log(LogStatus.PASS, msg);
	 }

	 public void logFAIL(String msg) {
	  test.log(LogStatus.FAIL, msg);
	  
	 }
}
