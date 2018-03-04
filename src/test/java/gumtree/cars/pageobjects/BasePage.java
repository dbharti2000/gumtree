package gumtree.cars.pageobjects;

import gumtree.cars.utils.PropertyReaders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;
    private static final int DEFAULT_WAIT_FOR_ELEMENT = 10;
    private String URL = new PropertyReaders().readProperty("URL");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get(URL);
    }

    public static WebElement waitForElementToBeVisible(WebDriver driver, final By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_FOR_ELEMENT);

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return element;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, final By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_FOR_ELEMENT);

            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
            return element;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}