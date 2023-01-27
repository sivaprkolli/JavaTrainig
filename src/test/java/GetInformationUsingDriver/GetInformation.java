package GetInformationUsingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GetInformation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8080/src/html/");
        String titleOfThePage = driver.getTitle();
        String pageSource = driver.getPageSource();
        String currenturl = driver.getCurrentUrl();

      //  System.out.println(pageSource);

//        if(pageSource.contains("User Login")){
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test fail");
//        }

        WebElement headingOftheLoginPage = driver.findElement(By.xpath("//h1[text()='User Login']"));
        String actualTextOfHeading = headingOftheLoginPage.getText();

        if(actualTextOfHeading.contains("User Login")){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test fail");
        }

        driver.quit();
    }
}
