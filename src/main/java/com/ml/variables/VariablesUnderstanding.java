package com.ml.variables;

public class VariablesUnderstanding {
    int a = 10;
    String s = "MotivityLabs";
    char c = 'M';
    boolean b = true; //false
    static float f = 3.14F; // 3.14f
    double d = 3.14;

    public static void main(String[] args) {
        VariablesUnderstanding variablesUnderstanding = new VariablesUnderstanding();
        System.out.println(variablesUnderstanding.a);
        System.out.println(f);

    }

    public void automationTest(){
       int k = 10;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public float multiply(){
        return 1.2f;
    }

    public int test1(){
        return 5;
    }

    public String studentName(String name){
        return name;
    }

    public double divide(int a, double b){
        return a+b;
    }

    public boolean flag(boolean a){
        return a;
    }


}
