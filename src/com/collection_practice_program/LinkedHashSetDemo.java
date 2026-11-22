package com.collection_practice_program;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("M");
        lhs.add("O");
        lhs.add("H");
        lhs.add("P");
        lhs.add("A");

        lhs.add("A");
        lhs.add("N");
        System.out.println(lhs);

    }
}
