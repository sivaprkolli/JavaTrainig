package com.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "Test");

        map.put(2, "Test1");
        map.put(5, "Test1");

        map.put(3, "Test2");
        map.put(3, "Test4");
        map.put(3, "ABC");
        map.put(3, "Hello");

        map.put(4, "Test3");
        map.put(4, "Test3");
        map.put(6, null);
        map.put(null, null);
        map.put(null, null);


        System.out.println(map);

        Map mapT = new Hashtable();
//        mapT.put("Automation Tool", "Selenium 4.x");
//        mapT.put("Language", "Java");
        mapT.put(1, "Test");
        mapT.put(2, "Test1");
        mapT.put(5, "Test1");

        mapT.put(3, "Test2");
        mapT.put(3, "Test4");
        mapT.put(3, "ABC");
        mapT.put(3, "Hello");

        mapT.put(4, "Test3");
        mapT.put(4, "Test3");
        mapT.put(6, "test6");
        mapT.put(7, "Test7");

        System.out.println(mapT);
    }
}
