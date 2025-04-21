package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Sets variables
        int[] testScores = {64, 89, 77, 98, 71, 81, 68, 90, 76, 70};
        double total = 0;
        int highestScore = 0;
        int lowestScore = 100;

        // Gets total score
        for (int i = 0; i < 10; i++){
            total += testScores[i];
        }

        // Finds average
        double averageScore = total / 10;

        // Finds highest score
        for (int i = 0; i < 10; i++){
            if (testScores[i] > highestScore){
                highestScore = testScores[i];
            }
        }

        // Finds lowest score
        for (int i = 0; i < 10; i++){
            if (testScores[i] < lowestScore){
                lowestScore = testScores[i];
            }
        }

        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

    }
}