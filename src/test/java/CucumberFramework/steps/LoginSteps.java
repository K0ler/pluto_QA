package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	/*
	WebDriver driver;
	private String Username;

	@Before()
	public void setup() {
		//the following can be changed to: System.getProperty("user.dir") + "\\src\\test\\java\\resources\\other\\geckodriver.exe";
		System.setProperty("webdriver.chrome.driver", "/Users/koler/lib/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        }
	

	@FindBy(xpath = "//input[@id='user_login']")
 	public WebElement inpUserName;
 
	@FindBy(xpath = "//input[@id='user_pass']")
 	public WebElement inpPassword;
 
	@FindBy(xpath = "//input[@id='wp-submit']")
 	public WebElement btnSignIn;
	
	@FindBy(xpath = "//div[@id='login_error']")
 	public WebElement txtErrorMessage;
	
	@FindBy(css = ".bookly-next-step > span:nth-child(1)")
 	public  WebElement btnNext;
    
    @FindBy(xpath = "//a[contains(text(),'Menu')]")
    public WebElement btnMenu;
    
    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    public WebElement btnLogOut;
    
    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    public WebElement btnLogIn;
    
    @FindBy(xpath = "//a[contains(text(),'Reservation')]")
    public WebElement btnReservation;
    
    @FindBy(xpath = "//h1") 
	public WebElement txtMainPageText;
  
	@Given("^User navigates to test website$")
	public void user_navigates_to_test_website() throws Throwable {
		driver.get("http://51.83.43.62/wordpress/");
	}

	@Given("^User clicks on the sign in button on homepage$")
	public void user_clicks_on_the_sign_in_button_on_homepage() throws Throwable {
	    	
	    	Actions actions = new Actions(driver);
	    	
	    	actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Menu')]"))).perform();
	    	actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Log In')]"))).perform();
	    	driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
	    	
	    }

	@Given("^User enters \"([^\"]*)\" username$")
	public void user_enters_username(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
	}

	@Given("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("user1");
	}
	
	@Given("^User enters a not valid username$")
	public void user_enters_a_not_valid_username() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("user2");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("user1");
	}
	
	@Given("^User enters a not valid password$")
	public void user_enters_a_not_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("user2");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText(), "Main");
	}
	
	@Then("^User should see message about incorrect password$")
	public void user_should_see_message_about_incorrect_password() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='login_error']")).getText(), "BŁĄD: Wprowadzone hasło dla nazwy użytkownika user1 nie jest poprawne. Nie pamiętasz hasła?");
	}
	
	@Then("^User should see message about not recognised user name$")
	public void user_should_see_message_about_not_recognised_user_name() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='login_error']")).getText(), "Nieznana użytkownik. Proszę sprawdzić ponownie lub spróbować swój email.");
	}
	*/
}
