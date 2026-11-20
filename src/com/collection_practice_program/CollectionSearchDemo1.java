package com.collection_practice_program;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,new CollectionSearchDemo1MyComparator());
        System.out.println(Collections.binarySearch(l,10,new CollectionSearchDemo1MyComparator()));
        System.out.println(Collections.binarySearch(l,13,new CollectionSearchDemo1MyComparator()));
        System.out.println(Collections.binarySearch(l,99,new CollectionSearchDemo1MyComparator()));
        System.out.println(Collections.binarySearch(l,89,new CollectionSearchDemo1MyComparator()));

    }
}
