package com.theTestingAcademy.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Assignment_dp_2 {
@Test
    public void Hidden_dp(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"][1]")).click();
       // driver.findElement(By.xpath("//div[@role=\"listbox\"]//div[4]")).click();

       List<WebElement> all_roles = driver.findElements(By.xpath("//div//div[@role=\"option\"]/span"));
    System.out.println( all_roles.size());

    for (WebElement ar:all_roles){
        System.out.println( ar.getText());
    }

    }
}
