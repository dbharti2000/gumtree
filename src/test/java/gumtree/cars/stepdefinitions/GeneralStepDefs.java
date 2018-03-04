package gumtree.cars.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gumtree.cars.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class GeneralStepDefs {

    public static WebDriver driver;
    private static Logger LOG = LogManager.getLogger(GeneralStepDefs.class);

    @Before
    public void beforeScenario() throws IOException {
        driver = DriverManager.getDriver();
    }

    @After
    public void afterScenario() {
        DriverManager.destroyDriver(driver);
    }
}

