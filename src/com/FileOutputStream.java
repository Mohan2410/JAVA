package com;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
class FileOutputStream1{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("abc.txt");
        fos.write(5);
        fos.write(97);
        fos.write('b');
        fos.write(150);

        fos.write("Mohan".getBytes());
        fos.write("Gawande".getBytes());

        System.out.println("Data is saved");

        fos.close();
    }
}