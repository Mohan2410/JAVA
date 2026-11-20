package com.collection_practice_program;

import java.util.Arrays;

public class ArraySortDemo1 {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        System.out.println("Primitive array before sorting: ");
        for(int i:a){
            System.out.println(i);
        }
        Arrays.sort(a);
        System.out.println("Primitive array after sorting: ");
        for(int i:a){
            System.out.println(i);
        }
//        Arrays.sort(a,new ArraySortDemo1MyComparator());
        System.out.println(Arrays.toString(a));

        String[] s = {"M","O","H","A","N"};
        System.out.println("Object Array before sorting: ");
        for(String s1 : s){
            System.out.println(s1);
        }
//        Arrays.sort(s,new ArraySortDemo1MyComparator());
        System.out.println("Object array after sorting: ");
        System.out.println(Arrays.toString(s));


    }
}
