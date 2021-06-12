package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import setuppage.SetupPage;

public class FundsTransfer extends SetupPage{
	
	static WebDriver driver;
	
	public FundsTransfer(WebDriver driver){
		super();
		
		this.driver=driver;
	}

	By amt=By.id("amount");

	By acc1 = By.xpath("//select[@id='fromAccountId']");

	By acc2= By.xpath("//select[@id='toAccountId']");

	By tfunds=By.xpath("//input[@value='Transfer']");

public void amount(int amount) {
	
	driver.findElement(amt).sendKeys(""+amount);
 
	}

public void dd1() {

	Select select = new Select(driver.findElement(acc1));

	select.selectByIndex(1);

	}

public void dd2() {

	Select select= new Select(driver.findElement(acc2));
	
	select.selectByIndex(1);

	}

public void tbtn() {
	
	driver.findElement(tfunds).click();

	}



}
