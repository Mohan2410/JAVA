package com.corejava;

import java.util.InputMismatchException;
import java.util.Scanner;
public class VoterRegOffice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            Voter v = new Voter();

            System.out.println("\nEnter a name: ");
            v.setName(sc.nextLine());

            try{
                System.out.println("\nEnter age: ");
                v.setAge(sc.nextInt());

                System.out.println("Hi "+v.getName()+"your details are saved");
                System.out.println("Please collect your voter card");
                System.out.println("From eseva after 15 days");
            }catch(InputMismatchException e){
                System.out.println("Error: Pass only Integer");
            }
            catch(IllegalArgumentException e){
                System.out.println("Error: "+e.getMessage());
            }finally{
                sc.nextLine();
            }
        }
    }
}