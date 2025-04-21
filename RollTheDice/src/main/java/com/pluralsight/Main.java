package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Creates an instance of Dice
        Dice dice = new Dice();

        // Initializes variables
        int roll1;
        int roll2;
        int numOf2 = 0;
        int numOf4 = 0;
        int numOf6 = 0;
        int numOf7 = 0;


        for(int rollNumber = 1; rollNumber <= 100; rollNumber++){

            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d Sum: %d\n", rollNumber, roll1, roll2, rollTotal);  // Using %d since they're ints

            if (rollTotal == 2) { numOf2++; }
            if (rollTotal == 4) { numOf4++; }
            if (rollTotal == 6) { numOf6++; }
            if (rollTotal == 7) { numOf7++; }

        }

        System.out.println("\nTotal number of 2's: " + numOf2);
        System.out.println("Total number of 4's: " + numOf4);
        System.out.println("Total number of 6's: " + numOf6);
        System.out.println("Total number of 7's: " + numOf7);

    }
}