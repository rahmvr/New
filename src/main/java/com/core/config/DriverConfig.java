package com.core.config;

import org.aeonbits.owner.ConfigCache;

public final class DriverConfig {
    private DriverConfig(){}

    public static BrowserConfig getConfig() {
        return ConfigCache.getOrCreate(BrowserConfig.class);
    }
}
