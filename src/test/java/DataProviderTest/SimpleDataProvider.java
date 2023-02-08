package DataProviderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @DataProvider(name = "ml")
    public Object[][] testData(){
        return new Object[][]
                {
                {"Selenium", "4.x"},
                {"Appium", "2.x"},
                {"WebDriverIO", "6.x"},
                };
    }


    @Test(dataProvider = "ml")
        public void testDataProvider(String test){
        System.out.println("get values from DP :: " + test);
    }
}
