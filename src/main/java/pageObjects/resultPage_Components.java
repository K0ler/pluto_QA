package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.mainMethods;

public class resultPage_Components extends mainMethods {

    @FindBy(xpath = "//h3[contains(text(),'Time to download our mobile app')]")
    public WebElement txtTimeToDownload;


    public resultPage_Components() {
        super();
    }

    public void checkResult() {

        Assert.assertTrue(IsVisible(txtTimeToDownload, 45), "Cannot find page witch text 'Time to download...'! ");
    }


}
