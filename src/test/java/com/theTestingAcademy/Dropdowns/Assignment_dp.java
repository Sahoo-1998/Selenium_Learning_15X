package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Assignment_dp {

    @Test
    public void dropdown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(5));

      WebElement dropdown_countries = driver.findElement(By.xpath("//select[@id=\"country-list\"]"));
        Select countries_name = new Select(dropdown_countries);
       // countries_name.selectByIndex(1);
        //countries_name.selectByContainsVisibleText("India");
        countries_name.selectByValue("5");

       List <WebElement> allcountry_names = countries_name.getOptions();
        System.out.println(allcountry_names.size());

        for ( int i = 1 ; i< allcountry_names.size(); i++){
            System.out.println(   allcountry_names.get(i).getText());
        }

    }
}
