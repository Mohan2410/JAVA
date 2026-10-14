package com.collection;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> t = new TreeMap<String,String>();
        t.put("b","brainrot");
        t.put("c","complier");
        t.put("a","android");
        t.put("d","developer");
        t.put("g","GitHub");

        System.out.println(t);
        System.out.println(t.ceilingKey("c"));
        System.out.println(t.higherKey("e"));
        System.out.println(t.floorKey("e"));
        System.out.println(t.lowerKey("e"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t);
        System.out.println(t.descendingMap());
        System.out.println(t);

    }
}
