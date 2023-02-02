package SwitchingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckBoxes {

    WebDriver driver;

    @Test
    public void abTesting() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//form/input"));

        System.out.println(checkBoxes.get(0).isSelected());
        Assert.assertFalse(checkBoxes.get(0).isSelected());
        checkBoxes.get(0).click();
        System.out.println( "After Cicking :: "+ checkBoxes.get(0).isSelected());
        Assert.assertTrue(checkBoxes.get(0).isSelected());


    }
}
