package com.corejava;

public class Voting {
    static boolean isEligible(int age){
        return age>=18;
    }
}
class TestVoting{
    public static void main(String args[]){
        boolean eligible = Voting.isEligible(27);
        if(eligible){
            System.out.println("you are eligible for vote");
        }else{
            System.out.println("your age is below 18 \nYor are not eligible");
        }
    }
}