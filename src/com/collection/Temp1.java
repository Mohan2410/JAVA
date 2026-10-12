package com.collection;

public class Temp1 {
    int i;
    Temp1(int i){
        this.i= i;
    }
    public int hashCode(){
        return i;
       // return i % 9; //if we change in hashCode method logic or value then it reflects in Output
    }
    public String toString(){
        return i+" ";

    }
}
