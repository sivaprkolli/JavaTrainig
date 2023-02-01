package VerificationMethods;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CommonMethod {

    public boolean isWebElementDisplayed(WebElement element){
        try{
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException nse){
            return false;
        }
    }

    public boolean isWebElementSelected(WebElement element){
        try{
            element.isSelected();
            return true;
        }catch (NoSuchElementException nse){
            return false;
        }
    }
}
