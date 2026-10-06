package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("Z");
        lhs.add(null);

        System.out.println("Z");
        System.out.println(lhs); //insertion order is preserved
                                // where as the only difference betn the HashSet and LinkedHashSet
                                //HashSet: insertion order is not preserved
                                //LinkedHashSet: insertion order is preserved
    }
}
