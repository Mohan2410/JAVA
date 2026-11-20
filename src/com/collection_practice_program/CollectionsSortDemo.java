package com.collection_practice_program;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
//        l.add(new Integer(10));
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
//        l.add(new Integer(20));

//        System.out.println(l);
//        l.add(l.add('m'));
        System.out.println(l);

        System.out.println("Before sorting: "+l);
        Collections.sort(l,new CollectionsSortDemo2MyComparator());
        System.out.println("AFter sorting: "+l);
    }
}
