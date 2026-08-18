package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Select_Dropdowns {

    @Test
    public void select_dd(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

     WebElement conutry_dropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select dropdown = new Select( conutry_dropdown);

        //now select the options from dropdown
        dropdown.selectByContainsVisibleText("Canada");
        dropdown.selectByIndex(0);
        dropdown.selectByValue("japan");

        //now i wannt the namaes of all country and the count as well
     List<WebElement> country_options = dropdown.getOptions();
        System.out.println(country_options.size());

        //print the  dropdown names of country
//        for ( int i =0 ; i<country_options.size(); i++){
//            System.out.println( country_options.get(i).getText());
//        }
//
        //want enhanced for loop
        for ( WebElement options:country_options){
            System.out.println( options.getText());
        }


    }
}
