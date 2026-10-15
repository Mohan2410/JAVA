package com.collection;

import java.util.Arrays;

public class ArraySortDemo1 {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        System.out.println("Primitive array before sorting: ");
        for(int a1 : a){
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println("Primitives Array After Sorting: ");
        for(int a1 : a){
            System.out.println(a1);
        }

        String[] s = {"A","Z","B"};
        System.out.println("Object Array before Sorting: ");
        for(String s1 : s){
            System.out.println(s1);
        }
        Arrays.sort(s);
        System.out.println("Object Array After Sorting: ");
        for(String s1 : s){
            System.out.println(s1);
        }
        Arrays.sort(s,new ArraySortDemo1MyComparator());
        System.out.println("Object Array After sorting by comparator: ");
        for (String s1 : s){
            System.out.println(s1);
        }
    }
}
