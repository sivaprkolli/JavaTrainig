package MouseActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MoveToElementAndClick {
    WebDriver driver;

    @AfterTest
    public void killSession(){
        driver.quit();
    }
    @Test
    public void selectValueFromDropDown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.marksandspencer.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.cssSelector(".navigation-cookiebbanner__submit")).click();
        Actions actions = new Actions(driver);
        WebElement parentElement = driver.findElement(By.linkText("Kids"));
      //  WebElement childElement = driver.findElement(By.linkText("Soft Toys"));

        actions.moveToElement(parentElement).perform();
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(By.linkText("Soft Toys"))).click().perform();
        Assert.assertTrue(driver.getCurrentUrl().contains("soft-toys"));
        System.out.println("");

    }
}
