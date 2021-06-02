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
import pages.FundsTransfer;
import pages.LoginPage;
import pages.LoginSucces;
import runner.ParabankTest;
import setuppage.SetupPage;

public class FundsTransferSD {
	static WebDriver driver;

	
	@When("user able to enter into account with there login credentials")
	public void user_able_to_enter_into_account_with_there_login_credentials() {
	    
		LoginPage lp=new LoginPage(driver);
		lp.username("naveeta");
		lp.password("123");
		lp.logbtn();
		
	}

	@When("able to view the funds transfer tab")
	public void able_to_view_the_funds_transfer_tab() {
		 String log= driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
		 Assert.assertTrue(log.contains("Welcome"));
		 By tfunds=By.xpath("//a[normalize-space()='Transfer Funds']");	 
	}

	@When("user able to click the funds tranfer tab.")
	public void user_able_to_click_the_funds_tranfer_tab() {
		LoginSucces ls=new LoginSucces(driver);
		 ls.tfunds();	
	}

	@Then("user ables to enter the amount,select the accounts")
	public void user_ables_to_enter_the_amount_select_the_accounts() {
	   
		FundsTransfer ft = new FundsTransfer(driver);
		ft.amt();
		ft.dd1();
		ft.dd2();
		
	}

	@Then("click the transfer button.")
	public void click_the_transfer_button() {
	   
		FundsTransfer ft = new FundsTransfer(driver);
		ft.tbtn();
		
	}

}
