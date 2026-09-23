package com.collection;

public class Student1{
    String sname;
    int rno;

    public Student1(String sname,int rno){
        this.sname = sname;
        this.rno = rno;
    }


    public boolean equals(Student1 s){
        return this.rno == s.rno && this.sname == s.sname;

    }
    public static void main(String[] args) {
        Student1 s1 = new Student1("Mohan",101);
        Student1 s2 = new Student1("Ram",101);

        System.out.println(s1.equals(s2));
    }
}