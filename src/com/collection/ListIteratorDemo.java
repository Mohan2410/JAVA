package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("Mohan");
        l.add("Om");
        l.add("Sham");
        l.add("Jay");
        l.add("Jack");
        System.out.println(l);

        ListIterator ltr = l.listIterator();
        while(ltr.hasNext()){
            String s = (String)ltr.next();
            if(s.equals("Mohan")){
                ltr.remove();
            }else if(s.equals("Om")){
                ltr.add("Kapil");
            }else if(s.equals("Kapil")){
                ltr.set("Bob");
            }
//            System.out.println(l);
        }
        System.out.println(l);

    }
}
