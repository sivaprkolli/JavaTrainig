package com.collection.arrayList;

import java.util.*;


public class ArrayListTest1 {


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add("Automation Tool");
        list.add(4.7);
        list.add(4);
        list.add(3.14f);
        list.add("Web");
        list.add("Web");
        list.add(true);


        List list1 = new ArrayList();
        list1.add("Appium");
        list1.add("Mobile Automation Tool");
        list1.add(2.0);



//        System.out.println(list);
//        System.out.println(list.get(7));

        for(Object list2 : list){
          //  System.out.println(list2);
        }

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println("List values :: " + iterator.next());
        }

        list.remove("Web");
        list.set(6, "WebDriverIO Automation Tool");
        System.out.println("*****************************************");


        list.addAll(list1);

        System.out.println(list);


    }
}
