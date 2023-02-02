package VerificationMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selected extends CommonMethod{
WebDriver driver;
    @Test
    public void verifyIsDisplayedMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("https://practicesoftwaretesting.com/#/");
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        WebElement checkBox = driver.findElement(By.xpath("//*[text()='Main Services Agreement']/../../div"));
        //checkBox.click();
        jse.executeScript("arguments[0].click();", checkBox);

        System.out.println(checkBox.isSelected());
        Assert.assertTrue(checkBox.isSelected());
    }

    @AfterTest
    public void kilSession(){
        driver.quit();
    }
}
