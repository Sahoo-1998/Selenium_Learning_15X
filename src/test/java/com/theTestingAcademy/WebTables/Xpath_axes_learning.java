package com.theTestingAcademy.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Xpath_axes_learning {

    @Test
    public void xpath_axes_new(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //self node
       WebElement self_node = driver.findElement(By.xpath("//a[contains(text(),\"BASF India Lt\")]/self::a"));
        System.out.println( self_node.getText());

        //parent node
       WebElement parent_node = driver.findElement(By.xpath("//a[contains(text(),\"BASF India Lt\")]/parent::td"));
        System.out.println(parent_node.getText());

        //Child node
        List<WebElement> child_node = driver.findElements(By.xpath("//a[contains(text(),\"BASF India Lt\")]/ancestor::tr/child::td"));
        System.out.println(child_node.size());

        //ancestor nodr
       WebElement ancestro_node = driver.findElement(By.xpath("//a[contains(text(),\"BASF India Lt\")]/ancestor::tr"));
        System.out.println(ancestro_node.getText());

        //following node
      List<WebElement> following =  driver.findElements(By.xpath("//a[contains(text(),\"BASF India Lt\")]/ancestor::tr/following::tr"));
        System.out.println( "Number of following nodes: "+ following.size());

        //follwing sibling
       List<WebElement> follwing_sibling = driver.findElements(By.xpath("//a[contains(text(),\"BASF India Lt\")]/ancestor::tr/following-sibling::tr"));
        System.out.println(  "Number of following-sibling nodes: "+follwing_sibling.size());

        //prceding node
        List<WebElement> preceding_node= driver.findElements(By.xpath("//a[contains(text(),\"BASF India Lt\")]/ancestor::tr/preceding::tr"));
        System.out.println(  "Number of Precedig nodes: "+preceding_node.size());

        //preceeding sibling
        List<WebElement> Preceding_sibling = driver.findElements(By.xpath(" //a[contains(text(),\"BASF India Lt\")]/ancestor::tr/preceding-sibling::tr"));
        System.out.println( "Number of preceding sibling nodes: "+preceding_node.size());

        driver.quit();
    }
}
