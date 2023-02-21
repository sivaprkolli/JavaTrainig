package TNGLearning;

import org.testng.annotations.*;

public class SimpleTest {

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Mehtod");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Test
    public void login(){
        System.out.println("Test Case 1");
        //Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "login")
    public void verifyBookingTicket(){
        System.out.println("Test Case 2");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

}



