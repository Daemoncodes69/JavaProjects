package com.company;

class divide{
    public int divide1(int a , int b) throws ArithmeticException{
        return a/b;
    }
}
public class Exception_2 {
    public static void main(String[] args) {
        divide d = new divide();
        try{
            System.out.println(d.divide1(8,0));
        }
        catch (ArithmeticException e){
            System.out.println("Error!Cannot divide by 0 \n" + e);
        }


    }
}
