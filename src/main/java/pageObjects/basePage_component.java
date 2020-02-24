package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class basePage_component extends mainMethods {

    @FindBy(xpath = "//span[text()='Next']/../..")
    public WebElement btnNext;

    public basePage_component() {
        super();
    }

    public void clickNext() {
        clickWithJS(btnNext);
    }

    public void isNextEnabled() {

        Assert.assertFalse(isAttribtuePresent(btnNext,"disabled"));
    }

    public void isNextDisabled() {

        Assert.assertTrue(isAttribtuePresent(btnNext,"disabled"));
    }


}
