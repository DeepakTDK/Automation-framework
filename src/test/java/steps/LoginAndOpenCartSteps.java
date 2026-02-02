package steps;

import base.DriverFactory;
import pages.LoginPage;
import pages.InventoryPage;
import io.cucumber.java.en.*;

public class LoginAndOpenCartSteps {

    LoginPage login;
    InventoryPage inventory;

    @Given("user logs in and opens cart")
    public void loginAndOpenCart() {
        login = new LoginPage(DriverFactory.getDriver());
        login.open();
        login.login("standard_user", "secret_sauce");

        inventory = new InventoryPage(DriverFactory.getDriver());
        inventory.openCart();
    }
}
