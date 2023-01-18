package Exceptions;

import Misc.ChromeBrowser;
import Misc.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            test5();
            //test3();
            test1();
            test2();
        } catch (ArithmeticException  e) {
            System.out.println("Exception Test");
            e.printStackTrace();
        } catch (NullPointerException n){
            System.out.println(n.toString());
        }
        System.out.println("Test Completed");
    }

    public static void test2() {
        try {
            String s[] = {"a", "b", "c", "d"};
            char c[] = {'a', 'b', 'c', 'd'};
            System.out.println(s[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :: " + e.toString());
        } finally {
            System.out.println("I Love Java");
        }
    }

    public static void test1() {
        try {
            int i;
            i = 5 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.toString());
        } finally {
            System.out.println("I Love Java");
        }
    }

    public static void test3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }

    public static void waitFor1Sec() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void test5(){
        String s = null;
        System.out.println(s.length());
    }
}
