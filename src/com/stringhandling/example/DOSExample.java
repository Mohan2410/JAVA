package com.stringhandling.example;

import java.io.*;

public class DOSExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.write(97);
        dos.write(-98);
        dos.write(97);
        dos.write(-98);

        dos.writeInt(100);
        dos.writeByte(5);
        dos.writeShort(99);

        dos.writeBoolean(true);

        System.out.println("Data is saved");

    }
}
