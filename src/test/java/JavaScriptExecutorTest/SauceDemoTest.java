package JavaScriptExecutorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoTest {
    //
    WebDriver driver;
    JavascriptExecutor jse;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }
    @Test
    public void jsClick() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-javascript", "true");

        driver = new ChromeDriver(options);
        jse = (JavascriptExecutor) driver;
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement emailBox  = driver.findElement(By.id("user-name"));
        WebElement passwordBox  = driver.findElement(By.id("password"));
        WebElement loginButton  = driver.findElement(By.id("login-button"));

        String text = "return arguments[0].click()";
        String inputText = "return arguments[0].value='standard_user'";
        String passwordText = "return arguments[0].value='secret_sauce'";
//        emailBox.sendKeys("standard_user");
//        passwordBox.sendKeys("secret_sauce");
        jse.executeScript(inputText, emailBox);
//        emailBox.sendKeys(Keys.TAB);
        jse.executeScript(passwordText, passwordBox);
//        passwordBox.sendKeys(Keys.TAB);
        jse.executeScript(text, loginButton);

       // loginButton.click();
        System.out.println("");

    }
}
