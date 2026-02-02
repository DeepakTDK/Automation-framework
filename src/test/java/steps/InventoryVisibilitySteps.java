package steps;

import base.DriverFactory;
import pages.InventoryPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class InventoryVisibilitySteps {

    InventoryPage inventory;

    @Then("all inventory items should be visible")
    public void inventoryItemsVisible() {
        inventory = new InventoryPage(DriverFactory.getDriver());
        Assert.assertTrue(inventory.hasItems());
    }
}
