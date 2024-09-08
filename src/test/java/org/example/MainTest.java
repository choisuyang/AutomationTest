package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.jupiter.api.Assertions.*;

public class MainTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://display.cjonstyle.com/p/homeTab/main?hmtabMenuId=H00005");

    }

    @Test
    public void assertTitle() {
        String title = driver.getTitle();
//        System.out.println("->" + title);
//        Assertions.assertTrue(title.equals("홈 | CJ온스타일"));
        assertEquals(title,"홈 | CJ온스타일");
//        String clickLogin = "//*[@id=\"header\"]/div/div[1]/div[3]/ul/li[1]/a";
//        System.out.println("--->" + clickLogin);
//        driver.findElement(By.xpath(clickLogin));

    }
//    @Disabled
//    void clickLogin(){
//
//    }

    @After
    public void close (){
        driver.quit();
    }

}