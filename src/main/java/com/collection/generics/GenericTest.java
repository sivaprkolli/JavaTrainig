package com.collection.generics;

public class GenericTest <G>{
    G obj;
    String name;

    public GenericTest(G obj){
        this.obj = obj;
    }

    public G automationTest(){
        System.out.println(obj);
        return obj;
    }

    public static void main(String[] args) {
        GenericTest<Integer> genericTest = new GenericTest(10);
        GenericTest<String> genericTest1 = new GenericTest("Apppium");
        genericTest.automationTest();
        //System.out.println(genericTest.name);

        System.out.println(genericTest.obj);

        genericTest1.automationTest();

    }
}
