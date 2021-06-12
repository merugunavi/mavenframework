package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import setuppage.SetupPage;

public class LoginSucces extends SetupPage{
	
	WebDriver driver;
	
	public LoginSucces(WebDriver driver) {
		
		super();
		
		this.driver=driver;
	}
	
	By openacc=By.xpath("//a[normalize-space()='Open New Account']");
	
	By accover=By.xpath("//a[normalize-space()='Accounts Overview']");
	
	By tfunds=By.xpath("//a[normalize-space()='Transfer Funds']");
	
	public void open() {
	
		driver.findElement(openacc).click();;
	
	}
	
	public void over() {
	
		driver.findElement(accover).click();;
	
	}
	
	public void tfunds() {
	
		driver.findElement(tfunds).click();;
	
	}


}
