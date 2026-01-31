
package runners;

import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = "src/test/resources/features",
  glue = {"steps","base"},
  plugin = {
    "pretty",
    "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
  }
)
public class TestRunner extends AbstractTestNGCucumberTests {}
