package com.corejava;

public class Voter{
    private int age;
    private String name;

    public void setAge(int age) throws IllegalArgumentException{
        if(age < 18 || age > 120){
            throw new IllegalArgumentException("You are not eligibal for voting");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}