package JSETest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddAttributeTest {

    WebDriver driver;
    JavascriptExecutor jse;

    @AfterTest
    public void killBrowser() {
        driver.quit();
    }

    @Test
    public void jsClick() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        jse = (JavascriptExecutor) driver;

        driver.get("https://www.lambdatest.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement seeAllInt = driver.findElement(By.xpath("//a[text()='See All Integrations']"));

        jse.executeScript("return arguments[0].setAttribute('target', '_blank')", seeAllInt);

        seeAllInt.click();

    }
}
