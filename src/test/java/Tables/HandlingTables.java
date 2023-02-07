package Tables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandlingTables {
    @Test
    public void handleTableData(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://datatables.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th[contains(text(),'Name')]/ancestor::table/tbody/tr/td[contains(@class,'dtr-control')]"));
        List<WebElement> position = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th[contains(text(),'Position')]/ancestor::table/tbody/tr/td[2]"));
        List<WebElement> firstRowData = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));
        ArrayList actualNames = new ArrayList();
        for (int i=0; i<names.size(); i++){
            actualNames.add(names.get(i).getText());
        }
        System.out.println(actualNames);
    }
}
