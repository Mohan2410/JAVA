package com.collection;

import java.util.TreeSet;

public class TreeSetDemoStringBuffer {
    public static void main(String[] args){
        TreeSet t = new TreeSet(new TreeSetDemoStringBufferMyComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("J"));
        t.add(new StringBuffer("S"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));

        System.out.println(t);


    }
}
