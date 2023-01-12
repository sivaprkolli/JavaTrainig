package com.ml.variables;

public class MethodReturnTypes {
    String name = "Jeo";
    int id = 1;

    public static void main(String[] args) {
        int k;
        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
         k = methodReturnTypes.sum();
        System.out.println(k);

        System.out.println(methodReturnTypes.sum(0));
        System.out.println(methodReturnTypes.sum(5 + 6));
        System.out.println(methodReturnTypes.myName("Jyothi HR"));
        System.out.println(methodReturnTypes.myId(510));

        //System.out.println("My name is " + "Siva" + " " + "and my Id is " +  510);
        System.out.println("My name is " + methodReturnTypes.myName(methodReturnTypes.name)  + "and my Id is " +  methodReturnTypes.myId(methodReturnTypes.id));
    }

    public int sum(){
        return 5;
    }

    public int sum(int a){
        return a;
    }

    public int sum(int a, int b){
        return a+b;
    }


    public double sum(double a){
        return a;
    }

    public float sum(float a){
        return a;
    }

    public String myName(String name){
        return name;
    }

    public int myId(int a){
        return a;
    }
}
