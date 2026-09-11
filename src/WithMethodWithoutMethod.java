package com.corejava;

class Student5{
    int sno;
    String sname;

    static void m1(int a,String b){
        System.out.println(a);
        System.out.println(b);
    }
}
class WithMethodWithoutMethod{
    public static void main(String[] args){
        Student5.m1(5555,"RAM");
        Student5.m1(7412,"SHAM");

        //        Student5 s1 = new Student5();
//        Student5 s2 = new Student5();
//
////        we print without method
//
////        student 1
//        s1.sno = 1010;
//        System.out.println(s1.sno);
//
//        s1.sname = "Mohan";
//        System.out.println(s1.sname);
//
////        student 2
//        s2.sno = 1020;
//        System.out.println(s2.sno);
//        s2.sname = "Ajay";
//        System.out.println(s2.sname);

    }
}