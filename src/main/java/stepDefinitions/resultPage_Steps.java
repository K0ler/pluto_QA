package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.mainMethods;

public class resultPage_Steps extends mainMethods {


    @Then("^User see text: 'Time to download...'$")
    public void user_click_lets_do_this() throws Throwable {
        result.checkResult();
    }

}
