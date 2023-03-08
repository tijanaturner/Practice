Feature: Calendar functionality

  @try
  Scenario: Calendar time list verification start from 0:00 til 23:00
    Given user is on the login page of the Oddo app
    When user enters username
    And user enters password
    And user should see the Discuss page
    Then user should click on Calendar page
    Then user should see the time list displays, increased by one hour each time
      | 0:00  |
      | 1:00  |
      | 2:00  |
      | 3:00  |
      | 4:00  |
      | 5:00  |
      | 6:00  |
      | 7:00  |
      | 8:00  |
      | 9:00  |
      | 10:00 |
      | 11:00 |
      | 12:00 |
      | 13:00 |
      | 14:00 |
      | 15:00 |
      | 16:00 |
      | 17:00 |
      | 18:00 |
      | 19:00 |
      | 20:00 |
      | 21:00 |
      | 22:00 |
      | 23:00 |


