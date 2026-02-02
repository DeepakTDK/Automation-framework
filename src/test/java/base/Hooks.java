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
        if (scenario.isFailed()) {
            saveScreenshot(DriverFactory.getDriver());
        }
        DriverFactory.quitDriver();
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
