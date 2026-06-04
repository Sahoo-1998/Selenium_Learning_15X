package com.theTestingAcademy.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtables_2_learning {

@Test
    public void web_tables_2() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);

      WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
      username.sendKeys("admin");

      WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
      password.sendKeys("Hacker@4321");

      WebElement loginbtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
      loginbtn.click();

      Thread.sleep(5000);

      String terminated_employee = driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]/div/div[@class=\"oxd-table-body\"]/div[3]/div/div[6]")).getText();
      System.out.println(terminated_employee);


      WebElement delete_button = driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]/div/div[@class=\"oxd-table-body\"]/div[3]/div/div[9]/div/button[@type=\"button\"]"));
      delete_button.click();
     Thread.sleep(5000);


      driver.quit();





    }
}
