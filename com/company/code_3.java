package com.company;

interface example {
    void alarm();
    void phone();
    void ring();
}

class myexample implements example {
        @Override
        public void alarm() {
            System.out.println("i am alarm");
        }

        @Override
        public void phone() {
            System.out.println("i am phone");
        }

        @Override
        public void ring() {
            System.out.println("i am ringtone");
        }
    }

public class code_3 {
    public static void main(String[] args) {
      myexample ex = new myexample();

        ex.alarm();
        ex.ring();
        ex.phone();
    }
}
