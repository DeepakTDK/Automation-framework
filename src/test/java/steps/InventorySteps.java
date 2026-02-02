package steps;

import base.DriverFactory;
import pages.InventoryPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class InventorySteps {

    InventoryPage inventory;

    @Then("inventory page is displayed")
    public void inventoryDisplayed() {
        inventory = new InventoryPage(DriverFactory.getDriver());
        Assert.assertTrue(inventory.isDisplayed());
    }
}
