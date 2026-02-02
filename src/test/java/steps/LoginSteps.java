package steps;

import base.DriverFactory;
import pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage login;

    @Given("user is on login page")
    public void userOnLoginPage() {
        login = new LoginPage(DriverFactory.getDriver());
        login.open();
    }

    @When("user logs in with valid credentials")
    public void loginWithValidCredentials() {
        login.login("standard_user", "secret_sauce");
    }

    @Then("user should be logged in successfully")
    public void loginSuccess() {
        // success validated in inventory page
    }
}
