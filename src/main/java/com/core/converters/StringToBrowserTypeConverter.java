package com.core.converters;

import org.aeonbits.owner.Converter;
import com.core.enums.BrowserType;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType>{

    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String,BrowserType> stringBrowserTypeMap = Map.of("CHROME",BrowserType.CHROME,"EDGE",BrowserType.EDGE);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
       // return BrowserType.valueOf(browserName.toUpperCase());
    }
}
