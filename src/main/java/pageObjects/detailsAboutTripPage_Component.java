package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class detailsAboutTripPage_Component extends mainMethods {

    @FindBy(xpath = "//input[@name='annual' and @value='Worldwide incl USA, Canada & Caribbean']")
    public WebElement cbxWorldwideIncluding;

    @FindBy(xpath = "//input[@name='annual' and @value='Worldwide excl USA, Canada & Caribbean']")
    public WebElement cbxWorldwideExcluding;

    @FindBy(xpath = "//input[@name='annual' and @value='Europe']")
    public WebElement cbxEurope;

    @FindBy(xpath = "//span[text()='No thanks']")
    public WebElement cbxNoThanks;

    @FindBy(xpath = "//span[text()='Yes, add my partner']")
    public WebElement cbxYesAdd;

    public detailsAboutTripPage_Component() {
        super();
    }

    public void setCheckBoxWorldwideIncluded() {
        clickWithJS(cbxWorldwideIncluding);
        Assert.assertTrue(isAttribtuePresent(cbxWorldwideIncluding, "checked"), "Checkbox WorldwideIncluding was not set");
        Assert.assertFalse(isAttribtuePresent(cbxWorldwideExcluding, "checked"), "Checkbox WorldwideExcluding is still checked!");
        Assert.assertFalse(isAttribtuePresent(cbxEurope, "checked"), "Checkbox Europe is still checked!");
    }

    public void setCheckBoxWorldwideExcluded() {
        clickWithJS(cbxWorldwideExcluding);
        Assert.assertTrue(isAttribtuePresent(cbxWorldwideExcluding, "checked"), "Checkbox was not set");
        Assert.assertFalse(isAttribtuePresent(cbxWorldwideIncluding, "checked"), "Checkbox WorldwideIncluding is still checked!");
        Assert.assertFalse(isAttribtuePresent(cbxEurope, "checked"), "Checkbox Europe is still checked!");

    }

    public void setCheckBoxEurope() {
        clickWithJS(cbxEurope);
        Assert.assertTrue(isAttribtuePresent(cbxEurope, "checked"), "Checkbox was not set");
        Assert.assertFalse(isAttribtuePresent(cbxWorldwideIncluding, "checked"), "Checkbox WorldwideIncluding is still checked!");
        Assert.assertFalse(isAttribtuePresent(cbxWorldwideExcluding, "checked"), "Checkbox WorldwideExcluding is still checked!");

    }

    public void setPartner(boolean includePartner) {
        if(includePartner==true) clickWithJS(cbxYesAdd);
        else clickWithJS(cbxNoThanks);
    }


}
