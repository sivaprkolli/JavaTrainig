package com.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add("Automation Tool");
        list.add(4.7);
        list.add(4);
        list.add(3.14f);
        list.add("Web");
        list.add("Web");
       // System.out.println(list);

        ArrayList arrayList = new ArrayList();
        arrayList.add("Selenium");
        arrayList.add("Automation Tool");
        arrayList.add(4.7);
        arrayList.add(4);
        arrayList.add(3.14f);
        arrayList.add("Web");
        arrayList.add("Web");
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(6));

        List<String> list1 = new ArrayList<String>();
        list1.add("String ");

        List<Integer> list2 = new ArrayList<>();
        




    }
}
