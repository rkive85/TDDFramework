package com.TDDFramework.TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGFeaturesDependsOnMethods {
	
	WebDriver driver;
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Mail"));
		driver.quit();
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("homepage test");
	}

}
