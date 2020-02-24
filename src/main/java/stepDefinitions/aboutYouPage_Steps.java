package stepDefinitions;

import cucumber.api.java.en.Given;
import org.testng.Assert;
import utils.mainMethods;

public class aboutYouPage_Steps extends mainMethods {

    @Given("^User set First Name and Last name as \"([^\"]*)\"$")
    public void user_set_name(String username) throws Throwable {
        aboutYou.setFirstAndLastName(username);
    }

    @Given("^User set \"([^\"]*)\" age$")
    public void user_set_age(String age) throws Throwable {
        aboutYou.setAge(age);
    }

    @Given("^The user declares that he has no major health problems in the last 12 months$")
    public void user_set_good_health() throws Throwable {
        aboutYou.setMedical(true);
    }

    @Given("^The user declares that he has health problems$")
    public void user_set_bad_health() throws Throwable {
        aboutYou.setMedical(false);
    }

    @Given("^TextBox about error in Name field displayed$")
    public void error_name_negative() throws Throwable {
        Assert.assertTrue(aboutYou.isNameErrorPresent());
    }

    @Given("^TextBox about error in Name field not displayed$")
    public void error_name_positive() throws Throwable {
        Assert.assertFalse(aboutYou.isNameErrorPresent());
    }

    @Given("^TextBox about error in Age field displayed$")
    public void error_age_negative() throws Throwable {
        Assert.assertTrue(aboutYou.isAgeErrorPresent());
    }

    @Given("^TextBox about error in Age field not displayed$")
    public void error_age_positive() throws Throwable {
        Assert.assertFalse(aboutYou.isAgeErrorPresent());
    }
}
