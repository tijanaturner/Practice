Feature: Modules verification

  Background:
  Given User is logged in page as a Event Manager

  Scenario: Verify the user is logged in as a Event Manager
  When verify user is logged in
  Then user should see 15 modules




