package gumtree.cars.stepdefinitions;

import cucumber.api.java.en.Then;
import gumtree.cars.pageobjects.GoogleSearchResultsPage;
import gumtree.cars.pageobjects.GumTreeResultsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import static gumtree.cars.stepdefinitions.GeneralStepDefs.driver;

public class GumTreeStepDefs {
    private static Logger LOG = LogManager.getLogger(GumTreeStepDefs.class);
    private static GumTreeResultsPage gumTreeResultsPage = new GumTreeResultsPage(driver);
    private static GoogleSearchResultsPage googleSearchResults = new GoogleSearchResultsPage(driver);
    private static int gumTreeResultCountOnGooglePage;


    @Then("^gumtree page title is visible$")
    public void title_of_the_page_is_visible() throws Throwable {
        gumTreeResultCountOnGooglePage = googleSearchResults.getGumTreeResultCount();
        LOG.info("\n Actual gumtree links count on google results page - " + gumTreeResultCountOnGooglePage);

        // Asserting Number of titles are equal to number of links found on the google results page
        Assert.assertTrue("Something wrong with title", gumTreeResultsPage.selectGumtreeLinksAndReturnTitle() == gumTreeResultCountOnGooglePage);
    }

    @Then("^number of results on gumtree page are more than (\\d+)$")
    public void number_of_results_on_the_page_are_more_than(int minCount) throws Throwable {
        // If there are 0 gumtree links then user won't be able to go to gumtree page and check links
        if (gumTreeResultCountOnGooglePage > 0) {
            Assert.assertTrue("No links exist on Gumtree website", gumTreeResultsPage.getGumTreePageResultCount() > minCount);
        }
    }

}


