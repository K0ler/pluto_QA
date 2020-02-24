package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class aboutYouPage_Components extends mainMethods {

    @FindBy(xpath = "//input[@id='username' and @placeholder='First and last name']")
    public WebElement inpFirstAndLastName;

    @FindBy(xpath = "//input[@id='age' and @placeholder='Age']")
    public WebElement inpAge;

    @FindBy(xpath = "//input[@name='medical']")
    public WebElement cbxMedical;

    @FindBy(xpath = " (//input[@name='medical'])[2]")
    public WebElement cbxNoMedical;

    //Errors

    @FindBy(xpath = "//span[contains(text(),'Can we get the last name too please')]")
    public WebElement txtErrorBadFill;

    @FindBy(xpath = "//span[contains(text(),'Please provide your full name')]")
    public WebElement txtErrorNoFill;

    @FindBy(xpath = "//span[contains(text(),'Unfortunately we can only provide insurance to peo')]")
    public WebElement txtErrorBadAge;



    //

    public aboutYouPage_Components() {
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


    public boolean isNameErrorPresent() {
        return IsVisible(txtErrorBadFill);
    }

    public boolean isAgeErrorPresent() {
        return IsVisible(txtErrorBadAge);

    }



}
