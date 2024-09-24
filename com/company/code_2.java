package com.company;

import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {

     boolean b= true;
     while (b) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your input");
         int a = sc.nextInt();

         if (a < 10 || a > 15) {
             System.out.println("your value is good");

         } else {
             System.out.println("your value is bad");
             b = false;
         }

     }
    }
}
