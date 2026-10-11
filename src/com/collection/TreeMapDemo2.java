package com.collection;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(new TreeMapDemo1MyComparator1());
        t.put("XXXX",10);
        t.put("AAA",20);
        t.put("ZZZ",30);
        t.put("LLL",40);
        System.out.println(t);
    }
}
