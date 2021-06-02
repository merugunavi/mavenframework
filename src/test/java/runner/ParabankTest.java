package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import setuppage.SetupPage;

@CucumberOptions(
		features="src/test/resources",
		glue="stepdefinition",
		plugin = { "json:target/cucumber-reports/cucumber.json",
			                "pretty", "html:target/html-report/cucumber-html-reports.html",
			                "junit:target/cucumber-reports/cucumber.xml" }
			) 
public class ParabankTest extends AbstractTestNGCucumberTests {

		
	@BeforeMethod
	public void setupwindow() {
		SetupPage.setup();
		
	}
	
	@AfterMethod
	public void closeDown() {
		SetupPage.close();
	}
	
	

	
}
