package com.theTestingAcademy.Checkboxes_n_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_of_Alerts {

@Test
    public  void Alerts() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
    driver.manage().window().maximize();

    //Complete normal alert pop-ups
//    driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//    Thread.sleep(4000);
//    //driver.switchTo().alert().accept();
//    Alert alerts = driver.switchTo().alert();
//    //alerts.accept();
//    System.out.println(alerts.getText());
//    alerts.accept();

    //confirmation alert process (Accept and dismiss)

//    driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//    Thread.sleep(4000);
//
//    Alert alerts = driver.switchTo().alert();
//
//   // alerts.accept();
//   alerts.dismiss();

    //sending keys in alerts
    driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
    Thread.sleep(5000);
   Alert alert = driver.switchTo().alert();
    Thread.sleep(5000);
   alert.sendKeys("Chinmay");

   alert.accept();


   // driver.quit();

    }
}
