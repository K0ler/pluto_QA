package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class aboutPartnerPage_Components extends mainMethods {

    @FindBy(xpath = "//input[@id='username0' and @placeholder='First and last name']")
    public WebElement inpFirstAndLastName;

    @FindBy(xpath = "//input[@id='age0' and @placeholder='Age']")
    public WebElement inpAge;

    @FindBy(xpath = "//input[@name='medical']")
    public WebElement cbxMedical;

    @FindBy(xpath = " (//input[@name='medical'])[2]")
    public WebElement cbxNoMedical;

    //Errors

    @FindBy(xpath = "//span[text()='Can we get the last name too please']")
    public WebElement txtErrorBadFill;

    @FindBy(xpath = "//span[text()='Please provide your full name']")
    public WebElement txtErrorNoFill;

    @FindBy(xpath = "//span[text()='Unfortunately we can only provide insurance to people aged 18 - 46']")
    public WebElement txtErrorBadAge;



    //

    public aboutPartnerPage_Components() {
        super();
    }

    public void setFirstAndLastName(String name) {
        inpFirstAndLastName.sendKeys(name);
    }

    public void setAge(String age) {
        inpAge.sendKeys(age);
    }

    public void setMedical(boolean medical) {
        if(medical==true) clickWithJS(cbxMedical);
        else clickWithJS(cbxNoMedical);
    }


    public boolean isNameErrorPresent(boolean expectations) {
        return IsVisible(txtErrorBadFill);
    }

    public boolean isAgeErrorPresent(boolean expectations) {
        return IsVisible(txtErrorBadAge);

    }



}
