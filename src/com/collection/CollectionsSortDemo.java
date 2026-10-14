package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");

//        l.add(new Integer(10)); ->RE: CCE
//        l.add(null); ->RE: NPE

        System.out.println("Before Sorting: "+l);
        Collections.sort(l);
        System.out.println("After Sorting: "+l);
    }
}
