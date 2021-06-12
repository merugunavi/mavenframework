package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.hash.HashCode;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FundsTransfer;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginSucces;
import runner.RunnerTest;
import setuppage.SetupPage;

public class FundsTransferSD extends SetupPage{
	
	public FundsTransferSD() {
		
			super();
	}
	

	HomePage home=new HomePage(driver);
	
	@When("User able to click the funds tranfer tab from the account page")
	
	public void able_to_click_the_funds_transfer_tab() {
			
		String log= driver.findElement(By.xpath("//b[normalize-space()='Welcome']")).getText();
		
		Assert.assertTrue(log.contains("Welcome"));
		
		LoginSucces ls=new LoginSucces(driver);
		
		ls.tfunds();
				 
	}


	@Then("User ables to enter the amount and select the accounts")
	
	public void user_ables_to_enter_the_amount_select_the_accounts() {
	   
		
		FundsTransfer ft = new FundsTransfer(driver);
	
		ft.amount(100);
		
		ft.dd1();
		
		ft.dd2();
		
		
	}

	@Then("User clicks the transfer button and displays transfer complete message")
	
	public void click_the_transfer_button() {
	   
		FundsTransfer ft = new FundsTransfer(driver);
	
		ft.tbtn();
			
		String msg =driver.findElement(By.xpath("//h1[normalize-space()='Transfer Complete!']")).getText();
		   
		Assert.assertTrue(msg.contains("Transfer Complete!"));
		
		
	}

}
