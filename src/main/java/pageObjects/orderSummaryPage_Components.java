package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mainMethods;

public class orderSummaryPage_Components extends mainMethods {

    @FindBy(xpath = "//span[contains(text(),'Confirm details')]")
    public WebElement btnConfirmDetails;

    public orderSummaryPage_Components() {
        super();
    }

    public void clickConfirmDetailsButton() {
        btnConfirmDetails.click();
    }

}
