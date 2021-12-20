Feature: I as user want to convert distances

  @Smoke @All
  Scenario Outline: Juana as user wants to convert distance from miles to kilometers
    Given that Juana is on the main page
    When she enters the value "<value>" to convert "<type>" from "<value1>" to "<value2>"
    Then she sees the correct value "<result>" converted in the screen
    Examples:
      | value | type     | value1     | value2     | result   |
      | 127   | Longitud | Milla      | Kilómetro  | 204.3867 |
      | 107   | Longitud | Pie        | Kilómetro  | 0.03261  |
      | 45    | Longitud | Yarda      | Centimetro | 4 114.8  |
      | 1054  | Longitud | Centimetro | Pie        | 34.5801  |