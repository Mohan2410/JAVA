package com.collection;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap<>();
        t.put(100,"ZZZ");
        t.put(103,"YYY");
        t.put(101,106);

       // t.put("FFF","XXX");  //get the RE: CCE bcoz keys should be homogeneous and comparable

       // t.put(null,788);  //we will get NPE bcoz TreeMap contains some element and then we are trying to insert the key as null then, we get the NPE

        System.out.println(t);
    }
}
