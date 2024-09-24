package com.company;

import java.util.Scanner;

public class StringQues {
    public static void main(String[] args) {

        // problem 1)  Reverse a String and check whether it is palindrome or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        String reversed ="";

        for (int i=a.length()-1;i>=0;i--){
            reversed = reversed + a.charAt(i);
        }
        System.out.println(reversed);
        if (a.equals(reversed)){
            System.out.println("palindrome string");
        }
        else {
            System.out.println("not a palindrome string");
        }

        // problem 2) Count Vowels in a String

        System.out.println("Enter a string");
        String b = sc.nextLine();
        int noOfVowels = 0;
        for (int j = 0; j<b.length(); j++){
            char ch = b.charAt(j);
            if ("AEIOUaeiou".indexOf(ch) != -1){
                noOfVowels++;
            }
        }
        System.out.println("No. of vowels = " + noOfVowels);

    }
}
