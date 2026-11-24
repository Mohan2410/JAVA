package com.Recursion;

import java.util.Scanner;

class PrintNaturalNumberLogic{
    public static void print(int n){
        if(n>=1){
            print(n-1);
            System.out.println(n+" ");
        }
    }
}
public class Recursion01_PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PrintNaturalNumberLogic.print(n);


    }
}
