package stepdefinition;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.RegPage;
import setuppage.SetupPage;

public class RegSD {
WebDriver driver;


	@Given("User able to launch the parabank website")
public void setupurl() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

	}
	@When("User clicks the register button")
	public void click_the_register_button(){
		HomePage hp=new HomePage(driver);
		hp.register();
	
	}

	@When("User able to enter the fields in the registration page")
	public void User_able_to_enter_the_fields_in_the_registration_page() throws Exception{
		try {
		 String reg="Signing up is easy!";
		 
		 AssertJUnit.assertTrue(reg.contains("Signing up is easy!"));
		 
		RegPage re=new RegPage(driver);
		re.fname("navitha");
		re.lname("merugu");
		re.add("ranui");
		re.city("auck");
		re.state("auckland");
		re.zcode("5643");
		re.phone("967543345");
		re.ssn("1234");
		re.uname("navi");
		re.pwd("123");
		re.confirm("123"); 
		}
		catch (Throwable e)
	     {
	       e.printStackTrace();
	      
	     }
	}

	@When("User click the register button in register page")
	public void click_the_register_button_in_register_page() {
		RegPage re=new RegPage(driver);
		re.regbt();
	}

	@Then("registration succesfull and enters into user account page")
	public void registration_succesfull_and_enters_into_user_account_page() {
	   String actual=driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
	   Assert.assertTrue(actual.contains("Welcome"));
	}
}
