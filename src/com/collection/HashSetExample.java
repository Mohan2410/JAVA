package com.collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<Student1> hs = new HashSet<>();
        Student1 s1 = new Student1("Ram",102);
        hs.add(s1);
        System.out.println(hs);

    }
}
