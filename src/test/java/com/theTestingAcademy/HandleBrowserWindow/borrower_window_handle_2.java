package com.theTestingAcademy.HandleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class borrower_window_handle_2 {

    @Test
    public void random(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
      //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
     //   driver.manage().window().maximize();

        driver.findElement(By.xpath("//div/p[2]/a[@target=\"_blank\"]")).click();

        Set<String> webhandles =driver.getWindowHandles();

//        List<String> webhandlelist = new ArrayList<>(webhandles);
//        String parentid = webhandlelist.get(0);
//        String childid = webhandlelist.get(1);
//
//        driver.switchTo().window(parentid);
//        System.out.println(driver.getTitle());
//
//        driver.switchTo().window(childid);
//        System.out.println(driver.getTitle());

        for(String variableweb : webhandles){
          String title = driver.switchTo().window(variableweb).getTitle();
          if(title.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM")){
              System.out.println(driver.getTitle());
          }


        }







    }
}
