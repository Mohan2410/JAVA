package com.collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("mohan");
        l.add(30);
        l.add(null);
        l.add("mohan");
        System.out.println(l);

        l.set(0,"Software");
        System.out.println(l);

        l.add(0,"Ram");
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        l.addFirst("CCC");

        System.out.println(l);

    }
}
