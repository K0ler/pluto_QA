package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class yourPolicyPage_Steps extends mainMethods {


    @Given("^User click on Let's do this button$")
    public void user_click_lets_do_this() throws Throwable {
        yourPolicy.clickLetsDoThis();
    }

}
