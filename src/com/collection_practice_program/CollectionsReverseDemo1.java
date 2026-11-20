package com.collection_practice_program;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println("Before: "+l);
        Collections.reverse(l);
        System.out.println("After: "+l);
    }
}
