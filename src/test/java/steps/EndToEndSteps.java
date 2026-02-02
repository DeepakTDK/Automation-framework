package steps;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import pages.InventoryPage;
import pages.LoginPage;

import static base.DriverUtils.slowDown;

public class EndToEndSteps {

    @Given("user completes end to end flow")
    public void userCompletesEndToEndFlow() {

        LoginPage login = new LoginPage(DriverFactory.getDriver());
        InventoryPage inventory = new InventoryPage(DriverFactory.getDriver());

        login.open();
        slowDown();

        login.login("standard_user", "secret_sauce");
        slowDown();

        inventory.addFirstItem();
        slowDown();

        inventory.openCart();
        slowDown();
    }
}
