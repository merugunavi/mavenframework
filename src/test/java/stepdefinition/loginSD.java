
package stepdefinition;
import org.testng.Assert;
import org.testng.annotations.Parameters;


import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import setuppage.SetupPage;

public class loginSD extends SetupPage{

		public loginSD() {
	
			super();
		
		}
	
		HomePage home=new HomePage(driver);	
		
	@Given("User able to launch the parabank website")

	public void User_able_to_launch_the_parabank_website() {

		String title= driver.getTitle();
	
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
	}


	@When("User able to enter username and password")
	
	public void user_able_to_enter_username_and_password() {
		
				 
		home.name("navi");
		
		home.pwd("123");
	}
	
	@When("User able to enter {string} and {string}")
	
	public void user_able_to_enter_and(String username, String password) {
    
		home.name(username);
		
		home.pwd(password);
	
	}


	@When("User clicks the login button")
	
	public void click_the_login_button() {
		
		HomePage home=new HomePage(driver);
		
		home.login();
	}

	@Then("User enters into account overview page")
	
	public void user_enters_into_account_overview_page() {
	 
		String log= driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
	   
		Assert.assertTrue(log.contains("Welcome"));
	   
		System.out.println("login successful");
	   
	}
}
