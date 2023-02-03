package WebElementPresent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class VerifyWebElement {
    WebDriver driver;

    @AfterTest
    public void killSesison(){
        driver.quit();
    }
    @Test
    public void verifyWebElement() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.prettylittlething.com/");
        WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println(isElementPresentOnThePage(driver.findElement(By.xpath("//*[text()='Accept Al']"))));
       // Assert.assertTrue(isElementPresentOnThePage(driver.findElement(By.xpath("//*[text()='Accept Al']"))));

    }

    public boolean isElementPresentOnThePage(WebElement element){
        boolean flag;
        try{
            element.isDisplayed();
            flag = true;
        }catch (NoSuchElementException nse){
            flag = false;
        }
        return flag;
    }


}
