package VerificationMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Displayed extends CommonMethod{
    WebDriver driver;

    @Test
    public void verifyIsDisplayedMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  WebElement phoneNumberInputBox = driver.findElement(By.cssSelector("input[aria-describedby^='UserPhone']"));
        Assert.assertTrue(isWebElementDisplayed(driver.findElement(By.cssSelector("input[id^='UserPhone']"))));
    }


}
