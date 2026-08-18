package com.theTestingAcademy.HandleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Assignment_window_handles_2 {

    @Test
    public  void Another_assignment(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        //driver.findElement(By.xpath("https://testautomationpractice.blogspot.com/"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

       List<WebElement> seach_test = driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]/div/a"));
        System.out.println(seach_test.size());

        for ( WebElement names:seach_test){
            System.out.println( names.getText());
            names.click();

        }

        driver.close();




    }
}
