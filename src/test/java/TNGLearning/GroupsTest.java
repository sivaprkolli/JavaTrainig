package TNGLearning;

import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = {"Smoke", "Regression"})
    public void login(){
        System.out.println("Test Case :: login");
    }
    @Test(groups = {"Smoke", "Regression"})
    public void verifyBookingTicket(){
        System.out.println("Test Case :: verifyBookingTicket");
    }

    @Test(groups = {"Regression"})
    public void verifyPayment(){
        System.out.println("Test case :: verifyPayment");
    }

    @Test(groups = {"ExcludeTests"})
    public void verifyEmail(){
        System.out.println("Test case :: verifyEmail");
    }
}
