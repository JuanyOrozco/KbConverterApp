package com.convert.tasks;

import com.convert.ui.CalculatorHome;
import com.sun.javafx.css.CalculatedValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EnterValueWithButton implements Task {

    private final String value;

    public EnterValueWithButton(String value) {
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CalculatorHome.BTN_C)
        );
        for(int i = 0; i<value.length();i++){
            theActorInTheSpotlight().attemptsTo(
                    Click.on(By.xpath("//android.widget.Button[@text='"+value.charAt(i)+"']"))
            );
        }

    }
}
