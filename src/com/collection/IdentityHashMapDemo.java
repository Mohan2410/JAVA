package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args){
        IdentityHashMap m = new IdentityHashMap();
        Integer i1 =  new Integer(10);
        Integer i2 = new Integer(10);

        m.put(i1,"pawan");
        m.put(i2,"kalyan");
        System.out.println(m);
    }
}
