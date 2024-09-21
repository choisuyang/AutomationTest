package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModule {
    private WebDriver driver;

    // Setter 메서드
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void loginModule() throws InterruptedException {
        // 로그인 버튼 클릭
        WebElement loginBtn = driver.findElement(By.className("_loginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        // 아이디 입력
        WebElement inputId = driver.findElement(By.id("id_input"));
        inputId.sendKeys("chltndid724");

        // 비밀번호 입력
        WebElement inputPw = driver.findElement(By.id("password_input"));
        inputPw.sendKeys("cjmall2$");

        // 로그인 버튼 클릭
        WebElement clickLoginBtn = driver.findElement(By.id("loginSubmit"));
        clickLoginBtn.click();
        Thread.sleep(5000);
    }

//    public  void main() throws InterruptedException {
//
//
//        // 로그인 버튼 클릭
//        WebElement loginBtn = driver.findElement(By.className("_loginBtn"));
//        loginBtn.click();
//        Thread.sleep(3000);
//
//        // 아이디 입력
//        WebElement inputId = driver.findElement(By.id("id_input"));
//        inputId.sendKeys("chltndid724");
//
//        // 비밀번호 입력
//        WebElement inputPw = driver.findElement(By.id("password_input"));
//        inputPw.sendKeys("cjmall2$");
//
//        // 로그인 버튼 클릭
//        WebElement clickLoginBtn = driver.findElement(By.id("loginSubmit"));
//        clickLoginBtn.click();
//        Thread.sleep(5000);
//    }

}
