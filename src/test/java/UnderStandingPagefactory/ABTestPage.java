package UnderStandingPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.text.MessageFormat;
import java.util.List;

public class ABTestPage {
WebDriver driver;
    public ABTestPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id="login-button")
    WebElement loginButton;

    @FindAll({
            @FindBy(id="login"),
            @FindBy(className="login-button"),
            @FindBy(name="login-button")
    })
    WebElement loginButtonTest;

    @FindBys({
            @FindBy(id="login-button"),
            @FindBy(name="login-button")
    })
    List<WebElement> loginButtonSauceL;

    String heading = "A/B {0} {1} {2}";
    String heading1 = "A/B {0} {1}";

    public void clickOnLoginButton(){
        loginButtonSauceL.get(0).click();
    }


    public void openLink(String linkName){
        driver.findElement(By.linkText(linkName)).click();
    }

    public boolean verifyABTestHeading(){

        try {
            String headingText = MessageFormat.format(heading, "Test", "Variation", 1);
            return driver.findElement(By.xpath("//*[text()='" + headingText + "']")).isDisplayed();
        }catch (NoSuchElementException nse){
            String headingText = MessageFormat.format(heading1, "Test", "Control");
            return driver.findElement(By.xpath("//*[text()='" + headingText + "']")).isDisplayed();
        }
    }
}
