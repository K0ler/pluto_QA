package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class yourEmailPage_Components extends mainMethods {

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement inpUserEmail;

    @FindBy(xpath = "//input[@id='traveller0']")
    public WebElement inpPartnerEmail;

    @FindBy(xpath = "//span[text()='Proceed to payment']")
    public WebElement btnProceedToPayment;

    public yourEmailPage_Components() {
        super();
    }

    public void setUserEmail(String name) {
        inpUserEmail.sendKeys(name);
    }

    public void setPartnerEmail(String name) {
        inpPartnerEmail.sendKeys(name);
    }

    public void clickProcessToPayment() {
        clickWithJS(btnProceedToPayment);
    }

    public void isProcessToPaymentEnable() {
        Assert.assertFalse(isAttribtuePresent(btnProceedToPayment,"disabled"), "Button is not enable");
    }
}
