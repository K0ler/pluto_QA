package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class excessPage_Component extends mainMethods {


    @FindBy(xpath = "//span[contains(text(),'I want a £0 excess, and I')]")
    public WebElement cbx0;

    @FindBy(xpath = "//span[contains(text(),'d rather pay a £100 excess')]")
    public WebElement cbx100;

    @FindBy(xpath = "//span[contains(text(),'t mind the normal £250 excess and pay less')]")
    public WebElement cbx250;

    public excessPage_Component() {
        super();
    }

    public void setCheckBox0() {
        clickWithJS(cbx0);
        Assert.assertTrue(cbx0.getText().contains("+£0"), "Checkbox not selected");
    }

    public void setCheckBox100() {
        clickWithJS(cbx100);
        Assert.assertTrue(cbx100.getText().contains("+£0"), "Checkbox not selected");

    }

    public void setCheckBox250() {
        clickWithJS(cbx250);
        Assert.assertTrue(cbx250.getText().contains("+£0"), "Checkbox not selected");

    }

}
