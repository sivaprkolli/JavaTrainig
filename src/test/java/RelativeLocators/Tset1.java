package RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Tset1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void lauchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void aboveMethod(){
        WebElement addRemoveElement = driver.findElement(with(By.xpath("//a")).above(By.cssSelector("a[href='/add_remove_elements/']")));
        addRemoveElement.click();
    }

    @Test
    public void belowMehtod(){
        WebElement addRemoveElement = driver.findElement(with(By.xpath("//a")).below(By.cssSelector("a[href='/add_remove_elements/']")));
        addRemoveElement.click();
    }

    @Test
    public void nearMehtod(){
        WebElement addRemoveElement = driver.findElement(with(By.xpath("//a")).near(By.cssSelector("a[href='/add_remove_elements/']")));
        addRemoveElement.click();
    }

    @Test
    public void rightOfMehtod(){
        driver.get("https://fast.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class$='oc-icon-refresh']")));
        WebElement speed = driver.findElement(By.cssSelector(".speed-left-container"));
        WebElement speedText = driver.findElement(with(By.tagName("div")).toRightOf(speed));
        speedText.click();
    }

    @Test
    public void leftOfMehtod(){
        driver.get("https://fast.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class$='oc-icon-refresh']")));
        WebElement speed = driver.findElement(By.cssSelector(".speed-right-container"));
        WebElement speedText = driver.findElement(with(By.tagName("span")).toLeftOf(speed));
        System.out.println(speedText.getText());
    }

}
