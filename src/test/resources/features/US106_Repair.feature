@repair
Feature:  login as a pos and sales manager

Scenario: As a POS manager
When user clicks on the Repairs button as a POS manager
Then user should be able to see 6 columns for the repairs orders as a POS manager


Scenario: As a sales manager
When user clicks on the Repairs button as a sales manager
Then user should be able to see 6 columns for the repairs orders as a sales manager

