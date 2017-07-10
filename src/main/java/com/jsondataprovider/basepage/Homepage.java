package com.jsondataprovider.basepage;

import org.openqa.selenium.By;

import com.jsonasdataprovider.base.page.BrowserSetUp;


//import com.jsonasdataprovider.base.page.BrowserSetUp;

public class Homepage extends JsonasdataProviderBasePage {

	public Homepage(BrowserSetUp driver) {
		super(driver);
	}
	
	public static final By BASKET_BUTTON = By.xpath("com.sephora:id/header_item_basket");
	public static final By DONE_BUTTON = By.id("com.sephora:id/editor_action_done");
	
	
}
