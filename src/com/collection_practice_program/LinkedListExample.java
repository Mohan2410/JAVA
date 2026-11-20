package com.collection_practice_program;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("mohan");
        ll.add(30);
        ll.add(null);
        ll.add(null);
        ll.add("mohan");
        System.out.println(ll);

        ll.set(0,"software");
        System.out.println(ll);

        ll.set(0,"Ram");
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.addFirst("Developer");
        System.out.println(ll);
    }
}
