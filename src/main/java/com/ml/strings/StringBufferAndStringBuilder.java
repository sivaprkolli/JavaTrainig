package com.ml.strings;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Selenium");
        stringBuffer.append(" Automation");
        stringBuffer.capacity();
        stringBuffer.length();

        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse();
        stringBuffer.delete(5 ,10);
        stringBuffer.replace(1, 4, "Appi");
        System.out.println(stringBuffer);

        StringBuffer stringBuilder = new StringBuffer("Appium");
        stringBuilder.append(" Automation");
        System.out.println(stringBuilder);
    }
}
