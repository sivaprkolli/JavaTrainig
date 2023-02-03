package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaits {
    WebDriver driver;
    @Test
    public void testImplicitWait(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.prettylittlething.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[text()='Accept All']")).click();
        WebElement newInMenuLink = driver.findElement(By.xpath("//div[text()='NEW IN']"));
        newInMenuLink.click();
        driver.getTitle();
        System.out.println(driver.getTitle());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebElement newInMenuLink1 = driver.findElement(By.xpath("//div[text()='NEW IN']"));
        WebElement newInMenuLink2 = driver.findElement(By.xpath("//div[text()='werwer']"));

    }
}
