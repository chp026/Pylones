package Pylones.StepDefinition;

import Pylones.PageObject.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps {
    SignInPage signInPage = new SignInPage();

    @Given("^user is on the homepage of PYLONES$")
    public void user_is_on_the_homepage_of_PYLONES() throws Throwable {
    }

    @When("^user clicks on Signin button$")
    public void user_clicks_on_Signin_button() throws Throwable {
        Thread.sleep(3000);
        signInPage.signIn();
    }

    @When("^user types \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_types_and(String arg1, String arg2) throws Throwable {
        Thread.sleep(4000);
        signInPage.emailMethod(arg1,arg2);
    }

    @Then("^should be able to login into account$")
    public void should_be_able_to_login_into_account() throws Throwable {
    }


}
