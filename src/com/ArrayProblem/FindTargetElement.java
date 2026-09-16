package com.ArrayProblem;

public class FindTargetElement {

    static boolean findTarget(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10,32,84,21,43,3,7};
        boolean ans = findTarget(arr,99);
        System.out.println(ans);

    }
}
