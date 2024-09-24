package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // CBSE percentage calculator
        System.out.println("Program to calculate your overall percentage");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in English out of 100");
        double a =sc.nextDouble();
        System.out.println("Enter marks in Computer out of 100");
        double b = sc.nextDouble();
        System.out.println("Enter marks in Physics out of 100");
        double c = sc.nextDouble();
        System.out.println("Enter marks in Chemistry out of 100");
        double d = sc.nextDouble();
        System.out.println("Enter marks in Maths/Bio out of 100");
        double e = sc.nextDouble();

        double percentage = (a+b+c+d+e)/5;
        System.out.println("Your overall percentage is " + percentage + "%");

    }
}
