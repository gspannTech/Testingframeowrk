package com.jsondataprovider.basepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.jsonasdataprovider.base.page.BrowserSetUp;




public class JsonasdataProviderBasePage extends BrowserSetUp{
	
	public WebDriver driver;
    
	private static final Logger logger = LogManager
			.getLogger(JsonasdataProviderBasePage.class.getName());

	public JsonasdataProviderBasePage(BrowserSetUp driver) {
		super();
		
	}

	public WebDriver getWebdriver(){
		return driver;
	}

}
