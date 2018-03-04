package gumtree.cars.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gumtree.cars.pageobjects.GoogleHomePage;
import gumtree.cars.pageobjects.GoogleSearchResultsPage;

import static gumtree.cars.stepdefinitions.GeneralStepDefs.driver;

public class GoogleSearchStepDefs {

    private static GoogleHomePage googleHomePage = new GoogleHomePage(driver);



    @Given("^user navigates to google homepage$")
    public void user_navigates_to_google_homepage() throws Throwable {
        googleHomePage.openHomePage();
    }

    @When("^user performs a search for '(.*)'$")
    public void user_search_for_Cars_in_London(String searchKeyword) throws Throwable {
        googleHomePage.performSearch(searchKeyword);
    }

    @Then("^google should display all the available results$")
    public void google_should_return_more_than_results() throws Throwable {

    }

    @Then("^google should return (\\d+) gumtree results$")
    public void google_should_return_gumtree_results(int expectedResultCount) throws Throwable {

    }

}

