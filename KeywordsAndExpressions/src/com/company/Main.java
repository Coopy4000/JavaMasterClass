package com.company;

public class Main {

    public static void main(String[] args) {
        double kilometreConversion = 1.609344;
        double kilometre = 100 * kilometreConversion;

        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");
        }


        //Write down what parts of the code are expressions
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        // score = 100
        // score > 99
        // You got the high score!
        // score = 0
    }
}
