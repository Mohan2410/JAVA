package com.corejava;

class Assignment2{
    int x = 10;

    void m1(){
        int x = 50;
        System.out.println(x);
        System.out.println(this.x);

        x = 60;
        this.x = 70;
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args){
        Assignment2 a1 = new Assignment2();
        a1.m1();
    }
}