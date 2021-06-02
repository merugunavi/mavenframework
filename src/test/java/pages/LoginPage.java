package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import setuppage.SetupPage;

public class LoginPage extends SetupPage{

	WebDriver driver;

public LoginPage(WebDriver driver) {

	this.driver=driver;
}
By uname=By.name("username");
By pwd=By.name("password");
By logbtn=By.xpath("//input[@value='Log In']");

public void username(String username) {
	driver.findElement(uname).sendKeys(username);
  }
public void password(String password) {
	driver.findElement(pwd).sendKeys(password);
  }
public void logbtn() {
	driver.findElement(logbtn).click();
  }
}
