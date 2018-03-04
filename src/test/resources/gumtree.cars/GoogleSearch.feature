Feature: As a customer
  I want to search for a keyword in google
  So that i can see gumtree links in the results

  Scenario: Search a keyword in google and validate gumtree links
    Given user navigates to google homepage
    When user performs a search for 'Cars in Housnlow'
    Then google should display all the available results
    And gumtree page title is visible
    And number of results on gumtree page are more than 0