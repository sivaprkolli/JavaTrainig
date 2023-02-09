package Tables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    WebDriver driver;
    WebDriverWait wait;
//    String date = "14";
//    String month = "Feb";
//    String year = "2023";

    @Test
    public void handleTableData() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.redbus.in/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class*='icon-calendar']"))).click();
        String updatedDate = getDateIncrementedByMonth(2, "dd/MMM/yyyy");
        System.out.println("Updated date :: " + updatedDate);
        String givenDate[] = updatedDate.split("/");
        String trimmedDate = null;
        if (givenDate[0].charAt(0) == '0') {
            trimmedDate = givenDate[0].replace("0", "");
            System.out.println(givenDate[0].replace("0", ""));
        } else {
            trimmedDate = givenDate[0];
        }
        selectDateInTheCalender(trimmedDate, givenDate[1], givenDate[2]);
    }


    public void selectDateInTheCalender(String date, String month, String year) {
        for (int i = 0; i < 12; i++) {
            if (driver.findElement(By.cssSelector(".monthTitle")).getText().contains(month)) {
                break;
            } else {
                driver.findElement(By.cssSelector(".next > button")).click();
            }
        }
        driver.findElement(By.xpath("//table[@class=\"rb-monthTable first last\"]/tbody/tr/td[@class='monthTitle'][contains(text(),'" + month + "')][contains(text(),'" + year + "')]/ancestor::tr/following-sibling::tr/td[text()='" + date + "']")).click();
    }

    @Test
    public void getDate() {
        Date date1 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
        String strDate = formatter.format(date1);
        System.out.println(strDate);
        String updatedDate = getDateIncrementedBy(20, "dd/MMM/yyyy");
        System.out.println("Updated date :: " + updatedDate);

        String updatedMonth = getDateIncrementedByMonth(1, "dd/MMM/yyy");
        System.out.println("updatedMonth  :: " + updatedMonth);
    }


    public String getDateIncrementedBy(int days, String dateFormatType) {
        DateFormat dateFormat = new SimpleDateFormat(dateFormatType);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);
        String convertedDate = dateFormat.format(cal.getTime());
        ;
        return convertedDate;
    }

    public String getDateIncrementedByMonth(int months, String dateFormatType) {
        DateFormat dateFormat = new SimpleDateFormat(dateFormatType);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, months);
        String convertedDate = dateFormat.format(cal.getTime());
        ;
        return convertedDate;
    }
}
