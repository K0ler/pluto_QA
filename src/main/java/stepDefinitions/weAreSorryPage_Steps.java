package stepDefinitions;

import cucumber.api.java.en.Then;
import utils.mainMethods;

public class weAreSorryPage_Steps extends mainMethods {

    @Then("^User see text: 'We are sorry...'$")
    public void user_sorry() throws Throwable {
        weAreSorry.confirmWeAreSorry();
    }

}
