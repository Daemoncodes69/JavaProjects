package com.company;

import java.util.*;

public class Date_Time {
    public static void main(String[] args) {
        Date d = new Date();  // this method is used for modern day date and time system

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());
        System.out.println(d.getDay());
        System.out.println(d.getYear());
        System.out.println(System.currentTimeMillis());
    }
}
