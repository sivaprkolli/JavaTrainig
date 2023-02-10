package com.collection.misc;

import java.util.*;

public class UsingStreams {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, "Selenium");
        hashMap.put(2, "Appium");

        System.out.println(hashMap);
        hashMap.entrySet().forEach(System.out::println);

    }
}
