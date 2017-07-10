package com.jsonasdataprovider.test.home;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jsonasdataprovider.test.base.JsonAsDataProviderWebdriverBaseTest;

public class HomeTest extends JsonAsDataProviderWebdriverBaseTest{
	
//	@Test(dataProvider ="jsontestdata")
//	public void loginEmail(String msg1, String msg2, String msg3){
//		startReport("loginEmail");
//		System.out.println("loop 1");
//		System.out.println(msg1);
//		System.out.println(msg2);
//		System.out.println(msg3);
//	
//		
//	}
	
	@Test
	public void testExtent(){
		startReport("testExtent");
		System.out.println("loop 1");
		logINFO("message");
//		System.out.println(msg1);
//		System.out.println(msg2);
//		System.out.println(msg3);
	
		
	}
	
	@AfterMethod
	public void aftermethod(){
	rep.endTest(test);
	   rep.flush();
	}
}
