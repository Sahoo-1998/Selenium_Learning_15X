package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Auto_Suggest_dropdown {
@Test
    public void auto_suggest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Chinmay");
        Thread.sleep(5000);

       List<WebElement> Google_options = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//div[@role=\"option\"]"));
    System.out.println( Google_options.size());

    for (WebElement op:Google_options){
        System.out.println(  op.getText());

        Google_options.get(0).click();
        Thread.sleep(1000);
        break;

    }





    }
}
