package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class optionalExtrasPage_Steps extends mainMethods {

    @Given("^User add adventure sports cover$")
    public void user_set_asc() throws Throwable {
        optionalExtras.setCheckBoxAdventureSportsCover();
    }

    @Given("^User add business cover$")
    public void user_set_bc() throws Throwable {
        optionalExtras.setCheckBoxBusinessCover();
    }

    @Given("^User add extended travel disruption cover$")
    public void user_set_etdc() throws Throwable {
        optionalExtras.setCheckBoxExtendedTDCover();
    }

    @Given("^User add winter cover$")
    public void user_set_wc() throws Throwable {
        optionalExtras.setCheckBoxWinterCover();
    }

}
