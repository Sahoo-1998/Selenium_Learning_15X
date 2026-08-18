package com.theTestingAcademy.Checkboxes_n_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class checkbox_001 {

    @Test
    public void multiple_check_boxes() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //locate all the days of checkboxes
       List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//       for(int i =0; i< checkboxes.size(); i++){
//           checkboxes.get(i).click();
//       }
//        System.out.println(checkboxes.size());

//        for(WebElement checkbox_count:checkboxes){
//            checkbox_count.click();
//        }
//        //locate only last 4 checkboxes
//        for(int i = 3; i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//        }
//        //locate the 1st 3 elements of checkboxes
//        for ( int i =0; i<3;i++){
//            checkboxes.get(i).click();
//        }
        //now unselect the selected checboxes
        for (int i=0; i<3;i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(4000);
        for (int i =0;i<3; i++){
            if (checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }


    }
}
