Feature: Test LoginF unctionality

  Scenario Outline: Verify that after entring valid credentials login is sucessful
    Given Browser should be open
    And user is on login page
    When after entering <username> and <passowrd>
    And tap on login button
    Then User should navigate to homepage of application

    Examples: 
      | username | Password |
      | Raghav   |12345|
      | Ele      |12345|
