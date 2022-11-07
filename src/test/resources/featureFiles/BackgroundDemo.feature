@BackgroundTest
Feature: Check background functionality for flipkart site

  Background: user is logged in
    Given user is on login page
    When user enters emailid and password
    Then user is navigated to homepage

  Scenario: check electronics link
    Given user is logged in
    When user clcik on electronics  link
    Then user should navigate to electronics page

  Scenario: check mobiles and tablets link
    Given user is logged in
    When user clcik on mobiles and tablets  link
    Then user should navigate to mobiles and tablets page
