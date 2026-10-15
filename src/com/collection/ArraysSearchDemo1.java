package com.collection;

import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class ArraysSearchDemo1 {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        Arrays.sort(a);
        for(int a1 : a){
            System.out.print(a1+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(a,6));
        System.out.println(Arrays.binarySearch(a,14));

        String[] s = {"A","Z","B"};
        Arrays.sort(s);
        for(String s1 : s){
            System.out.print(s1+" ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(s,"Z"));
        System.out.println(Arrays.binarySearch(s,"S"));

        Arrays.sort(s,new ArraysSearchDemo1MyComparator());
        System.out.println(Arrays.binarySearch(s,"Z",new ArraysSearchDemo1MyComparator()));
//        System.out.println(Arrays.binarySearch(s,"N")); =>Unpredictable output


    }
}
