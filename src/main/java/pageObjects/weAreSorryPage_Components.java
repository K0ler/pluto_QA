package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class weAreSorryPage_Components extends mainMethods {

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/div/div/div/div/div/p[1]")
    public WebElement txtWeAreSorry;

    public weAreSorryPage_Components() {
        super();
    }

    public void confirmWeAreSorry() {
        Assert.assertTrue(IsVisible(txtWeAreSorry));
    }

}
