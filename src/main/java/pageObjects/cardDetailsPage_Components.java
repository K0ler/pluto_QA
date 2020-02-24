package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mainMethods;

import java.util.ArrayList;
import java.util.List;

public class cardDetailsPage_Components extends mainMethods {

    /*
    @FindBy(xpath = "//input[@name='cardnumber']")
    public WebElement inpCardNumber;

    @FindBy(xpath = "//input[@name='exp-date']")
    public WebElement inpExpDate;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement inpCVC;

    @FindBy(xpath = "//input[@name='postal']")
    public WebElement inpPostal;
    */
    @FindBy(xpath = "(//iframe[contains(@title,'Secure')and contains(@title, 'payment')])[1]")
    public WebElement iframeCardNumber;

    @FindBy(xpath = "(//iframe[contains(@title,'Secure')and contains(@title, 'payment')])[2]")
    public WebElement iframeExpDate;

    @FindBy(xpath = "(//iframe[contains(@title,'Secure')and contains(@title, 'payment')])[3]")
    public WebElement iframeCvc;

    @FindBy(xpath = "(//iframe[contains(@title,'Secure')and contains(@title, 'payment')])[4]")
    public WebElement iframePostal;

    @FindBy(xpath = "//iframe[@name='__privateStripeFrame6']")
    public WebElement iframeWindows;

    @FindBy(xpath = "//*[contains(@class,'jss10')]")
    public WebElement closeButton;


    //svg[@aria-hidden="true"]

    public void goToIframe(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void goToDefault() {
        driver.switchTo().defaultContent();
    }

    public void closeWindowsWithHelp() {
        closeButton.click();

    }

    public void setCardNumber(String number) throws InterruptedException {
        goToIframe(iframeCardNumber);
        //driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys(name);

        WebElement el = driver.findElement(By.xpath("//input[@name='cardnumber']"));
        for (char character: number.toCharArray()) {
            el.sendKeys(String.valueOf(character));
            Thread.sleep(300);
        }
        goToDefault();
    }

    public void setExpDate(String expDate) {
        goToIframe(iframeExpDate);
        driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys(expDate);
        goToDefault();
    }

    public void setCVC(String cvc) {
        goToIframe(iframeCvc);
        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys(cvc);
        goToDefault();
    }

    public void setPostal(String postal) {
        goToIframe(iframePostal);
        driver.findElement(By.xpath("//input[@name='postal']")).sendKeys(postal);
        goToDefault();
    }


}
