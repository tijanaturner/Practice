@US96
Feature: Sales Page Columns

  Scenario Outline: Verify there are 6 columns displayed on the Sales page when POS and Sales managers log in
    Given they are logged in with valid "<username>" and "<password>"
    And user should verify logged in as an "<user>"
    When they navigate and click to the Sales page
    Then they should verify 6 columns are displayed
    Examples:
      | username                | password     | user           |
      | salesmanager52@info.com | salesmanager | SalesManager52 |
      | posmanager16@info.com   | posmanager   | POSManager16   |





