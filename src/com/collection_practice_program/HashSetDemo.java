package com.collection_practice_program;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("A");
        h.add("Z");
        h.add("B");
        h.add(null);
        h.add(null);

        System.out.println(h);
        h.add(null);
//        System.out.println(h);

        System.out.println(h.add("B"));
        System.out.println(h.add("C"));
        System.out.println(h.add("B"));

        System.out.println(h.add(null));
        System.out.println(h.add(null));
        System.out.println(h.add("M"));
    }
}
