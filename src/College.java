package com.corejava;

class College{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);

    Student s1 = new Student();
    Student s2 = new Student();

    s1.rollNO = 1010;
    s1.name = "Mohan Gawande";
    s1.branch = "CSE";

        System.out.println("ROll no: "+s1.rollNO);
        System.out.println("Name is: "+s1.name);
        System.out.println("Branch is: "+s1.branch);
        ;
    }
}