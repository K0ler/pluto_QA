package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class gadgetCoverPage_Component extends mainMethods {


    @FindBy(xpath = "//span[contains(text(),'No, thanks!')]")
    public WebElement cbxNoThanks;

    @FindBy(xpath = "//span[contains(text(),'d like cover for 1 device')]")
    public WebElement cbxOneDevice;

    @FindBy(xpath = "//span[contains(text(),'d like cover for 2 devices')]")
    public WebElement cbxTwoDevice;

    public gadgetCoverPage_Component() {
        super();
    }

    public void setCheckBoxNoThanks() {
        clickWithJS(cbxNoThanks);
        Assert.assertTrue(cbxNoThanks.getText().contains("+£0"), "Checkbox not selected");
    }

    public void setCheckBoxOneDevice() {
        clickWithJS(cbxOneDevice);
        Assert.assertTrue(cbxOneDevice.getText().contains("+£0"), "Checkbox not selected");

    }

    public void setCheckBoxTwoDevice() {
        clickWithJS(cbxTwoDevice);
        Assert.assertTrue(cbxTwoDevice.getText().contains("+£0"), "Checkbox not selected");


    }

}
