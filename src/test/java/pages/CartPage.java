package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    private By cartContainer = By.id("cart_contents_container");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(cartContainer)
        ).isDisplayed();
    }
}
