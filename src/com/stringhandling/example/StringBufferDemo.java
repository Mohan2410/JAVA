package com.stringhandling.example;

public class StringBufferDemo {
    public static void main(String[] args) {

        String s = "";

        for (int i = 1; i <= 5; i++) {
            s = s + i;
            System.out.println("Iteration " + i + ": " + s);
        }
    }
}