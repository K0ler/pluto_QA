package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.mainMethods;

public class cardDetailsPage_Steps extends mainMethods {

    @Given("^User set Card number as \"([^\"]*)\"$")
    public void user_set_number(String number) throws Throwable {
        cardDetails.setCardNumber(number);
    }

    @Given("^User set expiration date as \"([^\"]*)\"$")
    public void user_set_ed(String date) throws Throwable {
        cardDetails.setExpDate(date);
    }

    @Given("^User set CVC as \"([^\"]*)\"$")
    public void user_set_cvc(String cvc) throws Throwable {
        cardDetails.setCVC(cvc);
    }

    @Given("^User set postcode as \"([^\"]*)\"$")
    public void user_set_postal(String postal) throws Throwable {
        cardDetails.setPostal(postal);
    }

    @Given("^User close popup window$")
    public void user_close() throws Throwable {
        cardDetails.closeWindowsWithHelp();
    }


}
