package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class baggageCoverPage_Component extends mainMethods {


    @FindBy(xpath = "//span[contains(text(),'Around £500')]")
    public WebElement cbx500;

    @FindBy(xpath = "//span[contains(text(),'Around £1,500')]")
    public WebElement cbx1500;

    @FindBy(xpath = "//span[contains(text(),'Closer to £3')]")
    public WebElement cbx3000;

    public baggageCoverPage_Component() {
        super();
    }

    public void setCheckBox500() {
        clickWithJS(cbx500);
        Assert.assertTrue(cbx500.getText().contains("+£0"), "Checkbox not selected");
    }

    public void setCheckBox1500() {
        clickWithJS(cbx1500);
        Assert.assertTrue(cbx1500.getText().contains("+£0"), "Checkbox not selected");

    }

    public void setCheckBox3000() {
        clickWithJS(cbx3000);
        Assert.assertTrue(cbx3000.getText().contains("+£0"), "Checkbox not selected");

    }

}
