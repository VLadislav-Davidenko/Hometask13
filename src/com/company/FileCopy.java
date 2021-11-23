package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream("C://donut.py");
            FileOutputStream fileOutputStream = new FileOutputStream("C://Test//Copytext.txt")){

            int i;
            while ((i = fileInputStream.read()) != -1){
                fileOutputStream.write((char) i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
