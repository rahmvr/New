package com.core.driver.factory.remote;

import com.core.driver.manager.remote.BrowserStackChromeManager;
import com.core.driver.manager.remote.BrowserStackEdgeManager;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class BrowserStackFactory {
    private BrowserStackFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver() : BrowserStackEdgeManager.getDriver();
    }

}
