package com.corejava;

class Example2{
    static void m1(){
        System.out.println("m1 is calling...");
    }
    static void m2(){
        System.out.println("m2 is calling...");
    }

    void m3(){
        System.out.println("m3 is calling...");
    }

    public static void main(String[] args){
        m1();
        m2();
        //m3(); CE: non-static method m3() cannot be referenced from a static

        //for non static method we cant call directly we need to create the object then we can call the non static method
        Example2 e = new Example2();
        e.m3();
    }
}