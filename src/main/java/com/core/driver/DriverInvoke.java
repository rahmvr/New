package com.core.driver;

import com.core.config.UiDriverConfig;
import com.core.driver.factory.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class DriverInvoke {
    static WebDriver driver = null;

    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver(UiDriverConfig.getConfig().browser());
        driver.get("https://www.google.co.in");
    }

    public static void quitDriver() {
        driver.quit();
    }
}
