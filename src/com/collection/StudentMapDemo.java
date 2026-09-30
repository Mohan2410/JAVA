package com.collection;

import java.util.TreeMap;

class Student33 implements Comparable<Student33>{
    int rollNo;
    String name;
    int marks;

    Student33(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student33)){
            return false;
        }

        Student33 s = (Student33) obj;

        return this.rollNo == s.rollNo;

    }
    @Override
    public String toString(){
        return rollNo+ " "+name+ " "+marks;
    }

    @Override
    public int compareTo(Student33 s) {
        return this.rollNo - s.rollNo;
    }
}
public class StudentMapDemo {
    public static void main(String[] args){
        Student33 s1 = new Student33(103,"Mohan",85);
        Student33 s2 = new Student33(101,"Mohan",92);
        Student33 s3 = new Student33(102,"Amit",88);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        TreeMap<Student33, String> map = new TreeMap<>();

        map.put(s1, "CSE");
        map.put(s2, "CSE");
        map.put(s3, "CSE");

        System.out.println(map);

    }
}
