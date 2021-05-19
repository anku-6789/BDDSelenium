Feature: Search functionality on google page

  Scenario: Verify the functionality of search function
    Given Browser should be open
    And google page should be open
    When user enters a text in search box
    And tap on search button
   Then Navigate to search result page
   