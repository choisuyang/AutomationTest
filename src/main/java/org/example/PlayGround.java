package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PlayGround {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://display.cjonstyle.com/p/homeTab/main?hmtabMenuId=H00005");
        Thread.sleep(3000);
        // 현재 창의 핸들 저장 (기본 창)
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main window handle: " + mainWindowHandle);

        // 버튼 클릭 등으로 인해 팝업 창이 열렸다고 가정
        // 팝업 창 핸들 찾기
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        // 팝업 창으로 전환
        while (iterator.hasNext()) {
            String windowHandle = iterator.next();

            // 팝업 창을 찾으면 전환
            if (!mainWindowHandle.equals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to popup window: " + windowHandle);

                // 팝업 창에서 필요한 작업 수행
                // 예: 팝업 창 닫기
                driver.close();
                System.out.println("Popup window closed");
                //tet
            }
        }

        // 다시 기본 창으로 전환
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Switched back to main window");



//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[3]/ul/li[1]/a")).click();
//        clickButtonByName(driver, "로그인");
        Thread.sleep(3000);

        driver.quit();

    }


    // 버튼명을 기준으로 버튼 클릭
    public static boolean clickButtonByName(WebDriver driver, String buttonName) {
        try {
            // XPath로 버튼 찾기
            WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
            button.click(); // 클릭 이벤트 발생
            return true;
        } catch (Exception e) {
            System.out.println("버튼을 찾을 수 없습니다: " + e.getMessage());
            return false;
        }
    }
}


