package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TraversingForward {


    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8080/src/html/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement userNameLabel = driver.findElement(By.xpath("//div/form/div[starts-with(text(),'Email')]"));
        WebElement cssUserNameLabel = driver.findElement(By.cssSelector("form[name=\"form\"] > div[class='font']"));
        // password labelx = .login_form > .font.font2
        WebElement passwordLabel = driver.findElement(By.xpath("//div[@class=\"font font2\"]"));
        System.out.println(passwordLabel.isDisplayed());


        // #headerPanel > ul > li > a[href="services.htm"]
         //a[@href="services.htm"]/parent::li/parent::ul/parent::div
        //a[@href="services.htm"]/ancestor::div[@id='mainPanel']
        //div[@id="topPanel"]/child::a/child::img
        //form[@class="login_form"]/div[@class="font font2"]/following-sibling::input[@name='password']
//.font.font2


        driver.quit();
    }

}
