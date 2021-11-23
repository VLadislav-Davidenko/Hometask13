package com.company;

import java.io.File;

public class DirectoryFilesPrinter {

    public static void main(String[] args) {

        File fl1 = new File("C://Test");

        DirectoryFilesPrinter.printNames(fl1);
    }



    public static void printNames(File fl){
        if(fl.isDirectory() || fl.isFile()){
            File[] files = fl.listFiles();
            for (File file : files) {
                if(file.isDirectory()){
                    System.out.println(file.getName());
                    System.out.print(" ");
                    printNames(file);
                } else{
                    System.out.print(" ");
                    System.out.println(file.getName());
                }
            }
        } else{
            System.out.println("«Каталог не существует или пуст");
        }
    }

}
