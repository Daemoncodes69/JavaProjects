package com.company;

import java.io.IOException;
import java.util.Scanner;

class myException extends Exception{
   public void error1() throws Exception {
       System.out.println("i am error1");
   }
   public void error2() throws Exception{
       System.out.println("i am error2");
   }
}
public class Exception_1 {
    public static void main(String[] args) {
        myException me = new myException ();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if (num<10){
            try {
                System.out.println("accessing");
                try {
                    me.error1();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            catch (ArithmeticException e) {
                System.out.println("there is an exception: " + e);
                try {
                    me.error2();

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
