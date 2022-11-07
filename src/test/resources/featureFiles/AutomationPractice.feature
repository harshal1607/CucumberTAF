@SmokeTest
Feature: feature to test  diffrent functionalities on automation practice site

  @RadioTest
  Scenario: check radio button is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user click radio button
    Then radio button should be selected

  @DropdownTest
  Scenario: check dropdown option is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user click on dropdown option
    Then dropdown should be selected

  @CheckboxTest
  Scenario: check checkbox option is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user select checkbox option
    Then checkbox should be selected

  @OpenWindowTest
  Scenario: check open window is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user click on open window
    Then user should navigated new page

  @SuggestionTest
  Scenario: check suggestion class is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user enter country name India in textbox
    Then country name India should be selected

  @MouseHovortest
  Scenario: check mouse hovor is working
    Given automation practice site is open
    And user is on automation practice site  home page
    When user mouse hovor on mouse hovor button
    Then two options should display

  @openTabTest
  Scenario: check open tab is working
    Given automation practice site is open
    And user is on automation practice site  home page
    When user click on open tab
    Then user should navigated new page

  @ElementNotDisplayedTest
  Scenario: check element dispalyed is working
    Given automation practice site is open
    And user is on automation practice site  home page
    When user click on hide button
    Then user should not able to see textbox

  @ElementDisplayedTest
  Scenario: check element dispalyed is working
    Given automation practice site is open
    And user is on automation practice site  home page
    When user click on show button
    Then user should  able to see textbox

  @WebTableTest
  Scenario: check webTable functionality is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user enters  any row number
    Then user should  able to get that row data

  @FrameTest
  Scenario: check radio button is working
    Given automation practice site is open
    And user is on automation practice site home page
    When user click iframe example button
    Then user should verify image RS

  @DataTableTest
  Scenario: To verify  data table text fields are displayed
    Given automation practice site is open
    When user is on automation practice site home page
    Then user should verify data table text fields are dispalyed
      | Fields   |
      | Name     |
      | Position |
      | City     |
      | Amount   |

  @FBDataTableTest
  Scenario: To verify  FB Sign up page text fields are displayed
    Given user is on FB Sign up page
    When user click on create new account button
    Then user should verify FB sign up  text fields are dispalyed
      | fields         |
      | firstname      |
      | lastname       |
      | reg_email__    |
      | reg_passwd__   |
      | birthday_day   |
      | birthday_month |
      | birthday_year  |
      | Female         |
      | Male           |
      | Custom         |
      | Sign Up        |

  @AlertTest
  Scenario Outline: check switch to alert button  working
    Given automation practice site is open
    And user is on automation practice site is home page
    When user enter <username> in text box
    And click on alert button
    Then alert popup should display
    And user should able to close popup displayed

    Examples: 
      | username |
      | vasanti  |
      | Kulkarni |
      | Akshara  |

  @ExcelDataTest
  Scenario: verify sign up functionality using excel data
   Given user is on FB Sign up page
    When user enters first name
    And user enters surname
    Then user should sign up fields
