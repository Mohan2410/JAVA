package com.corejava;

class Student11{
    private int sno;
    private String sname;

    void setSno(int sno){
        this.sno = sno;
    }
    void setSname(String sname){
        this.sname = sname;
    }
    int getSno(){
        return sno;
    }
    String getSname(){
        return sname;
    }

    void showData(){
        System.out.println("sno: "+sno);
        System.out.println("sname: "+sname);
    }
}
class Sample{
    public static void main(String[] args){
        Student11 s1 = new Student11();
        Student11 s2 = new Student11();

        System.out.println("Setting and Getting for the s1 object");
        s1.setSno(101);
        s1.setSname("Mohan");


        s1.getSno();
        s1.getSname();

        s1.showData();

        System.out.println("setting and getting for the s2 object");
        s2.setSno(102);
        s2.setSname("Ajay");

        s2.getSno();
        s2.getSname();

        s2.showData();





    }
}

