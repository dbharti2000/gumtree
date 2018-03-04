package gumtree.cars.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver driver = null;

    public static WebDriver createInstance(String browserName) {

        String browser = browserName.toLowerCase();

        if (browser.equals("firefox")) {
            driver = getFireFoxDriver();

        } else if (browser.equals("chrome")) {
            driver = getChromeDriver();

        } else {
            driver = getChromeDriver();

        }
        return driver;
    }


    private static WebDriver getFireFoxDriver() {
        FirefoxDriverManager.getInstance().setup();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        return firefoxDriver;
    }

    private static WebDriver getChromeDriver() {
        ChromeDriverManager.getInstance().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }
}

