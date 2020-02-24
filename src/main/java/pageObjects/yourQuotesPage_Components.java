package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mainMethods;

public class yourQuotesPage_Components extends mainMethods {

    @FindBy(xpath = "//span[contains(text(),'View more details')]")
    public WebElement btnViewMoreDetails;


    public yourQuotesPage_Components() {
        super();
    }

    public void clickViewMoreDetailsButton() {
        btnViewMoreDetails.click();
    }


}
