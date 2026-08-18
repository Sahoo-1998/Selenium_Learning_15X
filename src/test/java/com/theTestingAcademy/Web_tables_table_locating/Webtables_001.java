package com.theTestingAcademy.Web_tables_table_locating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Webtables_001 {
@Test
    public  void tables_we(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //find the no of rows
      int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
    System.out.println("No of rows : "+ rows);
    //find the no of colums
    int cols = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
     System.out.println("No of cols : "+ cols);

     //find the exact row and column place holder
   String name_of_row = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[1]")).getText();
    System.out.println("name of exact wor:"+ name_of_row);

    //now find all the elements in the row and columns
//    for ( int r =2 ; r <=rows ; r++)
//    {
//        for ( int c = 1 ; c<=cols ; c++){
//           String all_details = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
//            System.out.print(all_details + " ");
//        }
//        System.out.println();
//
//    }

//    //print books name whose auth are amit
//    for ( int r = 2; r<=rows; r++){
//       String author_name= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//
//       if( author_name.equals("Amit")){
//          String book_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//           System.out.println(book_name);
//       }
//    }

    //find the sum of all books cost
    int total = 0;
    for ( int r =2 ; r<=rows; r++ ){
       String cost=  driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[4]")).getText();
       total = total + Integer.parseInt(cost);
    }
    System.out.println("sum of all books cose:" + total );


    }
}
