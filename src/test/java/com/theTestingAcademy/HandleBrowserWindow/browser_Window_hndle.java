package com.theTestingAcademy.HandleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class browser_Window_hndle {

    @Test
    public void browser_window(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div/p/a[@target=\"_blank\"]")).click();

        Set<String> windowhandle = driver.getWindowHandles();
//  Approach-1
//        List<String> windowlist = new ArrayList<>(windowhandle);
//
//        String parent =windowlist.get(0);
//        String child =  windowlist.get(1);
//        driver.switchTo().window(child);
//        System.out.println(driver.getTitle());
//
//        driver.switchTo().window(parent);
//        System.out.println(driver.getTitle());

        //Approach-2

        for (String winhand: windowhandle){
              String title =  driver.switchTo().window(winhand).getTitle();

              if(title.equals("OrangeHRM")) {
                  System.out.println(driver.getTitle());
            }


        }



        //driver.quit();

    }
}
