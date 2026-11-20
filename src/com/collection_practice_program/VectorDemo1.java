package com.collection_practice_program;

import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());

        for(int i=0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println("vector size: "+v.capacity());
        v.add(99);
        v.add(11);
        System.out.println(v.size());

        Vector v1 = new Vector(24);
        System.out.println(v1.capacity());
    }
}
