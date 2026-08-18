package com.theTestingAcademy.HandleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment_window_handles {

    @Test
    public void assignment(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

//        Set<String> options =driver.getWindowHandles();
//        List<String> listoptions = new ArrayList<>(options);
//        String count_1 =listoptions.get(0);
//        System.out.println(driver.getTitle());

       // Set<String> Windowhandles = driver.getWindowHandles();

        List <WebElement> list_of_elements = driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//a"));
        System.out.println(list_of_elements.size());

        for(WebElement names :list_of_elements){

            System.out.println(names.getText());
            names.click(); ;
        }

//        for(String links_click : Windowhandles){
//          String title =  driver.switchTo().window(links_click).getTitle();
//          if ( title.equals("Selenium")&& title.equals("Selenium in biology") && title.equals("Selenium (software)")&& title.equals("Selenium disulfide")&& title.equals("Selenium dioxide")){
//              driver
//          }
//
//        }



    }
}
