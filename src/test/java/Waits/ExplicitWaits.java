package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaits {
    WebDriver driver;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }

    @BeforeTest
    public void launchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.prettylittlething.com/");
    }
   // @Test
    public void testImplicitWait() {

        WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement acceptAllPopUpButton = driver.findElement(By.xpath("//*[text()='Accept Al']"));
        wdWait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Accept All']"), "ACCEPT ALL"));
        Assert.assertTrue(wdWait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Accept All']"), "ACCEPT ALL")));

        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Accept All']")))).click();
        wdWait.until(ExpectedConditions.titleIs("Women's Fashion Clothing & Dresses | PrettyLittleThing"));

       // wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Accept All']"))).click();


    }

    @Test
    public void fluentWait(){
        FluentWait fluentWait = new FluentWait(driver)
                .withMessage("Element not found")
                .ignoring(NoSuchElementException.class)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5));
        fluentWait.until(ExpectedConditions.numberOfElementsToBe( By.xpath("//*[text()='Accept Al']"),1));

    }



}
