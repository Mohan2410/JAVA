package com.stringhandling.example;

public class Example2 {
    public static void main(String[] args){
        char[] ch = {'m','o','h','a','n'};
        for(int i = 0;i < ch.length;i++){
            System.out.println(ch[i]);
        }

        String s1 = "Hari";
        System.out.println(s1);

        s1.concat("Krishna");
        System.out.println(s1);

        StringBuffer b1 = new StringBuffer("Hari");
        System.out.println(b1);

        b1.append("Krishna");
        System.out.println(b1);
    }
}
