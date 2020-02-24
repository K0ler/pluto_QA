package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class aboutPartnerPage_Steps extends mainMethods {

    @Given("^User set partner first name and last name as \"([^\"]*)\"$")
    public void user_set_name(String username) throws Throwable {
        aboutPartner.setFirstAndLastName(username);
    }

    @Given("^User set \"([^\"]*)\" partner age$")
    public void user_set_age(String age) throws Throwable {
        aboutPartner.setAge(age);
    }

    @Given("^The user declares that partner has no major health problems in the last 12 months$")
    public void user_set_good_health() throws Throwable {
        aboutPartner.setMedical(true);
    }

    @Given("^The user declares that partner has health problems$")
    public void user_set_bad_health() throws Throwable {
        aboutPartner.setMedical(false);
    }

}
