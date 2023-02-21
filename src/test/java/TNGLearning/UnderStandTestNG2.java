package TNGLearning;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnderStandTestNG2 {

    @Parameters({"name", "id"})
    @BeforeTest(groups = {"Smoke", "Regression", "Bug"})
    public void test1(String name, String id){
        System.out.println("My name is :: " + name + " and id is :: "  + id);
    }

    @Test(groups = {"Smoke"})
    public void test2(){

    }

    @Test(dependsOnMethods = "test2", groups = "Smoke")
    public void test4(){

    }


    @Test(groups = {"Smoke", "Regression"})
    public void test3(){

    }
}
