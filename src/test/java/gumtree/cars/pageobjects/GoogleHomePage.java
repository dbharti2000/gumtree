package gumtree.cars.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleHomePage extends BasePage {

    private static final By GOOGLE_SEARCH_TEXT_BOX = By.name("q");
    private static final By GOOGLE_SEARCH_BUTTON = By.xpath("//input[@type='submit']");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchKeyword) {
        WebElement googleSearchTextBox = waitForElementToBeVisible(driver, GOOGLE_SEARCH_TEXT_BOX);
        googleSearchTextBox.sendKeys(searchKeyword);

        WebElement googleSearchSubmitButton = waitForElementToBeClickable(driver, GOOGLE_SEARCH_BUTTON);
        Actions actions = new Actions(driver);
        actions.moveToElement(googleSearchSubmitButton).click().perform();

    }

}
