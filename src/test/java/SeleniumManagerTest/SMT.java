package SeleniumManagerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SMT {

    @Test
    public void testSTM(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://indranilmajumder.medium.com/the-new-qa-in-town-chatgpt-873137bf1293");
    }
}
