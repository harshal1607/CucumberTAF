Feature: feature to amazon login functionality

  Scenario: Check amazon login is successfull with valid crendentials
    Given user is on login page
    When user enters valid username and password
    And user clicks on login button
    Then user is navigated to home page

  Scenario Outline: Check login is successfull with valid crendentials
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is navigated to home page
    
    