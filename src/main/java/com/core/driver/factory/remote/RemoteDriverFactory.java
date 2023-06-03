package com.core.driver.factory.remote;

import com.core.enums.BrowserRemoteModeType;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM_GRID) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
            return SelenoidFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK) {
            return BrowserStackFactory.getDriver(browserType);
        }
        return null;
    }
}
