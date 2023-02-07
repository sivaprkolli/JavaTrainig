package GetScreenShotTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

public class ScreenshotForWebElement {
    WebDriver driver;
    FluentWait fluentWait;

    @AfterTest
    public void killSession() {
        driver.quit();
    }


    public void screenShotOfWebElement() throws InterruptedException, IOException {
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

        WebElement userNameInputBox = driver.findElement(By.cssSelector(".bot_column"));
        File source = userNameInputBox.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+ "/screenshots/logo.png");
        FileUtils.copyFile(source, target);
    }


    public void fullScreenshot() throws IOException {
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

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+ "/screenshots/fullpage.png");
        FileUtils.copyFile(source, dest);
    }
}
