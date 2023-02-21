package TNGLearning;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertions {
    SoftAssert softAssert;
    @Test
    public void softAssertionVsHardAssertions1(){
        softAssert  = new SoftAssert();

        softAssert.assertTrue(true);
        softAssert.assertTrue(false);
        softAssert.assertEquals(1,0);
        softAssert.assertFalse(false);

        System.out.println("Test Completed");
        softAssert.assertAll();
    }

    @Test
    public void softAssertionVsHardAssertions(){
        softAssert  = new SoftAssert();

        softAssert.assertTrue(true);
        softAssert.assertTrue(false);
        softAssert.assertEquals(1,0);
        softAssert.assertFalse(false);

        System.out.println("Test Completed");
        softAssert.assertAll();
    }



}
