package stepdefinition;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

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

public class RegSD extends SetupPage{
		
	RegPage re= new RegPage(driver);

	public RegSD() {
		
		super();
	
	}
	
	
	@When("User clicks the register button from homepage")
	
	public void click_the_register_button(){
		
		HomePage hp=new HomePage(driver);
		
		hp.clickreg();
		
	}

	@When("User enters into registration page and enters all the required fields to create an account")
	
	public void User_enters_into_regpage_and_enters_all_the_required_fields_to_create_an_account(){
		try {
		 
			String reg="Signing up is easy!";
			 
			AssertJUnit.assertTrue(reg.contains("Signing up is easy!"));
						
			re.fname("navi");
			
			re.lname("mmm");
			
			re.add("CBD");
			
			re.city("auckk");
			
			re.state("auckland");
			
			re.zcode("5643");
		
			re.phone("967543345");
			
			re.ssn("1234");
			
			re.uname("navithaa");
			
			re.pwd("123");
			
			re.confirm("123"); 
			}
			
		catch (Throwable e)
	     	{
				e.printStackTrace();
	      
	     	}
	}
	
	@When("User enters into registration page and enters {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	
	public void user_enters(String fname, String lname, String add, String city, String state, String zipcode, String phone, String ssn, String username, String password, String confirmpwd) {
	   
		re.fname(fname);
		
		re.lname(lname);
		
		re.add(add);
		
		re.city(city);
		
		re.state(state);
		
		re.zcode(zipcode);
		
		re.phone(phone);
		
		re.ssn(ssn);
		
		re.uname(username);
		
		re.pwd(password);
		
		re.confirm(confirmpwd);
	
	
	}

	@When("User clicks the register button from the registration page")
	
	public void click_the_register_button_in_register_page() {

		re.regbtn();
	}

	@Then("User registration succesfull and enters into user account page")
	
	public void registration_succesfull_and_enters_into_user_account_page() {
	
		String actual=driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
	   
		AssertJUnit.assertTrue(actual.contains("Welcome"));
	}
}
