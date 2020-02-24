package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class orderSummaryPage_Steps extends mainMethods {

    @Given("^User click on confirm details button$")
    public void user_click_confirm_details() throws Throwable {
        orderSummary.clickConfirmDetailsButton();
    }

}
