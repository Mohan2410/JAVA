package com.collection;

import java.util.Comparator;

public class PriorityQueueDemo2MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
        String s1 = (String)obj1;
        String s2 = (String)toString();
        return s1.compareTo(s2);
    }
}
