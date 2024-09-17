package com.company;
// custom calculator

import java.util.Scanner;

class customCalculator{
    Scanner sc = new Scanner(System.in);
    double a , b;
    int maxInput = 100000;

    public void addition(){
        System.out.println("Enter two numbers");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a >= maxInput || b>= maxInput  ){
            System.out.println("Max Input Exception ! Value above 100000 not supported");
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.println("The sum is : " + (a+b));
        }

    }
    public void subtraction(){
        System.out.println("Enter two numbers");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a >= maxInput || b>= maxInput  ){
            System.out.println("Max Input Exception ! Value above 100000 not supported");
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.println("The difference is : " + (a-b));
        }

    }
    public void multiplication(){
        System.out.println("Enter two numbers");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a >= 7000 || b>= 7000  ){
            System.out.println("Max Multiplier Reached Exception ! Multiplication input cannot be above 7000");
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.println("The product is : " + (a*b));

        }
    }
    public void division() {
        System.out.println("Enter two numbers");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a >= maxInput || b>= maxInput  ){
            System.out.println("Max Input Exception ! Value above 100000 not supported");
            throw new ArrayIndexOutOfBoundsException();
        }

        // int data type mai exception catch ho raha h lekin double data type mai exception try module pe hi execute ho raha h

        else if (b==0) {
            try {
                System.out.println((a/b));
            }
            catch(Exception e){
                System.out.println("Error! Cannot divide by 0");
                throw new ArithmeticException();
            }
        }
        else {
             System.out.println("The dividend is : " + (a/b));
        }
    }

}
public class Exercise6 {
    public static void main(String[] args) {
        customCalculator cc = new customCalculator();
        boolean b = false;
        while (!b) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose from below operations\nOnly enter the digits");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. Exit");
            int x = scan.nextInt();

            switch (x) {
                case 1 -> cc.addition();
                case 2 -> cc.subtraction();
                case 3 -> cc.multiplication();
                case 4 -> cc.division();
                case 5 -> {
                    System.out.println("Closing calculator....");
                    b = true;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}
