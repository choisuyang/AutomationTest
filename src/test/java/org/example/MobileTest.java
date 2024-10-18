package org.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest {
   public void setup() {
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "My Phone");
      caps.setCapability("udid", "R3CX20AADQN"); // Give Device ID of your mobile phone
      caps.setCapability("platformName", "Android");
      // caps.setCapability("platformVersion", "6.0"); // 필요시 주석 해제
      caps.setCapability("browserName", "Chrome");
      caps.setCapability("noReset", true);

      // Set ChromeDriver location (주석 해제 필요 시)
      // System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");

      AppiumDriver driver = null;
      try {
         driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
         // Open URL in Chrome Browser
         driver.get("http://www.google.com");
      } catch (MalformedURLException e) {
         System.out.println(e.getMessage());
      } finally {
         if (driver != null) {
            driver.quit(); // 드라이버 종료
         }
      }
   }
}


//package org.example;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class MobileTest {
//   public  AndroidDriver driver;
//
//   @Before
//   public void setup() throws MalformedURLException {
//      String appiumServerUrl = "http://127.0.0.0:4723";
//
//      DesiredCapabilities dc = new DesiredCapabilities();
//      dc.setCapability("platformName","Android");
//      dc.setCapability("appium:automationName","uiautomator2");
//      dc.setCapability("appium:app",System.getProperty("user.dir") + "/apps/ApiDemos.apk");
//
//      driver = new AndroidDriver(new URL(appiumServerUrl),dc);
//   }
//
////   DesiredCapabilities caps = new DesiredCapabilities();
////caps.setCapability("deviceName", "My Phone");
////caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
////caps.setCapability("platformName", "Android");
////caps.setCapability("platformVersion", "6.0");
////caps.setCapability("browserName", "Chrome");
////caps.setCapability("noReset", true);
//
//   @Test
//   public void test() {
//      driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
//   }
//}