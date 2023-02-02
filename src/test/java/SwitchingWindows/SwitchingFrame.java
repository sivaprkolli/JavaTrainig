package SwitchingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwitchingFrame {
    WebDriver driver;

    @Test
    public void abTesting() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("frame-top");
        WebElement leftFrame = driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(leftFrame);
        WebElement leftText = driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
        Assert.assertEquals(leftText.getText(), "LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        WebElement middleText = driver.findElement(By.xpath("//div[normalize-space()='MIDDLE']"));

        Assert.assertEquals(middleText.getText(), "MIDDLE");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

        WebElement bottonText = driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']"));
        Assert.assertEquals(bottonText.getText(), "BOTTOM");
    }
}
