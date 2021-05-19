Feature: Check login Functionality

  Scenario: Validation login
    Given User is on login page
    When User enter username and password
    And Click on login page
    Then User navigates to homepage
