package com.convert.ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class ConversionList {

    public static Target BTN_SPINNER_LEFT = Target.the("Selector option")
            .located(By.xpath("//android.widget.Spinner[@index='0']"));
    public static Target BTN_SPINNER_RIGHT = Target.the("Selector option")
            .located(By.xpath("//android.widget.Spinner[@index='2']"));

}
