package com.corejava;

class Mahadev{
    private static void m1(){
        System.out.println("m1 is calling....");
    }

    static void m2(){
        System.out.println("m2 is calling...");
    }

    static void m3(){
        System.out.println("m3 is calling....");
        m1();
        m2();
    }

//    public static void main(String[] args){
//        System.out.println("main method is calling.......");
//        m1();
//        m2();
//        m3();
//
//        System.out.println();
//    }
}
class Test6{
    public static void main(String[] args){
//        m1();
        Mahadev.m2();
        Mahadev.m3();

    }
}