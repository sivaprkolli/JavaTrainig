package Docker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExecuteTestOnDockerContainer {
       public WebDriver driver;
    @Test
    public void launchBrowser() throws MalformedURLException {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions chromeOptions = new FirefoxOptions();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName", "firefox");

        chromeOptions.merge(desiredCapabilities);
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4445/wd/hub"), chromeOptions);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());

        driver.findElement(By.cssSelector(".bm-burger-button")).click();
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

        driver.quit();

    }
}
