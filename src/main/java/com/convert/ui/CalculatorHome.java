package com.convert.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorHome {

    public static Target TXT_VALUE = Target.the("Enter the value")
            .located(By.id("com.ba.universalconverter:id/target_value"));
    public static Target BTN_MENU = Target.the("Menu option")
            .located(By.xpath("//android.widget.ImageButton[@content-desc='Abrir el cajon de navegacion']"));
    public static Target BTN_0 = Target.the("Number 0")
            .located(By.xpath("//android.widget.Button[@text='0']"));
    public static Target BTN_1 = Target.the("Number 1")
            .located(By.xpath("//android.widget.Button[@text='1']"));
    public static Target BTN_2 = Target.the("Number 2")
            .located(By.xpath("//android.widget.Button[@text='2']"));
    public static Target BTN_3 = Target.the("Number 3")
            .located(By.xpath("//android.widget.Button[@text='3']"));
    public static Target BTN_4 = Target.the("Number 4")
            .located(By.xpath("//android.widget.Button[@text='4']"));
    public static Target BTN_5 = Target.the("Number 5")
            .located(By.xpath("//android.widget.Button[@text='5']"));
    public static Target BTN_6 = Target.the("Number 6")
            .located(By.xpath("//android.widget.Button[@text='6']"));
    public static Target BTN_7 = Target.the("Number 7")
            .located(By.xpath("//android.widget.Button[@text='7']"));
    public static Target BTN_8 = Target.the("Number 8")
            .located(By.xpath("//android.widget.Button[@text='8']"));
    public static Target BTN_9 = Target.the("Number 9")
            .located(By.xpath("//android.widget.Button[@text='9']"));
    public static Target BTN_SWITCH = Target.the("Button switch conversion")
            .located(By.xpath("//android.widget.ImageButton[@content-desc='Cambiar las unidades']"));
    public static Target BTN_PLUSMINUS = Target.the("Button positive/negative")
            .located(By.xpath("//android.widget.Button[@text='+/-']"));
    public static Target BTN_C = Target.the("Button C")
            .located(By.xpath("//android.widget.Button[@text='C']"));
}

