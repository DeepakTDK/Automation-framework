package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        try {
            String runMode = System.getProperty("runMode", "local");

            if (runMode.equalsIgnoreCase("docker")) {

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");

                driver.set(
                        new RemoteWebDriver(
                                new URL("http://localhost:4444/wd/hub"),
                                options
                        )
                );

            } else {
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize WebDriver", e);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
