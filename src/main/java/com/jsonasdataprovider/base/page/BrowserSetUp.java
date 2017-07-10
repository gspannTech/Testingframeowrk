package com.jsonasdataprovider.base.page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jsonasdataprovider.core.constants.TestConstantsJson;

public class BrowserSetUp extends JsonasDataProviderRunnnerbase implements SetBrowser, TestConstantsJson, WebDriver{
	private WebDriver driver;
	static String driverPath = System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserExeFiles";

	public WebDriver getDriver() {
		return driver;
	}

	@Override
	public void setdriver(String browserType, String appURL) {
		if (browserType.equalsIgnoreCase(TestConstantsJson.CHROME_BROWSER)) {		
			driver = initChromeDriver(appURL);
		}else if (browserType.equalsIgnoreCase(TestConstantsJson.MOZILLA_BROWSER)) {
			driver = initFirefoxDriver(appURL);
		}else{
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Override
	public void close() {
		driver.close();
		// TODO Auto-generated method stub		
	}

	@Override
	public WebElement findElement(By arg0) {
		driver.findElement(arg0);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		driver.findElement(arg0);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		driver.get(arg0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		driver.getCurrentUrl();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		driver.getPageSource();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		driver.getTitle();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		driver.getWindowHandle();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		driver.getWindowHandles();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		driver.manage();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		driver.navigate();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		driver.quit();
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		driver.switchTo();
		// TODO Auto-generated method stub
		return null;
	}
}
