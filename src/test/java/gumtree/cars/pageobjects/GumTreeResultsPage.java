package gumtree.cars.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GumTreeResultsPage extends BasePage {

    private static Logger LOG = LogManager.getLogger(GumTreeResultsPage.class);
    private static final By GUMTREE_RESULTS = By.xpath("//ul[@data-q='naturalresults']");
    private static final By GUMTREE_SEARCH_RESULTS = By.xpath("//div[@class='rc']/h3/a[contains(text(), 'Gumtree')]");


    public GumTreeResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getGumTreePageResultCount() {
        List<WebElement> gumTreeResults = getWebElements(GUMTREE_RESULTS);
        return gumTreeResults.size();
    }

    public int selectGumtreeLinksAndReturnTitle() throws InterruptedException {

        List<WebElement> gumTreeResults = getWebElements(GUMTREE_SEARCH_RESULTS);
        List<String> titles = new ArrayList<>();

        boolean flag = false;
        for (int index = 0; index < gumTreeResults.size(); index++) {
            if (flag) {
                gumTreeResults = getWebElements(GUMTREE_SEARCH_RESULTS);
            }

            WebElement currentElement = gumTreeResults.get(index);
            currentElement.click();
            titles.add(driver.getTitle());
            LOG.info("GUMTREE Title: " + driver.getTitle());

            if (index == gumTreeResults.size() - 1) {
                break;
            }
            driver.navigate().back();
            flag = true;
        }
        return titles.size();
    }
}
