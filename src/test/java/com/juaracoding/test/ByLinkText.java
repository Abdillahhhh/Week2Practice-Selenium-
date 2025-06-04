package com.juaracoding.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByLinkText extends BaseTest {

    @Test (enabled=false)
    public void testStep01 () throws InterruptedException {
        Thread.sleep(2000);
            List<WebElement> daftarLinks = driver.findElements(By.linkText("click here"));
            
            for (WebElement element : daftarLinks) {
                System.out.println("Link HREF >>" + element.getAttribute("href"));
            }

            System.out.println(driver.getTitle());
    }

        @Test
    public void testStep02 () throws InterruptedException {
        Thread.sleep(2000);
            WebElement linkPertama = driver.findElement(By.partialLinkText("here"));
            System.out.println(linkPertama.getAttribute("href"));
            
    }
}
