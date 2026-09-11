package com.corejava;

class Test1{
    public void dayName(int num){
        System.out.println("Day num: "+num);
        if(num==1){
            System.out.println("Sunday");
        }
        else if (num==2){
            System.out.println("Monday");
        }
        else if(num==3){
            System.out.println("Tuesday");
        }
        else if(num==4){
            System.out.println("Wednesday");
        }
        else if(num==5){
            System.out.println("Thursday");
        }
        else if(num==6){
            System.out.println("Friday");
        }
        else if(num==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day num, pass only between the (1-7)");
        }
    }
}
public class DayInfoPrinter{
    public static void main(String[] args){
        Test1 t1 = new Test1();

        t1.dayName(5);
    }
}