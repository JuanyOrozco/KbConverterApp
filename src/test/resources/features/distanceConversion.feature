Feature: I as user want to convert distances

  @Smoke @All
  Scenario: Juana as user wants to convert distance from miles to kilometers
    Given that Juana is on the main page
    When she enters the value "127" to convert from "Milla" to "Kilómetro"
    Then she sees the correct value "204.3867" converted in the screen