package com.core.driver.factory.remote;

import com.core.driver.manager.remote.SelenoidChromeManager;
import com.core.driver.manager.remote.SelenoidEdgeManager;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver() : SelenoidEdgeManager.getDriver();
    }

}
