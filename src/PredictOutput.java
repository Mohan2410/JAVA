package com.corejava;

class Example4{
    int x;
    static void m1(Example4 e){
        System.out.println(e.x);
    }
    void m2(){
        System.out.println(x);
    }
}
class PredictOutput{
    public static void main(String[] args){
        Example4 e1 = new Example4();
        Example4 e2 = new Example4();

        e1.x = 15;
        e2.x = 17;

        Example4.m1(e1);
        Example4.m1(e2);

        e1.m2();
        e2.m2();
    }
}