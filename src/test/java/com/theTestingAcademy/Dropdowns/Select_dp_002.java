package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Select_dp_002 {

 @Test
    public void drop_downs_002(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       WebElement Drop_down_county_list = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select country_list = new Select(Drop_down_county_list);
      //  System.out.println( country_list.getOptions());
       country_list.selectByValue("japan");
       country_list.selectByContainsVisibleText("China");
       country_list.selectByIndex(4);

     List<WebElement> options = country_list.getOptions();
     System.out.println( options.size());

     for (int i=0 ; i<options.size(); i++){
         System.out.println( options.get(i).getText());
     }

     //enhanced for loop
     for ( WebElement county_names :options){
         System.out.println(county_names.getText());
     }


    }
}
