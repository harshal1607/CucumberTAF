Feature: feature to test google serach functionality

  Scenario: validate google search is working
    Given browser is open
    And user is on google search page
    When user enters text in serch box
    And hits enter
    Then user is navigated to serched result
