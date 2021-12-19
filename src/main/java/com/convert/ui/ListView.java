package com.convert.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListView {

    public static Target MENU_LIST = Target.the("Element lists")
            .located(By.id("com.ba.universalconverter:id/category_list_drawer"));
    public static Target OPT_LENGTH = Target.the("Lenght Option").
            located(By.xpath("//android.widget.TextView[@text='Longitud']"));
    public static Target OPT_SPEED = Target.the("Speed Option").
            located(By.xpath("//android.widget.TextView[@text='Velocidad']"));



}
