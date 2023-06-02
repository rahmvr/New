package com.selenium.tests;

import com.core.config.BrowserConfig;
import com.core.config.DriverConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testLogin(){

        System.out.println(DriverConfig.getConfig().browser());
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");
        System.out.println(driver.getTitle());
        driver.quit();*/
    }
}
