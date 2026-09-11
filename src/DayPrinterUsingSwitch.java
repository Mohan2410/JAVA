package com.corejava;

import java.util.Scanner;
class Test22{
    static void dayPrinter(int num){
        System.out.println("Day num: "+num);
        switch(num){
            case 1:
                System.out.println("Day name: Sunday");
                break;
            case 2:
                System.out.println("Day name: Monday");
                break;
            case 3:
                System.out.println("Day name: Tuesday");
                break;
            case 4:
                System.out.println("Day name: Wednesday");
                break;
            case 5:
                System.out.println("Day name: Thursday");
                break;
            case 6:
                System.out.println("Day name: Friday");
                break;
            case 7:
                System.out.println("Day name: Saturday");
                break;
            default:
                System.out.println("Please enter the valid number between (1-7)");}}}
class DayPrinterUsingSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Test22.dayPrinter(num);
    }
}