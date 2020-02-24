package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.mainMethods;

public class boringStuffPage_Components extends mainMethods {

    @FindBy(xpath = "//input[@name='privaciesCheck' and @value='privaciesCheck']")
    public WebElement cbxPrivacyPolicy;

    @FindBy(xpath = "//input[@name='termsCheck' and @value='termsCheck']")
    public WebElement cbxTermsCheck;

    public boringStuffPage_Components() {
        super();
    }

    public void setCheckBoxPrivacyPolicy() {
        clickWithJS(cbxPrivacyPolicy);
    }
    public void setCheckBoxTermsPolicy() {
        clickWithJS(cbxTermsCheck);
    }
}
