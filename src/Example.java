package com.corejava;

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student s3 = new Student();
        Student s4 = new Student();

        System.out.print("Enter student number: ");
        s3.rollNO = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        s3.name = sc.nextLine();

        System.out.print("Enter Branch: ");
        s3.branch = sc.nextLine();

        System.out.println("Enter data is...");
        System.out.println();

        System.out.println("Roll no. is: "+s3.rollNO);
        System.out.println("Name is: "+s3.name);
        System.out.println("Branch is: "+s3.branch);

        System.out.println();

        System.out.print("Enter Roll no: ");
        s4.rollNO = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        s4.name = sc.nextLine();

        System.out.print("Enter Branch: ");
        s4.branch = sc.nextLine();


        System.out.println("Roll no. is: "+s4.rollNO);
        System.out.println("Name is: "+s4.name);
        System.out.println("Branch is: "+s4.branch);
    }
}