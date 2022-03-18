package com.stepdefs1;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef1 {

WebDriver driver;	
	//hooks in Cucumber	
@Before// will run before every scenario
public void setup() 
{		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	    
driver = new ChromeDriver();	
}	
@After// will run after every scenario	
public void tearDown() throws Exception{		
Thread.sleep(3000);		
driver.close();
	}	
@Given("^User should be on login1 page$")	
public void user_should_be_on_login1_page() throws Throwable {
	    
driver.get("file:///C:/Users/intel/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");	
}	
@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")//Regular expressions->any string or number format 
                                            //converted into special format	
public void user_enters_and(String uname, String pass) throws Throwable {	    
driver.findElement(By.id("email")).sendKeys(uname);	    
driver.findElement(By.id("password")).sendKeys(pass);	    
driver.findElement(By.xpath("//button")).click();	
}	
@Then("^User will be on Home page$")	
public void user_will_be_on_Home_page() throws Throwable {	    
Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());	
}	
@Then("^user should see JBK logo$")	
public void user_should_see_JBK_logo() throws Throwable {		
WebElement logo = driver.findElement(By.tagName("img"));		
Assert.assertTrue(logo.isDisplayed());	
}
}
