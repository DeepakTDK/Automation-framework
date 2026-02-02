package steps;

import base.DriverFactory;
import pages.LoginPage;
import pages.InventoryPage;
import io.cucumber.java.en.*;

public class LoginAndAddSteps {

    LoginPage login;
    InventoryPage inventory;

    @Given("user logs in and adds product to cart")
    public void loginAndAdd() {
        login = new LoginPage(DriverFactory.getDriver());
        login.open();
        login.login("standard_user", "secret_sauce");

        inventory = new InventoryPage(DriverFactory.getDriver());
        inventory.addFirstItem();
    }
}
