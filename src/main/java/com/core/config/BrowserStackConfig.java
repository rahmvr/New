package com.core.config;

import org.aeonbits.owner.ConfigCache;

public class BrowserStackConfig {

    private BrowserStackConfig() {
    }

    public static BrowserStackInterface getConfig() {
        return ConfigCache.getOrCreate(BrowserStackInterface.class);
    }
}
