package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class optionalExtrasPage_Component extends mainMethods {


    @FindBy(xpath = "//span[contains(text(),'Add winter sports cover')]")
    public WebElement cbxWinterCover;

    @FindBy(xpath = "//span[contains(text(),'Add adventure sports cover')]")
    public WebElement cbxAdventureSportsCover;

    @FindBy(xpath = "//span[contains(text(),'Add extended travel disruption cover')]")
    public WebElement cbxExtendedTDCover;

    @FindBy(xpath = "//span[contains(text(),'Add business cover')]")
    public WebElement cbxBusinessCover;

    public optionalExtrasPage_Component() {
        super();
    }

    public void setCheckBoxWinterCover() {
        clickWithJS(cbxWinterCover);
    }

    public void setCheckBoxAdventureSportsCover() {
        clickWithJS(cbxAdventureSportsCover);

    }

    public void setCheckBoxExtendedTDCover() {
        clickWithJS(cbxExtendedTDCover);

    }

    public void setCheckBoxBusinessCover() {
        clickWithJS(cbxBusinessCover);

    }


}
