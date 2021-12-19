package com.convert.tasks;

import com.convert.ui.CalculatorHome;
import com.convert.ui.ListView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectSpeed implements Task {

    private final String menuOption;

    public SelectSpeed(String menuOption) {
        this.menuOption = menuOption;

    }

        @Override
        public <T extends Actor> void performAs(T actor) {

            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(CalculatorHome.BTN_MENU, isClickable()),
                    Click.on(CalculatorHome.BTN_MENU),
                    //Click.on(ListView.OPT_SPEED)
                    Scroll.to(By.xpath("//android.widget.ListView[@text='"+menuOption+"']")),
                    Click.on(By.xpath("//android.widget.ListView[@text='"+menuOption+"']"))
            );

        }
}
