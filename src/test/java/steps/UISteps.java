package steps;

import base.DriverFactory;
import pages.LoginPage;
import pages.InventoryPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UISteps {

    WebDriver driver;
    LoginPage login;
    InventoryPage inventory;

    @Given("user is on login page")
    public void openLogin() {
        driver = DriverFactory.getDriver();
        login = new LoginPage(driver);
        login.open();
    }

    @When("user logs in with valid credentials")
    public void loginValid() {
        login.login("standard_user", "secret_sauce");
    }

    @Then("inventory page is displayed")
    public void verifyInventory() {
        inventory = new InventoryPage(driver);
        Assert.assertTrue(inventory.isDisplayed());
    }

    @When("user adds product to cart")
    public void addProduct() {
        inventory.addFirstItem();
    }

    @Then("cart page opens")
    public void openCart() {
        inventory.openCart();
    }
}
