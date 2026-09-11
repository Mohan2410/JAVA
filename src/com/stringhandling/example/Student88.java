package com.stringhandling.example;

class Student88 {
    private int sno;
    private String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    private String course;
    private double fees;

    public Student88(){
        System.out.println("Student object is created");
    }

    public static void main(String[] args){
        Student88 s1 = new Student88();
    }

}
