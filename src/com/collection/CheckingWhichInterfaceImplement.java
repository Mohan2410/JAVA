package com.collection;

import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class CheckingWhichInterfaceImplement {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        System.out.println(ll instanceof Serializable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(ll instanceof Cloneable);
        System.out.println(ll instanceof RandomAccess);

    }
}
