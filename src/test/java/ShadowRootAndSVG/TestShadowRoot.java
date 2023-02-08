package ShadowRootAndSVG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestShadowRoot {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        SearchContext mainShadowRoot = driver.findElement(By.cssSelector("book-app[apptitle=\"BOOKS\"]")).getShadowRoot();
        mainShadowRoot.findElement(By.cssSelector("input[aria-label=\"Search Books\"]")).sendKeys("Test Automation");
    }
}
