package com.juaracoding.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class Hook {
    @BeforeSuite
    @Parameters({"url"})

    public static void initialize(String url) {
        WebDriver driver = DriverSingleton.createOrGetDriver();
        driver.get(url);

    }

    @AfterSuite
    public static void finalTearDown() {
        DriverSingleton.quitDriver();
    }
}

