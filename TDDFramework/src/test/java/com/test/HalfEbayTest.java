package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	
	@Test
	public void halfEbayTest(String firstname, String lastname, String email, String password) {
		WebElement fname = driver.findElement(By.id("firstname"));
		fname.sendKeys(firstname);
		
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.sendKeys(lastname);
		
		WebElement mail = driver.findElement(By.id("Email"));
		mail.sendKeys(email);
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys(password);
		
		WebElement signUpBtn = driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"));
		signUpBtn.click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
