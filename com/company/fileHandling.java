package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {

        /*   code to create the file

         File myfile = new File("nipun's first file using java");
        try {
            myfile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create the file");
            throw new RuntimeException(e);
        }



        // code to write in a file

        try {
            FileWriter fileWriter = new FileWriter("nipun's first file using java");
            fileWriter.write("this is our first file from java course\nThanks");
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // reading a file

        File myfile = new File("nipun's first file using java");
        Scanner sc = null;
        try {
            sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
                */


        // deleting a file

        File myfile = new File("nipun's first file using java");

    }
}
