/*
Title: A file that contains various reusable tools for future programs
Author: Draedn Groves
Date: Jan 22, 2024
Purpose: Starting to learn how to build OOP methods across multiple files
 */


import java.util.Scanner;

// the main container class for our various tools that we will build
public class Tools {

    public static int genRandonInt(int lowerBound, int upperBound) {
        return (int)(Math.random() * upperBound + lowerBound);
    }

    // have the system output a prompt and wait to receive an integer
    public static int getIntFromConsole(String inputString){

        Scanner scanner = new Scanner(System.in);
        int inputInt = -1;
        do {
            System.out.println("Please enter a positive number!");
            while (!scanner.hasNextInt()){
                System.out.println("That was not a number!");
                System.out.print(inputString + " > ");
                scanner.next();
            }
            inputInt = scanner.nextInt();
        } while (inputInt <= 0);
//        System.out.println("Thanks, returning number : " + inputInt);
        return inputInt;


        // source code partially obtained from polygenelubricants on Jun 17, 2010 from stackoverflow
        // [PLACE URL HERE]
        // https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner
    }



}