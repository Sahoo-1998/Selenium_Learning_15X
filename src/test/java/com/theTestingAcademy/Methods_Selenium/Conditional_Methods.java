package com.theTestingAcademy.Methods_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Conditional_Methods {

    @Test
    public void conditional_new_meth(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //IsDisplayed
        WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        System.out.println(logo.isDisplayed());

        boolean logo1 = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
        System.out.println(logo1);

        //IsEnabled
       WebElement first_name = driver.findElement(By.xpath("//input[@name=\"FirstName\"]"));
        System.out.println(first_name.isEnabled());

        boolean first_name_1 = driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).isEnabled();
        System.out.println(first_name_1);

        //Is Selected

       WebElement male= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
       //male.click();
        System.out.println(male.isSelected());

      boolean male_1 =   driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).isSelected();
        System.out.println(male_1);







        driver.quit();
     }
}
