package TNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestRetry {
    @Test(enabled = true)
    public void test1(){
        System.out.println("Testing test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        System.out.println("Testing test2");
        Assert.assertTrue(false);
    }

    @Test
    public void test3(){
        System.out.println("Testing test3");
        Assert.assertTrue(false);
    }

    @Test
    public void test4(){
        System.out.println("Testing test4");
        Assert.assertTrue(false);
    }
}
