package com.core.driver.manager.remote;

import com.core.config.UiDriverConfig;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridEdgeManager {

    private SeleniumGridEdgeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.EDGE));
        return new RemoteWebDriver(UiDriverConfig.getConfig().seleniumGridURL(), capabilities);
    }
}
