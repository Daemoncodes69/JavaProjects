package com.company;
// guess the number game designed by NIPUN

import java.util.Random;
import java.util.Scanner;

class Game {
    int noOfGuesses = 0;
    int compInput;
    int takeUserInput;


    public int comp(){
        Random rc = new Random();
         compInput = rc.nextInt(0, 101);
        return compInput;
    }

    public int user(){
        Scanner sc = new Scanner(System.in);
         takeUserInput = sc.nextInt();
        return takeUserInput;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public void myGame(){
        System.out.println("Guess the number between 0 - 100");

    }

    boolean isCorrectNum(){
        noOfGuesses++;
        if (takeUserInput== compInput) {
            System.out.println("Bingo! you guessed it right in " + noOfGuesses + " attempts");
            return true;
        }

        else if (takeUserInput>compInput){
            System.out.println("No. is too big");
        }

        else if (takeUserInput<compInput) {
            System.out.println("no. is too small");
        }
        else if (takeUserInput>101){
            System.out.println("invalid value");
            return true;
        }
        return false;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Game g = new Game();
        g.comp();
        boolean b = false;
        while (!b) {
            g.myGame();
            g.user();
            b=g.isCorrectNum();
            System.out.println(b);
        }

    }
}
