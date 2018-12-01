package com.browser.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void initialsetup(String browser){
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 30);	
			
		}else {
			
			System.out.println("Browser not selected");
		}
		
	

	}
	@Test
	public void broswerstart() {
		
		driver.get("https://www.google.co.uk");
		
		driver.close();
		
	}
	
}
