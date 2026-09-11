package com.stringhandling.example;

import java.io.*;

public class Student implements Serializable{
    private int sno;
    private String sname;
    private String course;
    private String height;

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    static{
        System.out.println("Student class is loading");
    }
    public Student(){
        System.out.println("Student class NPC is executing");
    }
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student(String course, String sname, int sno) {
        this.course = course;
        this.sname = sname;
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", course='" + course + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.setSno(101);
        s1.setSname("Mohan");
        s1.setCourse("JFSD");
        System.out.println(s1);

        ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("student.ser")));

        oos.writeObject(s1);
        System.out.println("object data is saved");
    }



}
