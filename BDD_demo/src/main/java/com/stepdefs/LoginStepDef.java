package com.stepdefs;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDef {

	WebDriver driver;
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
    System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("file:///C:/Users/intel/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");  

	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	  
	}

	@Then("^User will be on Homepage$")
	public void user_will_be_on_Homepage() throws Throwable {
	 
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	
	@Then("^User should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {

		WebElement logo=driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
	}

}
