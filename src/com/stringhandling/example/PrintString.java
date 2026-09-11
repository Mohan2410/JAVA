package com.stringhandling.example;

public class PrintString {
    public void printString(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthofString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
    public static void main(String[] args){
        PrintString ps = new PrintString();
        String str = "LOVE";
        ps.printString(str);
        System.out.println(getLengthofString(str));
    }
}
