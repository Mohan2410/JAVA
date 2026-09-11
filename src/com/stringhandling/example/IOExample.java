package com.stringhandling.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


/*
* In java 25v we have to direct methods for reading complete file data
* at a time with as single method call
*
* with java 25v
*   1.we no need to createBR object
*   2.we no need to create SB object
*   3.we no need to callbr.readlines() inside the loop
*   4.we no need to convert SB object String
*
*   All above four steps boiler plate code caan be done in single line
*   with the below 2 methods available in
*   All above four steps to code is boiler plate code
* */
public class IOExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        String fileData = fr.readAllAsString().replace("abc","xyz");

        FileWriter fw = new FileWriter("abc.txt");
        fw.write(fileData);

        fr.close();
        fw.close();


//        Example2

        FileReader fr2 = new FileReader("abc.txt");
        List<String> allLines = fr2.readAllLines();

        allLines.stream().forEach(System.out::println);
        System.out.println();

        allLines.stream()
                .filter(line->line.contains("d"));
    }
}
