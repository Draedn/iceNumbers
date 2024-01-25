/*
Title: COSC1200-02 Project Template Creation
Author: Draedn Groves
Date: Jan 22, 2024
Purpose: To start to develop a reusable template for multiple projects we will use for demos
*/

import javax.tools.Tool;

// main class where the application starts
public class Main {

    // global variables
    static int correctNumber;
    static final int MIN_NUM = 1, MAX_NUM = 100;


    // main method to start the application
    public static void main(String[] args) {

        initializeGame();
        runGame();
        closeGame();
    }

    // initial game setup
    private static void initializeGame() {
        System.out.println("Welcome to our Guess the Number console game");
        System.out.println("********************************************");
        correctNumber = Tools.genRandonInt(MIN_NUM, MAX_NUM);
//        System.out.println("A random number is " + correctNumber);

    }

    // run the GTN game
    private static void runGame() {
        int guessedNumber = Tools.getIntFromConsole("Please enter a positive number!");
        System.out.println("Random number: " + correctNumber + " - your guess: " + guessedNumber);
    }

    // close the game
    private static void closeGame() {
        System.out.println("Good-bye!!");
    }
}