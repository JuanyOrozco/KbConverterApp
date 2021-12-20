package com.convert.runners;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.convert.steps",
        features = "src/test/resources/features",
        tags = "@All")

public class Runner {

    static AppiumDriverLocalService appiumService = null;

    @BeforeClass
    public static void startAppiumServer() {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
    }

    @AfterClass
    public static void stopAppiumServer() {
        appiumService.stop();
    }
}
