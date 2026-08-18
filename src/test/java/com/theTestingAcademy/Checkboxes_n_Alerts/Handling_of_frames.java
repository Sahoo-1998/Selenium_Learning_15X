package com.theTestingAcademy.Checkboxes_n_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handling_of_frames {

    @Test
    public void frames(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

     //frame 1 locating
      WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
      driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Chinmay");
       // System.out.println(frame1.getText());
        driver.switchTo().defaultContent();


        //frame 2 locating
         WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
         driver.switchTo().frame(frame2);
         driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("sahoo");
         driver.switchTo().defaultContent();

         //frame 3 - inside that iframe is there( inner frame)

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("RCS");
        //driver.switchTo().defaultContent();


        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id=\"i6\"]//div[ @class=\"AB7Lab Id5V1\"]")).click();
        driver.switchTo().defaultContent();


    }
}
