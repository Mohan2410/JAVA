package com.collection;

import java.util.TreeSet;

public class TreeSetComparatorInterface1 {
    public static void main(String[] args){
        TreeSet t1 = new TreeSet(new MyComparator1());
        t1.add(10);
        t1.add(20);
        t1.add(4);
        t1.add(2);
        t1.add(21);
        t1.add(17);

//        t1.add("mohan");  //treeset only allows same type of object i.e -> homogeneous

        System.out.println(t1);
    }
}
