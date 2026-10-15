package com.collection;

import java.util.Comparator;

public class CollectionSearchDemo1MyComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;

        return i2.compareTo(i1);
    }
}
