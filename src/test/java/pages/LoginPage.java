
package pages;

import org.openqa.selenium.*;

public class LoginPage {
    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.saucedemo.com");
    }

    public void login(String u, String p) {
        driver.findElement(username).sendKeys(u);
        driver.findElement(password).sendKeys(p);
        driver.findElement(loginBtn).click();
    }
}
