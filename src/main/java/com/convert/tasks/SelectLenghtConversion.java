package com.convert.tasks;

import com.convert.ui.ConversionList;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectLenghtConversion implements Task {

    private final String leftOption;
    private final String rightOption;

    public SelectLenghtConversion(String leftOption, String rightOption){
        this.leftOption = leftOption;
        this.rightOption = rightOption;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(ConversionList.BTN_SPINNER_LEFT),
                Click.on(By.xpath("//android.widget.TextView[@text='"+leftOption+"']")),
                Click.on(ConversionList.BTN_SPINNER_RIGHT),
                Click.on(By.xpath("//android.widget.TextView[@text='"+rightOption+"']"))
        );


    }


}
