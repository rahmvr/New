package com.core.driver.manager.remote;

import com.core.config.UiDriverConfig;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.CHROME));
        return new RemoteWebDriver(UiDriverConfig.getConfig().seleniumGridURL(), capabilities);
    }
}
