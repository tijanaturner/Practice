Feature: User can be able to access the documentation page
@vezba
  Scenario: User access the documentation page and verify there is 4 document topics are listed
    Given user is logged in the Odoo main page
    When user should click on  POSManager in top right corner
    And user should click on documentation button
    And user should verify the “Odoo Documentation” message is displayed on a new window
    Then user shouldn verify there are 4 main document topics are listed