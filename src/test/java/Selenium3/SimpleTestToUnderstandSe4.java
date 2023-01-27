package Selenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SimpleTestToUnderstandSe4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://127.0.0.1:8080/src/html/");
        WebElement emailOrPhoneInputBox = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailOrPhoneInputBox.sendKeys("");
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys("Test@1244");

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        WebElement loginButton2 = driver.findElement(By.tagName("button"));
        loginButton2.click();
        System.out.println("loginButton === " + loginButton);

        driver.quit();
    }
}
