package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add(10);
        l.add(null);
        l.add(null);

        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        System.out.println(l);
        l.add("N");
        System.out.println(l);

    }
}
