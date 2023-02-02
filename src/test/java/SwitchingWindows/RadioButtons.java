package SwitchingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RadioButtons {

    //label[text()='Redeem flights']/preceding-sibling::input

    WebDriver driver;

    @Test
    public void abTesting() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement radioButtons = driver.findElement(By.cssSelector("#exp-0"));
        System.out.println(radioButtons.isSelected());
        radioButtons.click();

        System.out.println(radioButtons.isSelected());

        List<WebElement> radioButtonsList = driver.findElements(By.name("exp"));

        for(int i=0; i<radioButtonsList.size(); i++){
            getRadioButtons(String.valueOf(i)).click();
        }
    }

    public WebElement getRadioButtons(String yearsOfExp){
       return driver.findElement(By.cssSelector("#exp-"+yearsOfExp+""));
    }
}
