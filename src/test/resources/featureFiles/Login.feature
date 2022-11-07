Feature: feature to test login functionality

  Scenario: Check login is successfull with valid crendentials
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    Then user is navigated to home page

  Scenario Outline: Check login is successfull with valid crendentials
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is navigated to home page
    Examples:
      | username | password |
      | user1    | pass123  |
      | user2    | pass124  |
