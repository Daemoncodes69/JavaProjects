package com.company;

import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.*;

class myDeprecated {
    @Deprecated
    void meth1(){
        out.println("i am deprecated meth1");
    }
}

interface display {
    void ringtone();
}

public class practiceSet {
    public static void main(String[] args) {
        // Q2
        myDeprecated d = new myDeprecated();
        d.meth1();
        
        //Q4
        display dp = new display() {
            @Override
            public void ringtone() {
                System.out.println("trrrriiinnnggg");
            }
        };
        dp.ringtone();

        //Q5

        try {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter("Multiplication table");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int i = 19;
            String table = "";
            for (int j = 1; j <11 ; j++) {
                table += i + " X " + j + " = " + (i*j);
                table += "\n";
            }

            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
