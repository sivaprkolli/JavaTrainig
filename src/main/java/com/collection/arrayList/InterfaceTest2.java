package com.collection.arrayList;

public class InterfaceTest2 extends InterfaceTest1{

    public static void main(String[] args) {
        InterfaceTest2 interface2 = new InterfaceTest2();
        // class
        InterfaceTest1 interfaceTest1 = new InterfaceTest2();
        interfaceTest1.get();

        //interface
        Interface1 interface1 = new InterfaceTest2();
        interface1.get();

    }
}
