package com.convert.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollAndClick extends  UserActions implements Interaction {

    private String labelText = "";

    public ScrollAndClick(String labelText) {
        this.labelText = labelText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SwipeToElement(actor, labelText);
    }

    public static Interaction on(String labelText) {
        return instrumented(ScrollAndClick.class, labelText);
    }
}
