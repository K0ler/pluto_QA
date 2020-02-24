package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.mainMethods;

public class yourEmailPage_Steps extends mainMethods {

    @Given("^User set email \"([^\"]*)\" wher policy will be send$")
    public void user_email_policy(String email) throws Throwable {
        yourEmail.setUserEmail(email);
    }

    @Given("^User set partner email \"([^\"]*)\"$")
    public void user_partner_email_policy(String email) throws Throwable {
        yourEmail.setPartnerEmail(email);
    }

    @Then("^Button 'Process to payment' should be enabled$")
    public void button_pro_pay() {
        yourEmail.isProcessToPaymentEnable();
    }

    @Given("^User click on button 'Process to payment'$")
    public void user_click_ptp() {
        yourEmail.clickProcessToPayment();
    }
}
