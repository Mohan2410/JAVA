package com.corejava;

class Example6{
    int x;

    static void m1(Example6 e1,Example6 e2){
        System.out.println(e1.x);
        System.out.println(e2.x);
    }
    void m2(Example6 e){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(e.x);
    }
}
class Mohan{
    public static void main(String[] args){
        Example6 e1 = new Example6();
        Example6 e2 = new Example6();

        e1.x = 15;
        e2.x = 16;

        Example6.m1(e1,e2);

//        e1.m2(e2);
    }
}