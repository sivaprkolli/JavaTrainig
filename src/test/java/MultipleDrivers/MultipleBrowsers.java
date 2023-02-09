package MultipleDrivers;

import Assignments.ParaBank;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleBrowsers {
    WebDriver chomeDriver;
    WebDriver firefoxDriver;
    ParaBank paraBank;

    @Test
    public void verifyMultipleBrowsers() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        paraBank = new ParaBank();
        chomeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();

        try {
            paraBank.openAnAccount(chomeDriver, "siva9kolli@gmail.com", "selenium");
        }catch (Exception e) {
            paraBank.openAnAccount(firefoxDriver, "agiri", "agiri");
        }



    }
}
