package com.ArrayProblem;

import java.util.Scanner;

public class ArrayFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print("Array elements are: ");
            System.out.println(arr[i]);
        }


    }
}
