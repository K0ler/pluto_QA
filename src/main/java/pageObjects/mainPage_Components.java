package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mainMethods;

public class mainPage_Components extends mainMethods {

    @FindBy(xpath = "//button/span")
    public WebElement btnAnnualCover;

    @FindBy(xpath = "//div[2]/div/button/span")
    public WebElement btnSingleTripCover;

    public mainPage_Components() {
        super();
    }

    public void clickOnAnnualCoverButton() {
        btnAnnualCover.click();
    }

    public void closeDriver() {
        driver.quit();
    }

}
