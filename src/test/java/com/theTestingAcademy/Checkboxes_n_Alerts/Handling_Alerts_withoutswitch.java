package com.theTestingAcademy.Checkboxes_n_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handling_Alerts_withoutswitch {

@Test
    public void without_switch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration of exp wait
        driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);

      Alert alret_element = mywait.until(ExpectedConditions.alertIsPresent());
    System.out.println(alret_element.getText());
    alret_element.accept();

    }

}
