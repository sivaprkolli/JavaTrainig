package UIValidation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyColourOfTheElement {
    WebDriver driver;
    WebDriverWait wait;
    @Test
    public void handleTableData() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String actualColour = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.button"))).getCssValue("background-color");
        System.out.println("actualColour :: "+ actualColour);
        Assert.assertEquals(actualColour, "rgba(202, 129, 37, 1)");
    }
}
