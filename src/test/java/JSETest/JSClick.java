package JSETest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class JSClick {
    WebDriver driver;
    JavascriptExecutor jse;

    @AfterTest
    public void killBrowser(){
        driver.quit();
    }
    @Test
    public void jsClick() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jse = (JavascriptExecutor)driver;

        driver.get("http://127.0.0.1:8080/src/html/");
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement emailLable = driver.findElement(By.cssSelector("form[class='login_form'] > div:first-of-type"));
        //String textToClick = "return document.querySelector(\"button[type='submit']\").click();";
        String text = "return arguments[0].click()";
        String inputText = "return arguments[0].value='TestAutomation@yopmail.com'";
        String emailLabelText = "return arguments[0].innerText";
        jse.executeScript(text, loginButton);
        jse.executeScript(inputText, emailInputBox);
        String actualLabel = jse.executeScript(emailLabelText, emailLable).toString();
        System.out.println(actualLabel);

    }
}
