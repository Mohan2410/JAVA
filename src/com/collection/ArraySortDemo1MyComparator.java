package com.collection;

import java.util.Comparator;

public class ArraySortDemo1MyComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        String s1 = (String)obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
