package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import utils.mainMethods;

public class yourQuotesPage_Steps extends mainMethods {

    @Given("^User click on 'View more details' button$")
    public void user_click_moredetails() throws Throwable {
       yourQuotes.clickViewMoreDetailsButton();
    }



}
