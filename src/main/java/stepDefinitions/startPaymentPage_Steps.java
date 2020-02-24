package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class startPaymentPage_Steps extends mainMethods {

    @Given("^User click on Card Payment$")
    public void user_click_card() throws Throwable {
       startPayment.clickCardPayment();
    }
}
