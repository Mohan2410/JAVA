package com.ArrayProblem;

public class MaximumElement {
    static int maximum(int[] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {10,22,21,23,54,250,97,7,9};
        int maximum = maximum(arr);
        System.out.println("maximum element in an array is: "+maximum);

    }
}
