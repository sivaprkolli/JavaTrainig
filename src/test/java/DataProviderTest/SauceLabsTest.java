package DataProviderTest;

import DataProviderTest.DataProviderData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceLabsTest {
    WebDriver driver;
    @BeforeTest
    public void lauchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test(dataProvider = "SauceUsers", dataProviderClass= DataProviderData.class )
    public void login(String userName, String password){
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());

        driver.findElement(By.cssSelector(".bm-burger-button")).click();
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

    }


}
