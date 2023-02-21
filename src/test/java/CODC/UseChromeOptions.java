package CODC;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UseChromeOptions {
    WebDriver driver;

    @Test
    public void testOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("disable-infobars");
        //chromeOptions.addArguments("--disable-infobars");
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:8080/login?from=%2F");
    }

    @Test
    public void testDesiredCapabilites(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("enable-automation");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName", "chrome");
        desiredCapabilities.setCapability("browserVersion", "109");

        chromeOptions.merge(desiredCapabilities);
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:8080/login?from=%2F");
    }
}
