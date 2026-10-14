package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        System.out.println("Before Sorting: "+l);
        Collections.sort(l,new CollectionsSortDemo2MyComparator());
        System.out.println("After sorting: "+l);


    }
}
