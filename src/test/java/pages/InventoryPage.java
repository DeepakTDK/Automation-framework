
package pages;

import org.openqa.selenium.*;

public class InventoryPage {
    WebDriver driver;

    By inventory = By.id("inventory_container");
    By cart = By.className("shopping_cart_link");

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
}
