package com.core.driver.manager.remote;

import com.core.config.BrowserStackConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackEdgeManager {

    private BrowserStackEdgeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "edge");
        capabilities.setCapability("browserVersion", "91.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return new RemoteWebDriver(BrowserStackConfig.getConfig().browserStackURL(), capabilities);
    }
}
