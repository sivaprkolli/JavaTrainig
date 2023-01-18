package com.ml.strings;

import java.sql.SQLOutput;

public class ConcatnatingStrings {
    public static void main(String[] args) {
        String s = "Selenium";
        s = s.concat(" Automation");
        String s1 = null;
        s1 = s+ " Training";
      //  System.out.println(s1);
        test2("Ramya", "Motivity");
        test2("Kavya", "HelixSense");
        test2("Siva", "Lifeworks");

    }

    public void test1(String message){
        System.out.println("Output :: " + message);
    }

    public static void test2(String name, String company){
        System.out.println("My name is :: " + name + " " + "Working at " + company);
    }
}
