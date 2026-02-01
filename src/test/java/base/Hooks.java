package base;

import io.cucumber.java.*;
import io.qameta.allure.Attachment;
import org.openqa.selenium.*;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        WebDriver driver = DriverFactory.getDriver();

        if (scenario.isFailed() && driver != null) {
            saveScreenshot(driver);
        }

        DriverFactory.quitDriver();
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
