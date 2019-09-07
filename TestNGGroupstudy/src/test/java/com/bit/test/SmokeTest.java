package com.bit.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
	@ Test
	public void test1() {
		System.out.println("test1");
		
	}
	@Test
	public void test2() {
		System.out.println("test2");
		
	}
	@Test
	public void test3() {
		System.out.println("test3");
		
	}
	
	
	/*
    beforeSuite-1
	beforeTest-2
	beforeClass-3
	beforeMethod-4
	test1-testCase-5
	afterMethod-6
	beforeMethod-7
	test2
	afterMethod
	beforeMethod
	test3
	afterMethod
	afterClass
	afterTest 
	 */

}
