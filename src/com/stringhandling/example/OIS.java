package com.stringhandling.example;

import java.io.*;

public class OIS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));

        Object obj = ois.readObject();
        System.out.println(obj);
    }
}
