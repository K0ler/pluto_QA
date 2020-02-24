package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class boringStuffPage_Steps extends mainMethods {

    @Given("^User accept privacy policy$")
    public void user_accept_pp() throws Throwable {
        boringStuff.setCheckBoxPrivacyPolicy();
    }

    @Given("^User accept terms policy$")
    public void user_accept_tp() throws Throwable {
        boringStuff.setCheckBoxTermsPolicy();
    }

}
