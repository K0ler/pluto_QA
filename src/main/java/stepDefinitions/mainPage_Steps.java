package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class mainPage_Steps extends mainMethods {

    @Given("^User navigates to test website$")
    public void user_navigates_to_test_website() throws Throwable {
        getDriver().get("https://pluto-customer-web-app-staging.herokuapp.com/tailored-annual-or-single");
    }

    @Given("^User click on Annual Cover button$")
    public void user_click_on_Annual_Cover_button() throws Throwable {
        mainPage.clickOnAnnualCoverButton();
    }

    @Given("^User close browser$")
    public void user_close() {
        mainPage.closeDriver();
    }

}
