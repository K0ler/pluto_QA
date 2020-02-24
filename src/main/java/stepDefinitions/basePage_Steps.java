package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import utils.mainMethods;

public class basePage_Steps extends mainMethods {

    @Given("^User click on 'Next' button$")
    public void user_click_next() throws Throwable {
        basePage.clickNext();
    }

    @Then("^Button next is enabled$")
    public void next_button_status_positive() throws Throwable {
        basePage.isNextEnabled();
    }

    @Then("^Button next is disabled$")
    public void next_button_status_negative() throws Throwable {
        basePage.isNextDisabled();
    }


}
