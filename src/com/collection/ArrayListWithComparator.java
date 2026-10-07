package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithComparator {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(10);
        al.add(20);
        al.add(14);
        al.add(7); //sorted in desc order bcoz we write the desc order logic in compare method of the comparator Interface

//        al.add("abc"); //with comparator we can order with same type of value
//        al.add("mohan");
//        al.add(7.5);

        //with ArrayList we cannot directly pass the Comparator object
        //we can use the collections utility methods

        System.out.println("Before Sorting: "+al);
        Collections.sort(al,new MyComparator());
        System.out.println("After sorting: "+al);
    }
}
