package com.testsuite;

import org.testng.annotations.Test;

public class PriorityTests {
	

	@Test(priority = 2,enabled = false)	
	void bTest() {
		System.out.println("In b test");
		
	}
	
	@Test(priority = 1)
	void aTest() {
		System.out.println("In a test");
		
	}
	
	@Test(priority = 0)
	void cTest() {
		System.out.println("In c test");
		
	}
}

