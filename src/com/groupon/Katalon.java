package com.groupon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katalon {

		 
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mounika\\eclipse-workspace\\voltas\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			 driver.get("http://way2automation.com/way2auto_jquery/index.php");
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			    driver.findElement(By.linkText("Signin")).click();
			    
			    driver.findElement(By.xpath("(//input[@name='username'])[2]")).click();
			    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
			    driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("ajay0589");
			    
			    driver.findElement(By.xpath("(//input[@name='password'])[2]")).click();
			    driver.findElement(By.xpath("(//input[@name='password'])[2]")).clear();
			    driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("asdfghjkl");
			    
			    driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
	
}
		
}
