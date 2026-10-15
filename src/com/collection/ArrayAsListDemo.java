package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {
    public static void main(String[] args) {
        String[] s = {"A","Z","B"};
        List l = Arrays.asList(s);
        s[0] = "K";
        System.out.println(l);
        l.set(1,"L");
        for (String s1 : s){
            System.out.println(s1);
        }
        System.out.println(l);

//        l.add("durga"); RE:UnsupportedOperationException
//        l.remove(2); RE:UnsupportedOperationException
//        l.set(1,new Integer(10)); RE: ArrayStoreException
    }
}
