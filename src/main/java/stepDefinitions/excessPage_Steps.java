package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class excessPage_Steps extends mainMethods {

    @Given("^User want a £0 excess and pay more$")
    public void user_set_0() throws Throwable {
        excess.setCheckBox0();
    }

    @Given("^User want a £100 excess$")
    public void user_set_100() throws Throwable {
        excess.setCheckBox100();
    }

    @Given("^User want a £250 excess and pay less$")
    public void user_set_250() throws Throwable {
        excess.setCheckBox250();
    }

}
