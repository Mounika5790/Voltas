package com.testsuite;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	
		public void test1() {
			
			System.out.println("In test method");
			String expectedResult = "hello";
			String actualResult = "hello";

			Assert.assertEquals(actualResult, expectedResult);
			
		/*	if (exceptedResult.equalsIgnoreCase(actualResult)) {
				System.out.println("Test Passed");} else {
				System.out.println("Test Failed");}
			*/
				}
	@BeforeMethod
	void beforeMethod() {
		System.out.println("in before method");
	
	}

	@AfterMethod
	void aftereMethod() {
		System.out.println("in after method");
	
	}

	@BeforeClass
	
	void beforeclass() {
		System.out.println("in before class");
	}
	
	@AfterClass
	
	void afterclass() {
		System.out.println("in after class");
	}
	
	@BeforeSuite
	
	void beforesuite() {
		System.out.println("in before suite");
	}
	
	@AfterSuite
	
	void aftersuite() {
		System.out.println("in after suite");
	}
	
	@BeforeTest
	
	void beforetest() {
		System.out.println("in before test");
	}
	
	@AfterTest
	
	void aftertest() {
		System.out.println("in after test");
	}
}
