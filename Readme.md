# Koombea Testing Challenge: Conversor De Unidades App
This project was designed based on Screenplay Pattern, using Serenity BDD and Cucumber as main testing framework, the language used is Java and the main library used is Appium to perform all the tests on mobile application.

There are 2 scenarios, one runs lenght conversions, and other runs speed conversiones.


Installation
Clone the project from [GitHub](https://github.com/JuanyOrozco/KbConverterApp).

## Execution

Run the 'Runner Class', to change or run an specific test change the @Tag placed, currently there are 2, Smoke and All.

To run all testes in maven use

```
mvn clean verify test -D"cucumber.filter.tags=@Smoke or @All"
```
For a single suite use one Tag
```
mvn clean verify test -D"cucumber.filter.tags=@All"
```
