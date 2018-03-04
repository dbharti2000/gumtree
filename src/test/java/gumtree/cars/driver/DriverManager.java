package gumtree.cars.driver;


import gumtree.cars.utils.PropertyReaders;
import org.openqa.selenium.WebDriver;
import java.io.IOException;


public class DriverManager {

    public static WebDriver getDriver() throws IOException {
        String browser = new PropertyReaders().readProperty("browser");
        return DriverFactory.createInstance(browser);
    }

    public static void destroyDriver(WebDriver driver) {
        driver.quit();
    }
}
