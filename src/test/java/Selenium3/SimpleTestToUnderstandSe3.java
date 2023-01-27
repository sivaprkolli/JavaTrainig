package Selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SimpleTestToUnderstandSe3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();
        WebDriver safariDriver = new SafariDriver();

        WebDriverManager.firefoxdriver().setup();
        //WebDriver firefoxDriver = new FirefoxDriver();
        //RemoteWebDriver firefoxDriver = new FirefoxDriver();
       // FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("http://127.0.0.1:8080/src/html/");

        Thread.sleep(2000);
        firefoxDriver.quit();

    }
}
