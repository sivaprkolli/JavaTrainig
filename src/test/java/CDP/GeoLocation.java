package CDP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GeoLocation {
    WebDriver driver;
    @Test
    public void testGeoLocation(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        Map coordinates = new HashMap(){{
            put("latitude",40.810110);
            put("longitude",-73.951620);
            put("accuracy", 1);
        }};

        ((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.manage().window().maximize();
        driver.get("https://restaurants.kfc.co.in");

       driver.quit();


    }
}
