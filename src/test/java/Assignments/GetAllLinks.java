package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetAllLinks {
    WebDriver driver;
    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;

    @Test
    public void fetchAllLinks(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> allLinkElements = driver.findElements(By.tagName("a"));
        List<String> allLinks = new ArrayList<>();

//        for(WebElement link : allLinkElements){
//
//            allLinks.add(link.getAttribute("href"));
//        }
//
//        System.out.println(allLinks);

        Iterator<WebElement> it = allLinkElements.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href");

            System.out.println(url);

        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());

            huc.setRequestMethod("HEAD");

            huc.connect();

            respCode = huc.getResponseCode();

            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
}
