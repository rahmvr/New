package com.core.config;

import org.aeonbits.owner.ConfigCache;

public final class UiDriverConfig {
    private UiDriverConfig() {
    }

    public static UiExecutorInterface getConfig() {
        return ConfigCache.getOrCreate(UiExecutorInterface.class);
    }
}
