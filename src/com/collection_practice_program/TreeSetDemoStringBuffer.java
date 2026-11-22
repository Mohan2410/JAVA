package com.collection_practice_program;

import java.util.TreeSet;

public class TreeSetDemoStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new TreeSetDemoStringBufferMyComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("N"));
        t.add(new StringBuffer("J"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("P"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("W"));

        System.out.println(t);

    }
}
