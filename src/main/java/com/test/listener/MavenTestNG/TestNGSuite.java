package com.test.listener.MavenTestNG;

import org.testng.annotations.Test;


public class TestNGSuite {

	@Test( groups = {"include-test-one"}
		, description = "Sample testOne")
	public void testOne(){
		System.out.println("Inside groupOne");
	}
	
	@Test(groups = {"include-test-two"}
	, description = "Sample testTwo")
	public void testTwo(){
		System.out.println("Inside testTwo");
	}
	
	@Test(groups = {"test-one-exclude"}
	, description = "Sample testThree")
	public void testThree(){
		System.out.println("Inside testThree");
	}
	
}
