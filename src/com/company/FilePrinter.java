package com.company;

import java.io.*;
import java.util.stream.Stream;

public class FilePrinter {
    public static void main(String[] args) throws IOException {
        File fl = new File("C://donut.py");

        try(BufferedReader bfreader = new BufferedReader(new FileReader(fl))) {
            String line = bfreader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bfreader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
