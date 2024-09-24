package com.company;

@FunctionalInterface
interface DemoAno {
    void meth1();
   // void meth2();
}

public class anonymousClass {
    public static void main(String[] args) {

        // Anonymous class
        DemoAno obj = new DemoAno() {       // I did not need to implement the interface because of anonymous class
            @Override
            public void meth1() {
                System.out.println("i am meth 1");
            }


            public void meth2() {
                System.out.println("i am meth 2");

            }
        };
        obj.meth1();  // this is anonymous class overriding


        // lambda expression

        DemoAno obj1 = ()-> {
            System.out.println("I am method 1 from lambda expression");  // lambda expressions are only used for functional interface
        };
        obj1.meth1();

    }
}
