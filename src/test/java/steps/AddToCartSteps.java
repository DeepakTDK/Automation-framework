package steps;

import base.DriverFactory;
import pages.InventoryPage;
import io.cucumber.java.en.*;

public class AddToCartSteps {

    InventoryPage inventory;

    @When("user adds product to cart")
    public void addProductToCart() {
        inventory = new InventoryPage(DriverFactory.getDriver());
        inventory.addFirstItem();
    }
}
