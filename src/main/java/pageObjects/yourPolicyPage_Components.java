package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class yourPolicyPage_Components extends mainMethods {

    @FindBy(xpath = "//span[contains(text(),\"Let's do this\")]")
    public WebElement btnLetsDoThis;

    public yourPolicyPage_Components() {
        super();
    }

    public void clickLetsDoThis() {
               clickWithJS(btnLetsDoThis);
    }


}
