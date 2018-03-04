package gumtree.cars.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchStepDefs {


    @Given("^user navigates to google homepage$")
    public void user_navigates_to_google_homepage() throws Throwable {
    }

    @When("^user performs a search for '(.*)'$")
    public void user_search_for_Cars_in_London(String searchKeyword) throws Throwable {
    }

    @Then("^google should display all the available results$")
    public void google_should_return_more_than_results() throws Throwable {

    }

    @Then("^google should return (\\d+) gumtree results$")
    public void google_should_return_gumtree_results(int expectedResultCount) throws Throwable {

    }

}

