package gumtree.cars.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchResultsPage extends BasePage {
    private static Logger LOG = LogManager.getLogger(GoogleSearchResultsPage.class);

    private static final By All_SEARCH_RESULTS_LINKS_ON_GOOGLE_PAGE = By.xpath("//div[@class='rc']/h3/a");

    public GoogleSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void displayAllResults() {
        List<WebElement> searchResults = getWebElements(All_SEARCH_RESULTS_LINKS_ON_GOOGLE_PAGE);

        for (WebElement searchResult : searchResults) {
            LOG.info("Search Result Link - " + searchResult.getText());
        }
    }
}
