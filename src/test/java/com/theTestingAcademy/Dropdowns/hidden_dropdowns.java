package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class hidden_dropdowns {
@Test
    public void hidden_dp() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       WebElement username =  driver.findElement(By.xpath("//input[@name=\"username\"]"));
       username.sendKeys("Admin");

       WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
       password.sendKeys("admin123");

       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       Thread.sleep(5000);
//Locare PIM tab
       driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
//Show the dropdowns for jobtitle thing
       driver.findElement(By.xpath("(//div//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();

     //select one dropdownoption
    //driver.findElement(By.xpath("//div[@role=\"listbox\"]/div[4]")).click();

    //List of all dropdown names
  List<WebElement> dropdowmn_list = driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
    System.out.println(dropdowmn_list.size());

    for ( WebElement dp_names :dropdowmn_list){
        System.out.println(  dp_names.getText());
    }
    }
}
