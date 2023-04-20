package CDP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class MobileEmulation {

    @Test
    public void testMobileBrowser(){
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 360);
        deviceMetrics.put("height", 640);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 11.0; en-us; Samsung GalaxyA51 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
        ChromeOptions chromeOptions = new ChromeOptions(); chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://restaurants.kfc.co.in/");
    }

    @Test
    public void mobileEmulation(){
       // System.setProperty("webdriver.chome.driver",System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        WebDriverManager.chromedriver().setup();
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 1078);
        deviceMetrics.put("height", 924);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" +
                        "Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) " +
        "Chrome/67.0.3396.99 Mobile Safari/537.36");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);
    }

    // Working
    @Test
    public void emulatorTest() throws InterruptedException {
        //System.setProperty("webdriver.chome.driver",System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        /*Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone SE");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);*/
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk");
        driver.manage().window().setSize(new Dimension(412, 700));
        driver.get("https://www.discounttire.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[text()='Continue']")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@data-icon=\"bars\"][name()='svg']")).click();
        driver.findElement(By.xpath("//a[@href=\"#mobile-menu\"]")).click();

        driver.findElement(By.xpath("//a[text()='My Vehicles']")).click();
    }

    // Working
    @Test
    public void mobileEmulationSetup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 400);
        deviceMetrics.put("height", 800);
        deviceMetrics.put("deviceScaleFactor", 0);
        deviceMetrics.put("mobile", true);

        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
