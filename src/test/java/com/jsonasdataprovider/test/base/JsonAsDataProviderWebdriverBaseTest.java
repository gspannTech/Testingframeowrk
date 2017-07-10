package com.jsonasdataprovider.test.base;

import org.testng.annotations.BeforeMethod;
import com.jsondataprovider.basepage.Homepage;

public class JsonAsDataProviderWebdriverBaseTest extends JsonAsDataproviderBaseTest{
	
	private Homepage homePage;
	public JsonAsDataProviderWebdriverBaseTest(){
		 homePage = new Homepage(driver);
	}
	
	@BeforeMethod
	public void beforemethodsetup(){
		driver.setdriver(properties.getBrowser(),properties.getApplicationName());
	}
	
	
	
}
