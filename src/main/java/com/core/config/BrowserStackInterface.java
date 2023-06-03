package com.core.config;

import com.core.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browserStack.properties"
})
public interface BrowserStackInterface extends Config {

    @Key("userName")
    String userName();

    String authKey();

    @DefaultValue("${userName}+${authKey}")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
}
