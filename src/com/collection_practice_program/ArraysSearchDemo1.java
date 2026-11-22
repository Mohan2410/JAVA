package com.collection_practice_program;

import java.util.Arrays;

public class ArraysSearchDemo1 {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        Arrays.sort(a);
        for(int a1:a){
            System.out.print(a1+" ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(a,6));
        System.out.println(Arrays.binarySearch(a,14));


//        Arrays.sort(a,ArraysSearchDemo1MyComparator.reverseOrder());
        System.out.println(Arrays.toString(a));

        String[] s = {"A","Z","B"};
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sorting: "+Arrays.toString(s));

        System.out.println();
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"Z"));
        System.out.println(Arrays.binarySearch(s,"S"));


    }
}
