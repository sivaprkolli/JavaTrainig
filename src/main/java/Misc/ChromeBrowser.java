package Misc;

public class ChromeBrowser extends Selenium implements WebDriverW {

    public static void main(String[] args) {
        Selenium selenium = new ChromeBrowser();
        Selenium selenium1 = new Selenium();
        WebDriverW driver = new ChromeBrowser();
        ChromeBrowser chromeBrowser = new ChromeBrowser();
        //WebDriver driver1 = new WebDriver();

        new ChromeBrowser().test1();

        selenium1.test2();
        chromeBrowser.test2();
    }

    public void test1(){
        System.out.println("Testing testcase1");
    }

    public void test2(){
        System.out.println("Child Testing testcase2");
    }

    public void test3(){
        System.out.println("Testing testcase3");
    }
}
