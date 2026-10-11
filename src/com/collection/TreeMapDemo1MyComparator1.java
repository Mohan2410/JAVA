package com.collection;

import java.util.Comparator;

public class TreeMapDemo1MyComparator1 implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        return -s1.compareTo(s2);       //reverse of alphabetical order of keys     output: {ZZZ=30, XXXX=10, LLL=40, AAA=20}
        //return s1.compareTo(s2);       //ascending order of alphabetical order of keys      output: {AAA=20, LLL=40, XXXX=10, ZZZ=30}
    }
}
