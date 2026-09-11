package com.corejava;

public class CheckEvenOdd {
    public static boolean checkEvenOdd(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        checkEvenOdd(55);

        boolean flag = checkEvenOdd(3);
        if(flag == true){
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The given number is Odd");
        }
    }
}
