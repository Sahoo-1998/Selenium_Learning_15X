package com.theTestingAcademy.Wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait_Explicit_002 {

    @Test
    public void expli_wait(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait waitmeth = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

      WebElement username = waitmeth.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
      username.sendKeys("admin");

      WebElement paswrd = waitmeth.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"password\"]")));
      username.sendKeys("Hacker@4321");

     WebElement submit = waitmeth.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
     submit.click();
     driver.quit();




    }

}
