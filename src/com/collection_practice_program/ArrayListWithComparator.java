package com.collection_practice_program;

import com.collection.MyComparator1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithComparator{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println("Before Sorting: "+al);
        Collections.sort(al,new MyComparator());
        System.out.println("After sorting: "+al);
    }
}
