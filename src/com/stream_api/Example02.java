package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example02{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);

        System.out.println(al);

        List<Integer> al2 =  al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even number: "+al2);

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(88);
        marks.add(34);
        marks.add(10);
        marks.add(27);
        marks.add(98);
        marks.add(78);

        System.out.println("Student marks: "+marks);
        List<Integer> updatedMarks =  marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("Updated marks: "+updatedMarks);

        System.out.println();
        List<Integer> passedStud =  marks.stream().filter(m->m<35).collect(Collectors.toList());
        long countFailedStud = marks.stream().filter(m->m<35).count();
        System.out.println("Passed student: "+passedStud);
        System.out.println("Failed student: "+countFailedStud);

        List<Integer> sortedMarks =  marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted marks: "+sortedMarks);

        //Descending order
        List<Integer> marksDesc= marks.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println("Descending: "+marksDesc);

        List<Integer> descOrderMrks = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(descOrderMrks);
    }
}