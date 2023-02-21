package JSETest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ScrollToElementJS {
    WebDriver driver;
    JavascriptExecutor jse;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }
    @Test
    public void jsClick() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) driver;

        driver.get("http://localhost:8080/");
        WebElement element = driver.findElement(By.cssSelector("a[href^='api']"));
        String text = "return arguments[0].scrollIntoView(true)";
        String text1 = "return arguments[0].setAttribute('style', 'background-color:#ff9800')";
        jse.executeScript(text1, element);
        jse.executeScript(text, element);
        System.out.println();
    }

}
