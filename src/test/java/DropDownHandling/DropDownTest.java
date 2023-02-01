package DropDownHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDownTest {

    WebDriver driver;

    @Test
    public void selectValueFromDropDown() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement jobDropDown = driver.findElement(By.cssSelector("select[id^='UserTitle']"));
        Select selectJob = new Select(jobDropDown);


        selectJob.selectByValue("Operations_Manager_AP");
        selectJob.selectByIndex(7);
        selectJob.selectByVisibleText("Developer / Software Engineer / Analyst");

        String actualSelectedOption = selectJob.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption, "Developer / Software Engineer / Analyst");

        Select empList = new Select(driver.findElement(By.xpath("//select[starts-with(@id,'CompanyEmployees')]")));
        empList.selectByValue("250");

        Assert.assertEquals(empList.getOptions().size(), 20);
        Assert.assertTrue(empList.getFirstSelectedOption().isDisplayed());
        Assert.assertEquals(empList.getFirstSelectedOption().getText(), "101 - 500 employees");

    }

    @AfterMethod
    public void killSession(){
        driver.quit();
    }
}
