package com.collection;

import java.util.TreeSet;

public class TreeSetComparatorInterfaceStringObjectReverse {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new StringComparatorDesc());
        t.add("Mohan");
        t.add("Ajay");
        t.add("Ansh");
        t.add("Sopan");
        t.add("Jivan");
        t.add("Smith");
        t.add("Zensar");

        System.out.println(t);
    }
}
