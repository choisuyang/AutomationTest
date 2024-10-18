package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @Test
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("My Phone"); // 디바이스 이름
        options.setUdid("R3CX20AADQN"); // 디바이스 ID
        options.setPlatformName("Android");
        options.setPlatformVersion("6.0"); // Android 버전
//        options.setBrowserName("Chrome"); // 브라우저 설정
        options.setCapability("appPackage","com.cjoshppingphone");
        options.setCapability("appActivity","com.cjoshppingphone.cjmall.main.MainActivity");
//        options.setAppPackage("com.cjoshppingphone");
//        options.setAppActivity("com.cjoshppingphone.cjmall.mlc.main.activity.MLCDetailActivity");
        options.setNoReset(true); // 앱 상태 유지
//        options.setCapability("adbExecTimeout", 30000); // 30초로 타임아웃 증가


        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        //Open URL in Chrome Browser
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.quit();
    }


}