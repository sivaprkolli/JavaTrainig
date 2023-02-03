package AlertsHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JsAlerts {
    WebDriver driver;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }

    @BeforeTest
    public void launchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

   // @Test
    public void handleJSAlert(){
        WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href=\"/javascript_alerts\"]"))).click();
        driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
        wdWait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void handleJSConfirmAlert(){
        WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href=\"/javascript_alerts\"]"))).click();
        driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
        wdWait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}
