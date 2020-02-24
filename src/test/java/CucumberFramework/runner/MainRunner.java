package CucumberFramework.runner;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/CucumberFramework/featureFiles/"},
		glue = {"stepDefinitions"},
		monochrome = true,
		tags = {},
		plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunner extends AbstractTestNGCucumberTests {



}
