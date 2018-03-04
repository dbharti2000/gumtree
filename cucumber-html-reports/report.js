$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "As a customer",
  "description": "I want to search for a keyword in google\nSo that i can see gumtree links in the results",
  "id": "as-a-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@gumtree"
    }
  ]
});
formatter.before({
  "duration": 3871062963,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search a keyword in google and validate gumtree links",
  "description": "",
  "id": "as-a-customer;search-a-keyword-in-google-and-validate-gumtree-links",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user navigates to google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user performs a search for \u0027bikes in Isleworth\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "google should display all the available results",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "gumtree page title is visible",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "number of results on gumtree page are more than 0",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchStepDefs.user_navigates_to_google_homepage()"
});
formatter.result({
  "duration": 822917985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bikes in Isleworth",
      "offset": 28
    }
  ],
  "location": "GoogleSearchStepDefs.user_search_for_Cars_in_London(String)"
});
formatter.result({
  "duration": 2236733743,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefs.google_should_return_more_than_results()"
});
formatter.result({
  "duration": 204003628,
  "status": "passed"
});
formatter.match({
  "location": "GumTreeStepDefs.title_of_the_page_is_visible()"
});
formatter.result({
  "duration": 7758568962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 48
    }
  ],
  "location": "GumTreeStepDefs.number_of_results_on_the_page_are_more_than(int)"
});
formatter.result({
  "duration": 16881025,
  "status": "passed"
});
formatter.after({
  "duration": 210824112,
  "status": "passed"
});
});