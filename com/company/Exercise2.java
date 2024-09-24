package com.company;
import java.util.Random;
import java.util.Scanner;

// rock paper scissor game created by NIPUN
// 0 beats 2 , 1 beats 0 and 2 beats 1

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int i = 0;

        while (i<6) {
            int comp = rc.nextInt(3);
            System.out.println("You are about to play rock, paper & scissor");
            System.out.println("Please choose:  \n0 for rock \n1 for paper \n2 for scissors");
            int user = sc.nextInt();

            if ( user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1){
                System.out.println("Congratulations! you won");
            }

            else if (user == 0 && comp == 0 || user == 1 && comp == 1 || user == 2 && comp == 2){
                System.out.println("Match Tied!");
            }

            else  {
                System.out.println("Better Luck Next Time");
            }

            System.out.println("Computer chose " + comp);
            i++;

        }

    }
}
