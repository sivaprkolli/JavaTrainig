package MouseActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class KeyBoardActions {
    WebDriver driver;
    FluentWait fluentWait;

    @AfterTest
    public void killSession(){
        driver.quit();
    }
    @Test
    public void selectValueFromDropDown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        fluentWait = new FluentWait(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(10))
                .withMessage("Element not found in specified duration")
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));

        WebElement userNameInputBox = driver.findElement(By.id("user-name"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        userNameInputBox.sendKeys("standard_user");
        userNameInputBox.sendKeys(Keys.TAB);
        passwordInputBox.sendKeys("xyz");
        passwordInputBox.submit();
        System.out.println();
        //driver.findElement(By.id("password")).sendKeys();
    }

}
