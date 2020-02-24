package utils;

import cucumber.api.java.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.*;

public class mainMethods {

    public static WebDriver driver;
    protected WebDriverWait wait;

    public static basePage_component basePage;

    public static mainPage_Components mainPage;
    public static detailsAboutTripPage_Component detailsPage;
    public static aboutYouPage_Components aboutYou;
    public static aboutPartnerPage_Components aboutPartner;
    public static yourPolicyPage_Components yourPolicy;
    public static gadgetCoverPage_Component gadget;
    public static baggageCoverPage_Component baggage;
    public static cancellationsPage_Component cancellations;
    public static excessPage_Component excess;
    public static optionalExtrasPage_Component optionalExtras;
    public static yourQuotesPage_Components yourQuotes;
    public static orderSummaryPage_Components orderSummary;
    public static boringStuffPage_Components boringStuff;
    public static yourEmailPage_Components yourEmail;
    public static startPaymentPage_Components startPayment;
    public static cardDetailsPage_Components cardDetails;
    public static resultPage_Components result;
    public static weAreSorryPage_Components weAreSorry;

    public WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/koler/lib/chromedriver"); //change this path on windows, i use macOs for Gherkin/Cucumber
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        basePage = PageFactory.initElements(driver, basePage_component.class);

        mainPage = PageFactory.initElements(driver, mainPage_Components.class);
        detailsPage = PageFactory.initElements(driver, detailsAboutTripPage_Component.class);
        aboutYou = PageFactory.initElements(driver, aboutYouPage_Components.class);
        aboutPartner = PageFactory.initElements(driver, aboutPartnerPage_Components.class);
        yourPolicy = PageFactory.initElements(driver, yourPolicyPage_Components.class);
        gadget = PageFactory.initElements(driver, gadgetCoverPage_Component.class);
        baggage = PageFactory.initElements(driver, baggageCoverPage_Component.class);
        cancellations = PageFactory.initElements(driver, cancellationsPage_Component.class);
        excess = PageFactory.initElements(driver, excessPage_Component.class);
        optionalExtras = PageFactory.initElements(driver, optionalExtrasPage_Component.class);
        yourQuotes = PageFactory.initElements(driver, yourQuotesPage_Components.class);
        orderSummary = PageFactory.initElements(driver, orderSummaryPage_Components.class);
        boringStuff = PageFactory.initElements(driver, boringStuffPage_Components.class);
        yourEmail = PageFactory.initElements(driver, yourEmailPage_Components.class);
        startPayment = PageFactory.initElements(driver, startPaymentPage_Components.class);
        cardDetails = PageFactory.initElements(driver, cardDetailsPage_Components.class);
        result = PageFactory.initElements(driver, resultPage_Components.class);
        weAreSorry = PageFactory.initElements(driver, weAreSorryPage_Components.class);

        this.wait = new WebDriverWait(driver, 15);
        return driver;
    }

    //Aditional Methods

    public boolean isAttribtuePresent(WebElement element, String attribute) {
        Boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null){
                result = true;
            }
        } catch (Exception e) {}

        return result;
    }

    public void clickWithJS(WebElement element) {
        //scrollJS(element);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean IsVisible(WebElement element) {
        try {
            element.isDisplayed();
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            //Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean IsVisible2(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            //Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean IsVisible(WebElement element, int time) {
        this.wait = new WebDriverWait(driver, time);
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
            this.wait = new WebDriverWait(driver, 15);
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            this.wait = new WebDriverWait(driver, 15);
            return false;
        }
    }

    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
            return false;
        }
    }

    public void scrollJS(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -400)");
            System.out.println("Succesfully scrolled to the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to scroll to the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to scroll to the WebElement, Exception: " + e.getMessage());
        }
    }
    /*
    @After
    public void closeBrowser() {
        driver.quit();
    }
*/
}
