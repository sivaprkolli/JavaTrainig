package TestNGLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTestingBrowsers {
    WebDriver driver;

    @Test
    public void chromeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
    }

    @Test
    public void firefoxTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://webdriveruniversity.com/");
    }

    @Test
    public void safariTest(){
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void edgeTest(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://automationpractice.com/");
    }

    @AfterMethod
    public void killBrowsers(){
        driver.close();
    }
}
