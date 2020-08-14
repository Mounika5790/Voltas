package com.groupon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NumberOfBoxes {
	
	static WebDriver appDriver;

	public static void main(String[] args) throws Exception{
		
		AutomtionUtilities obj = new AutomtionUtilities();
		
		appDriver = obj.openBrowser("chrome", "http://way2automation.com/way2auto_jquery/index.php");
		
			appDriver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		 	appDriver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("ajay0589");
		 	appDriver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("asdfghjkl");
		 	appDriver.findElement(By.xpath("//div[@id='login']//input[@class='button']")).click();
		
		 	int boxSize = appDriver.findElements(By.xpath("//div//ul//li//figure//img")).size();
		 	
		 	System.out.println("Number of boxes:" + boxSize); 
		 	
		 /*	int boxSize1 = appDriver.findElements(By.xpath("//div[@class='row']//div[2]//ul[1]//li//figure//img")).size();
			System.out.println("Number of boxes:" + boxSize1);
			
			int dropdown = appDriver.findElements(By.xpath("//div[4]//ul[1]//li[2]//a[1]//figure[1]//img[1]")).size();
			
			System.out.println("Number of boxes:" + dropdown);*/
			
		 	Thread.sleep(3000);
						
			appDriver.findElement(By.xpath("//div[@class='container margin-top-20']//div[1]//ul[1]//li[1]//a[1]//figure[1]//img[1]")).click();
			
		 	Thread.sleep(3000);
			
			appDriver.switchTo().frame(0);
		 	
		 	WebElement draggableElement =  appDriver.findElement(By.xpath("//div[@id='draggable']"));
		 	
		 	Thread.sleep(3000);
		 	
		 	Actions action = new Actions(appDriver);
		 	
		 	action.dragAndDropBy(draggableElement, 250, 150).build().perform();
		 	

	}
	
	

}
