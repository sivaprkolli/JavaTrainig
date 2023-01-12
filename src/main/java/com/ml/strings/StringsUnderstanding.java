package com.ml.strings;

public class StringsUnderstanding {
    public static void main(String[] args) {
        String s = "Selenium";
        String s6 = "Selenium Automation";
        String s1 = new String("Selenium");
        String s2 = "Selenium";
        String s3 = "Appium";
        String s5 = new String("Selenium");
        String s7 = "    WebDriverIO    ";

        System.out.println(s); // prints

        System.out.println(s == s2); //true
        System.out.println(s == s1); //false
        System.out.println(s5 == s2); //false

        System.out.println(s.equals(s2)); // true
        System.out.println(s.equals(s1)); // true
        System.out.println(s5.equals(s2)); // true

        System.out.println(s == s1.intern()); // true
        System.out.println(s.contains(s6));
        System.out.println(s6.contains(s));

        System.out.println(s6.endsWith("tion"));
        System.out.println(s6.startsWith("Sel"));

        System.out.println(s6.toCharArray());



    }
}
