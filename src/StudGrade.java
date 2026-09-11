package com.corejava;

import java.util.Scanner;
class Test2 {
    public void grade(double marks){
        if(marks<0 || marks>100){
            System.out.println("the enter marks are Invalid or Incorrect check it again");
        }
        else if(marks<35){
            System.out.println("Student is Failed");
        }
        else if(marks<50){
            System.out.println("3rd Class");
        }
        else if(marks<60){
            System.out.println("2nd Class");
        }else{
            System.out.println("First Class");
            if(marks>=70){
                System.out.println("Distinction");
            }
        }
    }
}
public class StudGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Test2 t1 = new Test2();
        System.out.println("Enter marks: ");
        double marks = sc.nextDouble();

        t1.grade(marks);

    }
}