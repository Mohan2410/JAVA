package com.ArrayProblem;

public class ArrayAvg {
    static double getAvg(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(getAvg(arr));

    }
}
