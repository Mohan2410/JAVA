package com.collection;

import java.util.Comparator;

public class MyComparator1 implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;

        //Default Natural sorting order
        //return i1.compareTo(i2);

        //Descending order
       return i2.compareTo(i1);

        //Insertion order
        //return +1;

        //Reverse Order
        //return -1;

        //only first element will be inserted and all remaining are considered duplicate
        //return 0;

    }
}
