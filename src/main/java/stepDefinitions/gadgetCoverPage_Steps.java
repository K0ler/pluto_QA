package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class gadgetCoverPage_Steps extends mainMethods {

    @Given("^User indicates that he does not need to protect the gadget$")
    public void user_set_cover_as_worldwide_including() throws Throwable {
        gadget.setCheckBoxNoThanks();
    }

    @Given("^User indicates that he wants to cover one gadget$")
    public void user_set_cover_as_worldwide_excluding() throws Throwable {
        gadget.setCheckBoxOneDevice();
    }

    @Given("^User indicates that he wants to cover two gadget$")
    public void user_set_cover_as_europe() throws Throwable {
        gadget.setCheckBoxTwoDevice();
    }

}
