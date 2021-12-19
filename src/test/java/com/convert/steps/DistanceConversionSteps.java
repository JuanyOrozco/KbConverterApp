package com.convert.steps;

import com.convert.tasks.SelectOption;
import com.convert.tasks.SelectLenghtConversion;
import com.convert.ui.CalculatorHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DistanceConversionSteps {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("that Juana is on the main page")
    public void that_juana_is_on_the_main_page() {
        theActorCalled("Juana").can(BrowseTheWeb.with(driver));
    }

    @When("she enters the value {string} to convert from {string} to {string}")
    public void sheEntersTheValueToConvertFromTo(String value, String valueLeft, String valueRight) {
        theActorInTheSpotlight().attemptsTo(
                new SelectOption("Longitud"),
                new SelectLenghtConversion(valueLeft, valueRight),
                Click.on(CalculatorHome.BTN_C),
                Click.on(CalculatorHome.BTN_1),
                Click.on(CalculatorHome.BTN_2),
                Click.on(CalculatorHome.BTN_7)
        );

    }
    @Then("she sees the correct value {string} converted in the screen")
    public void sheSeesTheCorrectValueConvertedInTheScreen(String expectedValue) {

        theActorInTheSpotlight().attemptsTo(
                        Ensure.that(CalculatorHome.TXT_VALUE).hasText(expectedValue)
        );
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

}
