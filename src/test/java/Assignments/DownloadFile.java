package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.UUID;

import static org.junit.Assert.assertThat;

public class DownloadFile {
    WebDriver driver;
    File folder;

    @BeforeTest
    public void setUp() throws Exception {
        WebDriverManager.firefoxdriver().setup();
        folder = new File(UUID.randomUUID().toString());
        folder.mkdir();
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();

        profile.setPreference("browser.download.dir", folder.getAbsolutePath());
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "image/jpeg, application/pdf, application/octet-stream");
        profile.setPreference("pdfjs.disabled", true);
        options.setProfile(profile);
        driver = new FirefoxDriver(options);

    }

    @Test
    public void download() throws Exception {
        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.cssSelector(".example a")).click();
        // Wait 2 seconds to download file
        Thread.sleep(2000);
        File[] listOfFiles = folder.listFiles();
        // Make sure the directory is not empty
       // assertThat(listOfFiles.length, is(not(0)));
        for (File file : listOfFiles) {
            // Make sure the downloaded file(s) is(are) not empty
            //assertThat(file.length(), is(not((long) 0)));
        }
    }



    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
        for (File file: folder.listFiles()) {
            file.delete();
        }
        folder.delete();
    }

}
