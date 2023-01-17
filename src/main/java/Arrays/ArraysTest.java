package Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int i[] = {1,2,3,3,4,4,5,6};
        String s[] = {"Selenium", "Appium", "WebDriverIO", "Protractor", "PlayWright", "TestCafe"};
        String s1 = "Selenium";
        char c[] = {'A', 'p', 'p', 'i','u','m'};

        //System.out.println(c[5]);

        System.out.println(s1.toCharArray());




        for(int j=0; j<c.length; j++){
            System.out.println(c[j]);
        }

        for(char a : c){
            System.out.print(a);
        }



    }
}
