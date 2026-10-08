package com.collection;

import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new TreeSetDemo5MyComparator());
        t.add("A");
        t.add(new StringBuffer("MOHAN"));
        t.add(new StringBuffer("Ajay"));
        t.add(new StringBuffer("Jivan"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");

        System.out.println(t);
    }
}
