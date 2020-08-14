package com.groupon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomtionUtilities {
	
	WebDriver driver;
	
	WebDriver openBrowser(String browserName, String url) {
		
		switch(browserName) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mounika\\eclipse-workspace\\voltas\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
						
			break;
		case "firefox":
		break;
		case "ie":
		default:
			System.out.println("Enter the browser name");
			break;
		
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
