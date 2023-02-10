package com.collection.misc;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = () -> {
                System.out.println("Test Automation");
        };

        functionalInterface.automation();
    }
}
