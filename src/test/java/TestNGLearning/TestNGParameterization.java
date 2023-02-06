package TestNGLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGParameterization {
    WebDriver driver;

    @Parameters({"url", "userName", "password"})
    @BeforeTest
    public void beforeTest(@Optional("http://localhost:8080/login?from=%2F")String url, @Optional("siva")String uName, @Optional("siva")String pwd){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(url);
        driver.findElement(By.id("j_username")).sendKeys(uName);
        driver.findElement(By.name("j_password")).sendKeys(pwd);
    }

    @AfterTest
    public void  killSession(){
        driver.quit();
    }
    @Test
    public void test(){

    }
}
