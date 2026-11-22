package com.collection_practice_program;

import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new TreeSetDemo5MyComparator());
        t.add("A");
        t.add(new StringBuffer("Mohan"));
        t.add(new StringBuffer("Ajay"));
        t.add(new StringBuffer("Jivan"));
        t.add("XX");
        t.add("A");

        System.out.println(t);
    }
}
