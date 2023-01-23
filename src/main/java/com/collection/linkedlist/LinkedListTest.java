package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(6);

        System.out.println(list);

        Vector vector = new Vector();
        vector.add(1);
        vector.add(1);
        vector.add(4);
        vector.add(4);
        vector.add(3);
        vector.add(3);
        vector.add(6);
        vector.add(4);
        vector.add(3);
        vector.add(3);
        vector.add(6);

        System.out.println(vector.capacity());
    }
}
