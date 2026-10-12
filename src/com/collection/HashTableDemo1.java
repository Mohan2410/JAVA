package com.collection;

import java.util.Hashtable;

public class HashTableDemo1 {
    public static void main(String[] args){
        Hashtable h = new Hashtable();
        h.put(new Temp1(5),"A");
        h.put(new Temp1(2),"B");
        h.put(new Temp1(6),"C");
        h.put(new Temp1(15),"D");
        h.put(new Temp1(23),"E");
        h.put(new Temp1(16),"F");
//        h.put("durga",null);  //RE: NPE

        System.out.println(h);
    }
}
