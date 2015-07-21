package com.auto.iosapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import com.applitools.eyes.Eyes;

    class First {
        public static void main(String[] args) throws MalformedURLException {
            Eyes eyes = new Eyes();
            // This is your api key, make sure you use it in all your tests.
            eyes.setApiKey("bpNpML20LtjTFtcdLk5IxNvvhqbKRvBaQpfcK5SuuN8110");

            // Setup appium - Make sure the capabilities meets your environment.
            // Refer to http://appium.io documentation if required.
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("platformName", "iOS");
            dc.setCapability("platformVersion", "8.4");
        
            dc.setCapability("deviceName", "iPhone 6");
            
            // The original app from Appium github project.
            dc.setCapability("app", "/Users/mponnusamy/Downloads/1234.ipa");

            WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            try {
                // Start visual testing
                eyes.open(driver, "iOS test application", "test");

                // Visual validation point #1
                eyes.checkWindow("Initial view");
                //driver.findElement(By.name("TextField1")).sendKeys("3");
                //driver.findElement(By.name("TextField2")).sendKeys("5");
                driver.findElement(By.name("login")).click();
                // Visual validation point #2
                eyes.checkWindow("After compute");

                // End visual testing. Validate visual correctness.
                eyes.close();
            } finally {
                eyes.abortIfNotClosed();
                driver.quit();
            }
        }
    }