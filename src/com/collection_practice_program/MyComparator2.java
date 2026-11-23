package com.collection_practice_program;

import java.util.Comparator;

public class MyComparator2 implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;

        String s1 = e1.ename;
        String s2 = e2.ename;

        return e1.compareTo(s2);
    }
}
