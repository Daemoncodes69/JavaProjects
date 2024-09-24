package com.company;

public class Exception_3 {
    public static void main(String[] args) {

        int a = 7, b = 8;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println("\nError");
                break;
            }
            finally {
                System.out.println("I am finally the value of b for " + b);
            }
            b--;
        }
    }
}
