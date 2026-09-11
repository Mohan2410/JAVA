package com.corejava;

class Test99{
    static int a = 10;
    int x = 20;

    static void m1(){
        System.out.println("Example m1");
    }

    void m2(){
        System.out.println("Example m2");
    }
}
class Sample2 extends Test99{
    static int a = 50;
    int x = 60;

    static void m1(){
        System.out.println("Sample m1");
    }

    void m2(){
        System.out.println("Sample m2");
    }
}
public class NonStaticVariableMemoryInObject{
    public static void main(String[] args){
        Test99 t1 = new Test99();
        System.out.println(t1.a);
        System.out.println(t1.x);
        t1.m1();
        t1.m2();

        Sample2 s1 = new Sample2();
        System.out.println(s1.a);
        System.out.println(s1.x);
        s1.m1();
        s1.m2();

        Test99 t2 = new Sample2();
        System.out.println(t2.a);
        System.out.println(t2.x);
        t2.m1();
        t2.m2();


    }
}