package steps;

import base.DriverFactory;
import pages.CartPage;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.InventoryPage;

public class CartNavigationSteps {

    @And("user navigates to cart")
    public void userNavigatesToCart() {
        InventoryPage inventory = new InventoryPage(DriverFactory.getDriver());
        inventory.openCart();
    }

    @Then("cart page is displayed")
    public void cartPageDisplayed() {
        CartPage cart = new CartPage(DriverFactory.getDriver());
        Assert.assertTrue(cart.isDisplayed(), "Cart page is not displayed");
    }
}
