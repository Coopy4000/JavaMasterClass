package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;


        // {} Code Block allow more than 1 output after an if statement
        if(score == 5000) {
            System.out.println("Your score was 5000");
        }
        if(score == 5000)
            System.out.println("Your score was 5000");

        if(score <=5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        //if(gameOver)
        if(gameOver == true) {
            int finalScore = score + (levelCompleted *bonus);
            System.out.println("Your final score was " + finalScore);

            int finalScore2 = score2 + (levelCompleted2 *bonus2);
            System.out.println("The high score is " + finalScore2);
        }


    }
}
