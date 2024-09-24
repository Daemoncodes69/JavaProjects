package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1 {
    int userNum;
    int compNum;
    int noOfGuesses = 0;

    Game1() {
        Random rc = new Random();
        this.compNum = rc.nextInt(100);
    }

    public int takeUserInput() {
        System.out.println("guess the no. between 1 - 100");
        Scanner sc = new Scanner(System.in);
        userNum = sc.nextInt();
        return userNum;
    }

    void isCorrectNum() {
        noOfGuesses++;

        if (userNum==compNum) {
            System.out.println("Bingo! you guessed it right in " + noOfGuesses + " attempts");
            System.out.println("thank you for playing");
        }

        else if (userNum>compNum) {
            System.out.println("no. is too big");
        }

        else if (userNum<compNum) {
            System.out.println("no. is too low");
        }
        else if (userNum>101){
            System.out.println("invalid info");
        }

    }
}

public class game_1_1 {
    public static void main(String[] args) {
        Game1 g = new Game1();

        while (true) {
            g.takeUserInput();
            g.isCorrectNum();
        }
    }
}
