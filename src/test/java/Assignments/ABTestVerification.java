package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;

public class ABTestVerification {
    WebDriver driver;
    @Test
    public void abTesting(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement startMyFreeTrailButton = driver.findElement(By.name("start my free trial"));
        startMyFreeTrailButton.click();

        ArrayList<String> labels = new ArrayList<>();
        labels.add("Phone");
        labels.add("First name");
        labels.add("Employees");

        Collection<String> errorMessages = new ArrayList<>();
        errorMessages.add("Enter a valid phone number");
        errorMessages.add("Enter your first name");
        errorMessages.add("Select employee size");

        ArrayList<String> actualErrorMesages = new ArrayList<>();
        for (int i=0; i<labels.size(); i++){
            actualErrorMesages.add(getErrorMessage(labels.get(i)));
        }
        System.out.println(actualErrorMesages);

        Assert.assertEquals(actualErrorMesages, errorMessages);
    }

    public String getErrorMessage(String label){
        String text = driver.findElement(By.xpath("//*[normalize-space()='"+label+"']/following-sibling::span")).getText();
        System.out.println(text);
        return text;
    }
}
