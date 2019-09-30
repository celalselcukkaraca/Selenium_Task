
package com.seruvent.csk_002;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static String webDriverDirectory = "src/main/resources/chrome_77.0.3865/chromedriver";
    public static String amazonUserMail = "cskaracatest@gmail.com";
    public static String amazonPassword = "csk213026";
    
    // JUNIT
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", webDriverDirectory);
        Result result = JUnitCore.runClasses(HttpsamazoncomtrTest.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

    
    // Default
    public static void main2(String[] args) {
        System.setProperty("webdriver.chrome.driver", webDriverDirectory);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.amazon.com.tr/");
        driver.close();
    }

}
