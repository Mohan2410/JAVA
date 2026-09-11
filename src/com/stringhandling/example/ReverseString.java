package com.stringhandling.example;
import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args){
        String orignal = "MohanGawande";
        System.out.println("Orignal String: "+orignal);

        char[] ch = orignal.toCharArray();

        int left = 0;
        int right = ch.length-1;

        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        String reverse = new String(ch);
        System.out.println("reverse string: "+reverse);

    }
}
