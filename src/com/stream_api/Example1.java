package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(10);
        marks.add(30);
        marks.add(77);
        marks.add(22);
        marks.add(42);
        marks.add(32);
        System.out.println(marks);

        List<Integer> list = marks.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even marks: "+list);

//        5 grace or updated marks for each student
        List<Integer> grace = marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("Grace marks: "+grace);
    }
}
