package com.core.driver.manager.remote;

import com.core.config.UiDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidEdgeManager {

    private SelenoidEdgeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "edge");
        capabilities.setCapability("browserVersion", "91.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return new RemoteWebDriver(UiDriverConfig.getConfig().selenoidURL(), capabilities);
    }
}
