package TNGLearning;

import GetScreenShotTest.ScreenshotForWebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetScreenShotWhenTestFails extends ScreenshotForWebElement {

    public ScreenshotForWebElement screenshotForWebElement;
    @Test
    public void simpleTest(){
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void getScreenShotWhenTestFails(ITestResult iTestResult) throws IOException {
        screenshotForWebElement = new GetScreenShotWhenTestFails();
        if(iTestResult.getStatus() == ITestResult.FAILURE){
            screenshotForWebElement.fullScreenshot();
        }
    }
}
