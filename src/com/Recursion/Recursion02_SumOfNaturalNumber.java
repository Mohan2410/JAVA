package com.Recursion;

import java.util.Scanner;
class SumOfNaturalNumber{
    static int sum(int n){
        if(n==1){
            return -1;
        }else{
            return n+sum(n-1);
        }
    }
}
public class Recursion02_SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(SumOfNaturalNumber.sum(n));
    }
}
