package com.corejava;

class Testing{
    static void m1(){
        System.out.println("m1 is calling...");
    }
    void m2(){
        System.out.println("m2 is calling...");
    }

//    public static void main(String[] args){
//        Sample ss = new Sample();
//        System.out.println("main method is execute...");
//        m1();
//        ss.m2();
//    }
}
class Test01_SMNSM{
    public static void main(String[] args){

        Testing e1 = new Testing();
        Testing e2 = null;

        System.out.println("Test main is calling....");
        e2.m1();
        e1.m2();

        e1.m2();
    }
}