
package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import setuppage.SetupPage;

public class loginSD {
	WebDriver driver;

	@Given("able to view the login option")
	public void able_to_view_the_login_option() {
			
		By uname=By.name("username");
		By pwd=By.name("password");
		By logbtn=By.xpath("//input[@value='Log In']");
		
	}

	@When("User able to enter username and password")
	public void user_able_to_enter_username_and_password() {
	LoginPage lp=new LoginPage(driver);
	lp.username("navi");
	lp.password("123");
	}

	@When("User clicks the login button")
	public void click_th_login_button() {
		LoginPage lp=new LoginPage(driver);
		lp.logbtn();
	}

	@Then("User enters into account overview page")
	public void user_enters_into_account_overview_page() {
	   String log= driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
	   Assert.assertTrue(log.contains("Welcome"));
	   System.out.println("login successful");
	   
	}
}
