package com.ml.strings;

public class TypeCastingAndTypeCoversion {
    public static void main(String[] args) {
        int i = 5;
        byte b = 8;
        float f = 3.1f;
        double d = 3.54;

        System.out.println(i=b);
        //System.out.println(d =f);

        System.out.println(f = (float) d);
    }
}
