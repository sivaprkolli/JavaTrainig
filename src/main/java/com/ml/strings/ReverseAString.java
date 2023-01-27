package com.ml.strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Sele&$nium";
        s = s.replaceAll("[$&]", "");

        System.out.println(s);
        for(int i=s.length()-1; i>=0; i-- ){
            System.out.print(s.charAt(i));
        }

    }
}
