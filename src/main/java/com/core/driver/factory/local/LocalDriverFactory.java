package com.core.driver.factory.local;

import com.core.driver.manager.local.ChromeManager;
import com.core.driver.manager.local.EdgeManager;
import com.core.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return isaBoolean(browserType) ? ChromeManager.getDriver() : EdgeManager.getDriver();
    }

    private static boolean isaBoolean(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }
}
