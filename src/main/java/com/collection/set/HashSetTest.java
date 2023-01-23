package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add("Automation Tool");
        list.add(4.7);
        list.add(4);
        list.add(3.14f);
        list.add("Web");
        list.add("Web");
        list.add(null);
        list.add(null);
        System.out.println(list);


        Set hashSet = new HashSet();
        hashSet.add("Selenium");
        hashSet.add("Automation Tool");
        hashSet.add("Automation Tool");
        hashSet.add(4.7);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(3.14f);
        hashSet.add("Web");
        hashSet.add("Web");
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);
    }
}
