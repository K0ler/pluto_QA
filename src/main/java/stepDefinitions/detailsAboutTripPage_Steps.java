package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class detailsAboutTripPage_Steps extends mainMethods {

    @Given("^User set needed cover as Worldwide including USA, Canada & Caribbean$")
    public void user_set_cover_as_worldwide_including() throws Throwable {
        detailsPage.setCheckBoxWorldwideIncluded();
    }

    @Given("^User set needed cover as Worldwide excluding USA, Canada & Caribbean$")
    public void user_set_cover_as_worldwide_excluding() throws Throwable {
        detailsPage.setCheckBoxWorldwideExcluded();
    }

    @Given("^User set needed cover as Europe$")
    public void user_set_cover_as_europe() throws Throwable {
        detailsPage.setCheckBoxEurope();
    }

    @Given("^User add partner to his cover$")
    public void user_add_partner() throws Throwable {
        detailsPage.setPartner(true);
    }

    @Given("^User dont add partner to his cover$")
    public void user_not_add_partner() throws Throwable {
        detailsPage.setPartner(false);
    }

}
