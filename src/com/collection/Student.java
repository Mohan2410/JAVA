package com.collection;

import java.util.Objects;

public class Student {
    public int rollno;
    public String sname;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }
}
