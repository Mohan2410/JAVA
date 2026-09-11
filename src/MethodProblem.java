package com.corejava;

class Problem{
    static void m1(){
        System.out.println("No parameter method...");
    }
    static void m2(int p,String s){
        System.out.println("m2 is parameterized method...");
        System.out.println("p: "+p);
        System.out.println("s: "+s);
    }
}
class MethodProblem{
    public static void main(String[] args){
        Problem.m1();
        Problem.m1();

        Problem.m2(10,"Mohan");
        Problem.m2(20,"Jivan");

    }
}