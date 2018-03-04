package gumtree.cars.stepdefinitions;

import cucumber.api.java.en.Then;

public class GumTreeStepDefs {


    @Then("^gumtree page title is visible$")
    public void title_of_the_page_is_visible() throws Throwable {
    }

    @Then("^number of results on gumtree page are more than (\\d+)$")
    public void number_of_results_on_the_page_are_more_than(int minCount) throws Throwable {
    }
}


