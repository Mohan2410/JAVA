package com.corejava;

class NonVoid{
    static void m1(){
        System.out.println("m1 is execute.......");
    }
    static int m2(){
        System.out.println("m2 is execute.......");
        return 50;
    }

    public static void main(String[] args){
        m1();
//        int x = m1(); CE: Incompatible types
//        System.out.println(m1()); CE:'void' type not allowed here

        m2();
        int x = m2();
        System.out.println(m2());

    }

}