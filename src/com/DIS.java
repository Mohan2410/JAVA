package com;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DIS {
    public static void main(String[] args) throws IOException {
//        DataInputStream dis = new DataInputStream(new DataInputStream("data.txt"));

        DataInputStream dis =
                new DataInputStream(
                        new FileInputStream("data.txt")
                );
        int data1 = dis.read();
        int data2 = dis.read();
        byte data3 = dis.readByte();
        byte data4 = dis.readByte();

        System.out.println(dis.readByte());
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(data4);
    }
}
