package com.convert.steps;

import com.convert.tasks.EnterValueWithButton;
import com.convert.tasks.SelectLenghtConversion;
import com.convert.tasks.SelectOption;
import com.convert.ui.CalculatorHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SpeedConversionSteps {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("she enters the value {string} to convert speed from {string} to {string}")
    public void sheEntersTheValueToConvertSpeedFromTo(String value, String vLeft, String vRight) {


        theActorInTheSpotlight().attemptsTo(
                new SelectOption("Velocidad"),
                new SelectLenghtConversion(vLeft, vRight),
                Click.on(CalculatorHome.BTN_C),
                new EnterValueWithButton(value)
        );
    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}
