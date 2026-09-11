package com.corejava;

class A18 {
    static int a = 10;
    int x = 20;
    static void m1(){
        System.out.println("A m1");
    }

    void m2(){
        System.out.println("A m2");
    }

    void m3(){
        System.out.println("A m3");
        System.out.println("Aa: "+a);
        System.out.println("Ax: "+x);
        m1();
        m2();
    }

}
class B18 extends A18{
    static int a = 50;
    int x = 60;

    static void m1(){
        System.out.println("B m1");
        B18 b1=new B18();
        System.out.println(b1.a);
    }
    void m2(){
        System.out.println("B m2");
        System.out.println("Ba: "+a);
        System.out.println("Bx: "+x);
        System.out.println(a);


    }

    void m4() {
        super.a = a - 10;
        super.x = x - 10;
    }

}
public class Demo22{
    public static void main(String[] args){
        B18 b1 = new B18();
        B18 b2 = new B18();
        A18 a1 = new B18();

        B18 b22 = null;

        b1.a = 15;
        b1.x = 16;
        b2.a = 18;
        b2.x = 19;


        b1.m4();
        b2.m4();

        b1.m3();
        System.out.println();
        b2.m3();
        System.out.println();

        System.out.println(b1.a);
        System.out.println(a1.a);
        System.out.println(b1.x);
        System.out.println(a1.x);


        System.out.println(B18.a);


    }
}