package com.seruvent.csk_002;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

public class HttpsamazoncomtrTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.out.println("HttpsamazoncomtrTest class setting up");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void httpsamazoncomtr() {
        
        driver.get("https://www.amazon.com.tr/");
        
        //driver.findElement(By.id("nav-link-accountList")).click();
        WebElement loginFirst = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-accountList")));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(loginFirst).perform();
        }
        
        //driver.findElement(By.cssSelector("#nav-flyout-ya-signin .nav-action-button")).click();
        WebElement loginSecond = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nav-flyout-ya-signin .nav-action-button")));
        
        loginSecond.click();
        
        
        //driver.findElement(By.id("ap_email")).click();
        //driver.findElement(By.id("ap_email")).sendKeys("kskaraca@gmail.com");
        WebElement email = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
        email.click();
        email.sendKeys(Main.amazonUserMail);
        driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
        
        
        //driver.findElement(By.id("ap_password")).click();
        //driver.findElement(By.id("ap_password")).sendKeys("*K2c0m0e1e2i6*");
        WebElement password = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ap_password")));
        password.click();
        password.sendKeys(Main.amazonPassword);
        driver.findElement(By.id("signInSubmit")).click();
        
        
        //driver.findElement(By.id("twotabsearchtextbox")).click();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        WebElement searchText = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
        searchText.click();
        searchText.sendKeys("Samsung");
        searchText.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollTo(0,376)");
        
        
        //driver.findElement(By.cssSelector(".a-normal:nth-child(3) > a")).click();
        WebElement pagingLink = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".a-normal:nth-child(3) > a")));
        pagingLink.click();
        
        
        //driver.findElement(By.cssSelector(".s-result-list .s-result-item:nth-child(3) .a-link-normal")).click();
        WebElement itemElement = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".s-result-list .s-result-item:nth-child(3) .a-link-normal")));
        itemElement.click();
        
        
        //driver.findElement(By.id("add-to-wishlist-button-submit")).click();
        WebElement addToWishListButton = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-wishlist-button-submit")));
        addToWishListButton.click();
        
        
        //driver.findElement(By.linkText("Görüntüle: Liste")).click();
        WebElement myPopUpElement = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Görüntüle: Liste")));
        myPopUpElement.click();

        
        //driver.findElement(By.linkText("Ürünü kaldır")).click();
        WebElement removeFromWishList = (WebElement) (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Ürünü kaldır")));
        removeFromWishList.click();
        
        
        driver.close();
    }
}
