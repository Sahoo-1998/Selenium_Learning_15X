package com.theTestingAcademy.Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Method_001 {

    @Test
    public void get_all_methods() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
      //  System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());

        driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
        Thread.sleep(3000);

        System.out.println(  driver.getWindowHandles());


        driver.quit();



    }
}
