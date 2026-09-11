package com.corejava;

import java.util.Scanner;
class Example22{
    static int x;
    Scanner sc = new Scanner(System.in);

    //non-static block
    {
        System.out.println("\nEnter x value: ");
        x = sc.nextInt();

        System.out.println("Non Static variable is initialized in IIB");;
    }
    Example22(){
        System.out.println("NPC is executed");
    }
    Example22(int x){
        System.out.println("IPC is executed");
    }
    Example22(String s){
        System.out.println("SPC executed");
    }

    Example22(double d){
        System.out.println("DPC executed");
    }

}
class NonStaticBlock{
    public static void main(String[] args){
//        Example22 e1 = new Example22();
//        Example22 e2 = new Example22(5);

        Example22 e3 = new Example22("Mohan");
    }
}