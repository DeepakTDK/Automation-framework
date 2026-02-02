
package pages;

import org.openqa.selenium.*;

import java.util.List;

public class InventoryPage {
    WebDriver driver;

    By inventory = By.id("inventory_container");
    By cart = By.className("shopping_cart_link");
    By inventoryItems = By.className("inventory_item");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(inventory).isDisplayed();
    }

    public void addFirstItem() {
        driver.findElements(By.className("btn_inventory")).get(0).click();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }

    public boolean hasItems() {
        List<WebElement> items = driver.findElements(inventoryItems);
        return items != null && items.size() > 0;
    }
}
