Feature: Login functioanlity test

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And Click on login page
    Then User should navigates to homepage
@Smoke
  Scenario: Check login with invalidvalid credentials
    Given user is on login page
    When user enters invalid username and password
    And Click on login page
    Then Error message should display- InValid credentials
