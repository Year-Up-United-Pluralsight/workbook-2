package com.pluralsight;
import java.util.Scanner;

public class FullNameGenerator {

    // Initializes scanner
    static Scanner scanner = new Scanner (System.in);

    // Initializes static name variables
    static String firstName;
    static String lastName;
    static String midName;
    static String suffix;

    public static void main(String[] args){

        // No user input expected
        System.out.println("Please enter your name\n");

        // Gets user info, then displays full name
        getUserInfo ();
        displayUserFullName ();
    }

    // Gets info for user's name via prompts
    public static void getUserInfo (){

        // Will Always Have...
        System.out.println("First name: ");     // First
        firstName = (scanner.nextLine()).trim();

        System.out.println("Last name: ");      // Last
        lastName = (scanner.nextLine()).trim();

        // May or May Not Have...
        System.out.println("Middle name: ");    // Middle
        midName = (scanner.nextLine()).trim();

        System.out.println("Suffix name: ");    // Suffix
        suffix = (scanner.nextLine()).trim();
    }

    // Displays user's full name
    public static void displayUserFullName () {

        if (midName.isEmpty() && suffix.isEmpty()){
            System.out.printf("Full name: %s %s", firstName, lastName);
        }

        else if (suffix.isEmpty()){
            System.out.printf("Full name: %s %s %s", firstName, midName, lastName);
        }

        else if (midName.isEmpty()){
            System.out.printf("Full name: %s %s, %s", firstName, lastName, suffix);
        }

        else {
            System.out.printf("Full name: %s %s %s, %s", firstName, midName, lastName, suffix);
        }
    }


}
