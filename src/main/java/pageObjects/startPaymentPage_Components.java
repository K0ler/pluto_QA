package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class startPaymentPage_Components extends mainMethods {

    @FindBy(xpath = "//button[@id='paymentTypeCard']")
    public WebElement btnPaymentTypeCard;

    public startPaymentPage_Components() {
        super();
    }

    public void clickCardPayment() {
        clickWithJS(btnPaymentTypeCard);
    }
}
