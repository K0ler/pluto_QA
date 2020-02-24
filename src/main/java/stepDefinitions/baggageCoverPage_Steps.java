package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class baggageCoverPage_Steps extends mainMethods {

    @Given("^User indicates that his baggage is worth about 500$")
    public void user_set_500() throws Throwable {
        baggage.setCheckBox500();
    }

    @Given("^User indicates that his baggage is worth about 1500$")
    public void user_set_1500() throws Throwable {
        baggage.setCheckBox1500();
    }

    @Given("^User indicates that his baggage is worth about 3000$")
    public void user_set_3000() throws Throwable {
        baggage.setCheckBox3000();
    }

}
