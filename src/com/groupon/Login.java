package com.groupon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mounika\\eclipse-workspace\\voltas\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
	    driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
	    driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("ajay0589");
	    driver.findElement(By.xpath("//div[@id='login']//input[@name=''password']")).sendKeys("asdfghjkl");
	    driver.findElement(By.xpath("//div[@id='login']//input[@class=''button']")).click();


	}
}
