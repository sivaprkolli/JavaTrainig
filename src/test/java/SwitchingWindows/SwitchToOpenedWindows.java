package SwitchingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwitchToOpenedWindows {
    WebDriver driver;

    @Test
    public void abTesting() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        WebElement tryForFreeButton = driver.findElement(By.cssSelector("a[href=\"/windows/new\"]"));
        tryForFreeButton.click();

        Set<String> windowsIds = driver.getWindowHandles();
        System.out.println(windowsIds);
        /*String array[]=  windowsIds.toArray().;
        System.out.println(array);*/
        //driver.switchTo().window(windowsIds.)

        for(String window: windowsIds){
            driver.switchTo().window(window);
        }
        WebElement newWindowHeading = driver.findElement(By.cssSelector(".example > h3"));

        Assert.assertEquals(newWindowHeading.getText(), "New Window");
        driver.close();

        driver.switchTo().window(parentWindow);
        Assert.assertTrue(tryForFreeButton.isDisplayed());
        driver.quit();

    }
}
