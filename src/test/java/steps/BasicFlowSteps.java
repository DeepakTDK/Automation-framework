package steps;

import base.DriverFactory;
import pages.LoginPage;
import pages.InventoryPage;
import io.cucumber.java.en.*;

public class BasicFlowSteps {

    LoginPage login;
    InventoryPage inventory;

    @Given("user completes basic flow")
    public void basicFlow() {
        login = new LoginPage(DriverFactory.getDriver());
        login.open();
        login.login("standard_user", "secret_sauce");

        inventory = new InventoryPage(DriverFactory.getDriver());
        inventory.addFirstItem();
    }
}
