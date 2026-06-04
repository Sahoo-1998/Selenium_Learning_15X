package com.theTestingAcademy.HandleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Window_Handle_closing {

    @Test
    public void close_window_handles(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
        driver.findElement(By.xpath("//div/p/a[@target=\"_blank\"]")).click();

        Set<String> windowhand =driver.getWindowHandles();

        for (String winclose:windowhand){
           String title1 =driver.switchTo().window(winclose).getTitle();
           if(title1.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM")){
               driver.close();
           }
        }

    }

}
