package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import setuppage.SetupPage;

public class FundsTransfer {
	static WebDriver driver;
	
	public FundsTransfer(WebDriver driver){
	
		this.driver=driver;
	}
By amt=By.id("amount");
By acc1 = By.xpath("//select[@id='fromAccountId']");
By acc2= By.xpath("//select[@id='toAccountId']");
By tfunds=By.xpath("//input[@value='Transfer']");

public void amt() {
	driver.findElement(amt).sendKeys();
}
public void dd1() {
	Select se= new Select((WebElement) driver.findElements(acc1));
	se.selectByIndex(0);
}
public void dd2() {
	Select se= new Select((WebElement) driver.findElements(acc2));
	se.selectByIndex(0);
}
public void tbtn() {
	
	driver.findElement(tfunds).click();
}
}
