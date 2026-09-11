package com.corejava;

public class Task1{
    static int a = m1();
    static int m1(){
        System.out.println("Static variable: "+Task1.a);
        return 10;
    }
    public static void main(String[] args){
        System.out.println("main method execute...");
        m1();
    }
}