package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add("Automation Tool");
        list.add(4.7);
        list.add(4);
        list.add(3.14f);
        list.add("Web");
        list.add("Web");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
