//package org.example;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.AppiumDriver;
////import io.appium.java_client.Webelement;
////import org.openqa.selenium.WebElement;
////from appium.webdriver import WebElement
//import org.openqa.selenium.WebElement;
//import io.appium.java_client.android.AndroidDriver;
//
//public class ChromeTest {
//    public static void main(String[] args) {
//
//        //Set the Desired Capabilities
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "My Phone");
//        caps.setCapability("udid", "RFCM9096PKN"); //Give Device ID of your mobile phone
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("platformVersion", "6.0");
//        caps.setCapability("browserName", "Chrome");
//        caps.setCapability("noReset", true);
//
//        //Set ChromeDriver location
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\webdriver\\chromedriver.exe");
//
//        //Instantiate Appium Driver
//        AppiumDriver<Andro> driver = null;
//        try {
//            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
//
//        } catch (MalformedURLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        //Open URL in Chrome Browser
//        driver.get("http://www.google.com");
//    }
//}

package org.example;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;


public class ChromeTest {
    public static void main(String[] args)  {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("My Phone");
        options.setUdid("RFCM9096PKN"); // 디바이스 ID
        options.setPlatformName("Android");
        options.setPlatformVersion("6.0");
//        options.setBrowserName("Chrome");
        options.setNoReset(true);

        // AppiumDriver 인스턴스 생성]]
        AppiumDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
            driver.get("http://www.google.com");

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
