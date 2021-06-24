package org.demo.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.demo.utilities.ConfigurationReader;
import org.demo.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;

import java.util.concurrent.TimeUnit;


public class Hooks {

    @Before
    public void setUp() {
        // we put a logic that should apply to every scenario
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }




}
