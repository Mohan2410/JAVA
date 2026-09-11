package com.corejava;

class DaytypePrint {
    static void dayType(int daynum){
        if(daynum <= 5){
            System.out.println("Weekday");
        }else if(daynum >=7){
            System.out.println("Weekend");
        }
        else if(daynum > 8){
            System.out.println("Enter number between 1-8");
        }
    }
}
class DayType{
    public static void main(String[] args){
        DaytypePrint.dayType(9);
    }
}