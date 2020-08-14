package com.groupon;

public class Chaining {
	
	static Chaining obj;

	public static void main(String[] args) {
		obj = new Chaining();
		
		obj.test3().test4().test5();
		
		
	//	int f = obj.test1();
		
	//	int m = 26 + f;
		
	//	System.out.println(m);
		
	
	
	}
	
	
	Chaining test3() {
		System.out.println("in test3");
		return obj;
		
	}
	
	Chaining test4() {
		System.out.println("in test4");
		return obj;
	}
	
	void test5() {
		System.out.println("in test5");
	}
	
	
	int test1() {
		System.out.println("in test1");
		int c = 10 + 24;
		
		return c;
		
	}

}
