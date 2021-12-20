Feature: I as user want to convert speed

  @All
  Scenario Outline: Juana as user wants to do speed conversions
    Given that Juana is on the main page
    When she enters the value "<value>" to convert "<type>" from "<value1>" to "<value2>"
    Then she sees the correct value "<result>" converted in the screen
    Examples:
      | value | type      | value1            | value2             | result      |
      | 55    | Velocidad | Milla por hora    | Kilometro por hora | 88.5139     |
      | 358   | Velocidad | Pie por segundo   | Metro por segundo  | 109.1184    |
      | 97    | Velocidad | Pie por hora      | Metro por hora     | 29.5656     |
      | 80    | Velocidad | Milla por segundo | Pulgada por minuto | 304 128 000 |