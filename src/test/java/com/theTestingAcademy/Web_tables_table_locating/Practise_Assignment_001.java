package com.theTestingAcademy.Web_tables_table_locating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practise_Assignment_001 {
@Test
    public void blazedemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");

      WebElement dropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));
     // dropdown.click();
      Select departure_city = new Select( dropdown);
      departure_city.selectByContainsVisibleText("Boston");

    WebElement destination_contry = driver.findElement(By.xpath("//select[@name='toPort']"));
    Select dp_countries_dept = new Select(destination_contry);
    dp_countries_dept.selectByValue("Berlin");

    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    Thread.sleep(2000);

   int choose = driver.findElements(By.xpath("//table[@class='table']//tbody//tr[\"+r+\"]/td[1]")).size();
  WebElement drop_down=  driver.findElement(By.xpath("//table[@class='table']//tbody//tr[2]/td[1]//input[@type='submit']"));
  drop_down.click();





    }
}
