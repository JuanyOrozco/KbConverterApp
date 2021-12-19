Feature: I as user want to convert speed

  @All
  Scenario: Juana as user wants to convert speed from miles per second to kilometers per second
    Given that Juana is on the main page
    When she enters the value "102" to convert speed from "Milla por segundo" to "Kilometro por segundo"
    Then she sees the correct value "164.1531" converted in the screen