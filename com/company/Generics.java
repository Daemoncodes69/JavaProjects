package com.company;
import java.util.ArrayList;

class myGenerics<T1> {
    int val;
    private T1 t1;

    public myGenerics(int val , String t1) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public myGenerics(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(56);
        arrayList.add(69);
        arrayList.add(34);
        arrayList.add(5);
        arrayList.add(98);

        int a = arrayList.get(4);
       // System.out.println(a);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        myGenerics<String> g1 = new myGenerics<>("\nthis is the string" );
        String str = g1.getT1();
        System.out.println(str);
    }
}
