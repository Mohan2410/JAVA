package com.collection_practice_program;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {
    public static void main(String[] args){
        String[] s = {"A","Z","B"};
        System.out.println(s[1]);
        List l = Arrays.asList(s);
        s[0] = "K";

        System.out.println(l);
        l.set(1,"L");
        System.out.println(l);

        for(String s1:s){
            System.out.println(s1);
        }
        System.out.println(l);

    }
}
