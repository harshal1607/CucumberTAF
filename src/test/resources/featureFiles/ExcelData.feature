Feature: feature to test excel data on automation practice site

@ExcelDataTest
  Scenario Outline: To verify  contact us functinality
    Given user navigate to contact us page
    When user fills the form from sheetname "<SheetName>" and rownumber<RowNumber>
    And user clicks on send button
    Then it shows a message "Your message has been successfully sent to our team." 
    
    Examples:
    |SheetName|RowNumber|
    |ContactUs|1|
    |ContactUs|2|