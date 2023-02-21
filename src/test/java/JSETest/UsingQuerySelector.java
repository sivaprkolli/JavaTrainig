package JSETest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UsingQuerySelector {
    WebDriver driver;
    JavascriptExecutor jse;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }
    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) driver;

        driver.get("http://localhost:8080/");
        jse.executeScript("alert('I love Selenium')");
        String emailInputBox = "return document.getElementById('j_username').value='siva'";
        String passwordInputBox = "return document.querySelector(\"input[name='j_password']\").value='siva'";
        String loginButton = "return document.querySelector(\"input[name='Submit']\").click()";

        jse.executeScript(emailInputBox);
        jse.executeScript(passwordInputBox);
        jse.executeScript(loginButton);
        System.out.println();

    }
    public void seClick(WebElement element){

    }

    public void jsClick(String text){

    }

    public void jsClick(WebElement element){

    }

}
