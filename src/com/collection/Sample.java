package com.collection;

import java.util.*;

public class Sample {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<>();
        list.add("Rahuk");
        list.add("Mohan");
        list.add("Om");
        list.add("Ajay");
        Vector v1=new Vector();


//        for(String name : list){
//            System.out.println(name);
//        }
        Stack<Integer> p=new Stack<>();
        p.add(100);
        p.add(200);
        p.add(300);

        p.pop();
        System.out.println(p);
//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
