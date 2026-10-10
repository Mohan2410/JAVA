package com.collection;

import java.util.HashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args){
        HashMap m = new HashMap();
        Integer i1 =  new Integer(10);
        Integer i2 = new Integer(10);

        m.put(i1,"pawan");
        m.put(i2,"kalyan");
        System.out.println(m);
    }
}
