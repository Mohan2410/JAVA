package com.corejava;

class Example7{
    static int a = 10;

    public static void main(String[] args){
        System.out.println(a);
        System.out.println(Example7.a);
        System.out.println();

        int a = 50;
        System.out.println(a);
        System.out.println(Example7.a);
        System.out.println();

        a = 60;
        System.out.println(a);
        System.out.println(Example7.a);


        Example7.a = 70;
        System.out.println(a);
        System.out.println(Example7.a);
        System.out.println();

        int b = 90;
        System.out.println(b);
//        System.out.println(Example7.b);

//        c = 90;
//        System.out.println(c);
//        System.out.println(Example7.c);
    }
}