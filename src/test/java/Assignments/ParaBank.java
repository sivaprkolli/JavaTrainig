package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParaBank {

    public void openAnAccount(WebDriver driver, String email, String password) throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.name("username")).sendKeys("siva9kolli@gmail.com");
        driver.findElement(By.name("password")).sendKeys("selenium");
        driver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();

        driver.findElement(By.linkText("Open New Account")).click();

        Thread.sleep(3000);
        WebElement openNewAccountButton = driver.findElement(By.cssSelector("input[value='Open New Account']"));
        if(driver.findElements(By.cssSelector("input[value='Open New Account']")).size()>0){

            Actions actions = new Actions(driver);
            actions.moveToElement(openNewAccountButton).perform();
            actions.moveToElement(openNewAccountButton).click().build().perform();
        }
        System.out.println();

    }
}
