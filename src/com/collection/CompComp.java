package com.collection;

import java.util.TreeSet;

public class CompComp {
    public static void main(String[] args) {
        Employee e1 = new Employee("nag",100);
        Employee e2 = new Employee("balraj",200);
        Employee e3 = new Employee("veeru",50);
        Employee e4 = new Employee("venki",150);
        Employee e5 = new Employee("nag",100);

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println(t);     //[veeru--50, nag--100, venki--150, balraj--200]

        TreeSet t1 = new TreeSet(new MyComparator2());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println(t1); //[balraj--200, nag--100, veeru--50, venki--150]    //alphabetical by name


    }
}
