package com.core.driver.factory.remote;

import com.core.driver.manager.remote.SeleniumGridChromeManager;
import com.core.driver.manager.remote.SeleniumGridEdgeManager;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver() : SeleniumGridEdgeManager.getDriver();
    }
}
