package VerificationMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selected extends CommonMethod{
WebDriver driver;
    @Test
    public void verifyIsDisplayedMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/#/");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement checkBox = driver.findElement(By.xpath("//label[normalize-space()='Screwdriver']/child::input"));
        checkBox.click();

        System.out.println(checkBox.isSelected());
        Assert.assertTrue(checkBox.isSelected());
    }
}
