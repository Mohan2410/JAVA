package com.corejava;

public class Task {
    int x = 10;
    static int b = m1();

    static{
        System.out.println("Static block is executed");
    }

    {
        System.out.println("Non-static block is executer OR Instance block is executed");
    }

    static int m1(){
        System.out.println("m1 method is calling.........");
        return 12;
    }


    public static void main(String[] args){
        System.out.println(m1());
        Task t1 = new Task();
//
        t1.m1();
    }

}
