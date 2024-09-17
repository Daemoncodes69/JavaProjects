package com.company;

import java.util.Scanner;

class mathsMensuration {

    double length,breadth,radius,height,volume,side,base,area;
    Scanner sc =new Scanner(System.in);
    public void rectangle(){
        System.out.println("enter the length");
        length = sc.nextDouble();
        System.out.println("enter the breadth");
        breadth = sc.nextDouble();
        System.out.println("area of rectangle is " + length*breadth);
    }

        public void square(){
        System.out.println("enter the side");
        side = sc.nextDouble();
            System.out.println("area of square is " + side*side);
    }

    public void triangle(){
        System.out.println("enter the side ");
        side = sc.nextDouble();
        System.out.println("perimeter of triangle is " + 3*side);
        System.out.println("enter the base");
        base = sc.nextDouble();
        System.out.println("enter the height");
        height = sc.nextDouble();
        System.out.println("area of triangle is " + 0.5 * base*height);
    }

    public void circle(){
        System.out.println("enter the radius");
        radius = sc.nextDouble();
        System.out.println("circumference of circle is " + (2*Math.PI*radius));
        System.out.println("area of circle is " + Math.PI*radius*radius);
    }

    public void cone(){
        System.out.println("enter the radius");
        radius = sc.nextDouble();
        System.out.println("enter the height");
        height = sc.nextDouble();
        volume = ((double) 1 /3) * Math.PI* radius * radius * height;
        System.out.println("volume of cone is " + volume);
    }

    public void cylinder(){
        System.out.println("enter the radius");
        radius = sc.nextDouble();
        System.out.println("enter the height");
        height = sc.nextDouble();
        volume = Math.PI* radius * radius * height;
        System.out.println("volume of cylinder is " + volume);
    }
    public void exit(){
        System.out.println("Thank you for using Nipun's genius code");
    }
}
public class Mensuration {
    public static void main(String[] args) {

        mathsMensuration MM = new mathsMensuration();
        Scanner scan = new Scanner(System.in);

        boolean b = false;

       while(!b) {

           System.out.println("You are about to use mensuration class developed by Nipun Gupta");
           System.out.println("Please choose among the given choices below by entering the selected number: ");
           System.out.println("1. Rectangle");
           System.out.println("2. Square");
           System.out.println("3. Triangle");
           System.out.println("4. Circle");
           System.out.println("5. Cone");
           System.out.println("6. Cylinder");
           System.out.println("7. Exit");

           int choice = scan.nextInt();

           switch (choice) {
               case 1 -> MM.rectangle();
               case 2 -> MM.square();
               case 3 -> MM.triangle();
               case 4 -> MM.circle();
               case 5 -> MM.cone();
               case 6 -> MM.cylinder();
               case 7 -> {
                   MM.exit();
                   b = true;
               }
               default -> System.out.println("no match found!");
           }
       }

    }
}

