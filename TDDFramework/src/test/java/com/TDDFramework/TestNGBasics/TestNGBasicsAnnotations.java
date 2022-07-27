package com.TDDFramework.TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicsAnnotations {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite -- Setting up environment properties");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void test_001() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test_002() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test_003() {
		System.out.println("Test 3");
	}
		
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void deleteCookies() {
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("@AfterTest");
	}
	
	/*@AfterSuite
	public void tearDown() {
		System.out.println("AfterSuite -- Test Reports");
	}*/

}
