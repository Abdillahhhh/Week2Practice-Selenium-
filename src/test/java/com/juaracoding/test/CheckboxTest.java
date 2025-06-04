package com.juaracoding.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    WebElement options1;
    WebElement options2;

    @Test
    public void initElementTest () {
        try {
            options1 = driver.findElement(By.id("vfb-6-1"));
            options2 = driver.findElement(By.id("vfb-6-2"));
        } catch (Exception e) {
        }
    }

    @Test
    public void testStep01() {
        options1.click();
        Assert.assertTrue(options1.isSelected());
    }

    @Test
    public void testStep02() {
        options2.click();
        Assert.assertTrue(options2.isSelected());
    }

}


