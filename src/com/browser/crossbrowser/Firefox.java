package com.browser.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Firefox {
	WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void initialsetup(String browser){
		if (browser.equalsIgnoreCase("Firefox")) {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\User\\Documents\\Drivers\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}else {
		
		System.out.println("Browser not selected");
	}
			
	}
	@Test
	public void broswerstart() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://www.google.co.uk");
		
		driver.close();
		
	}
	

}
