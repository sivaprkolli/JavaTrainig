package UnderStandingPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyABTest {
    WebDriver driver;
    @Test
    public void verifyErrorMessages(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ABTestPage abTestPage = new ABTestPage(driver);
        abTestPage.clickOnLoginButton();
    }

    @Test
    public void verifyHeading(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ABTestPage abTestPage = new ABTestPage(driver);
        abTestPage.openLink("A/B Testing");
        Assert.assertTrue(abTestPage.verifyABTestHeading());
    }
}
