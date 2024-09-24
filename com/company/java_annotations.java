package com.company;

@FunctionalInterface
interface myFunctionalInterface {
    void method1();
}

class myex implements myFunctionalInterface {
    @Override
    public void method1() {
        System.out.println("i am method 1");
    }
}
class newclass extends javadocs_1{
    @Override
     public void add(int a, int b) {
        System.out.println("this is override");
    }
    @Deprecated
    public int sum(int a , int b) {
        return a+b;
    }
}

public class java_annotations {

    public static void main(String[] args) {

        newclass nc = new newclass();
        myex x = new myex();

        nc.add(5,8);
        nc.sum(10,18);

        x.method1();
    }
}

