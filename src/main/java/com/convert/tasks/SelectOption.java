package com.convert.tasks;

import com.convert.interactions.ScrollAndClick;
import com.convert.questions.SeeListOption;
import com.convert.ui.CalculatorHome;
import com.convert.ui.ListView;
import io.cucumber.java.ca.Cal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

import java.util.List;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actions.Hit.the;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectOption implements Task {

    private final String menuOption;

    public SelectOption(String menuOption) {
        this.menuOption = menuOption;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        theActorInTheSpotlight().
                attemptsTo(
                        WaitUntil.the(CalculatorHome.BTN_MENU, isClickable()),
                        Click.on(CalculatorHome.BTN_MENU),
                        ScrollAndClick.on(menuOption)
                );
    }
}
