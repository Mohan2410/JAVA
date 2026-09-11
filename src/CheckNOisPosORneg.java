package com.corejava;

public class CheckNOisPosORneg {

    static void negPos(int n){
        if(n<0){
            System.out.println("neg number");
        }else {
            System.out.println("positive number");
        }
    }
public static void main(String[] args){
    negPos(10);

    negPos(-10);
}
}
