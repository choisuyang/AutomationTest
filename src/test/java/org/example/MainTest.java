package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest {
    public static WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();

        // 온스타일 URL 진입
        driver.get("https://display.cjonstyle.com/p/homeTab/main?hmtabMenuId=H00005");

        LoginModule loginModule = new LoginModule();
        loginModule.setDriver(driver);
        loginModule.loginModule();

    }

    // CJ 온스타일 타이틀 가져오기

    @Order(1)
    @Test
    public void assertTitle() {

        String title = driver.getTitle();
        Assertions.assertEquals(title,"홈 | CJ온스타일");
    }


    @Order(2)
    @Test
    public void assertLogin() {
        String logoutText = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[3]/ul/li[1]/a")).getText();
//        System.out.printf("-->"+logoutText);
        Assertions.assertTrue(logoutText.contains("로그아웃"));

    }



    @After
    public void close (){
        driver.quit();
    }

}