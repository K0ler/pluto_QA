package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class cancellationsPage_Steps extends mainMethods {

    @Given("^User indicates that he need cencelation worth about 500$")
    public void user_set_baggage_500() throws Throwable {
        cancellations.setCheckBox500();
    }

    @Given("^User indicates that he need cencelation worth about 1500$")
    public void user_set_baggage_1500() throws Throwable {
        cancellations.setCheckBox1500();
    }

    @Given("^User indicates that he need cencelation worth about 3000$")
    public void user_set_baggage_3000() throws Throwable {
        cancellations.setCheckBox3000();
    }

}
