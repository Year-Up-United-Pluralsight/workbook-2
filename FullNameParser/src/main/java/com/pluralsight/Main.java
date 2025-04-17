package com.pluralsight;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

    // ESTABLISH KNOWN VALUES ---------------------------------------------------------------
        System.out.println("Please enter your name: ");
        String name = (scanner.nextLine()).trim();      // Takes name input, trims each side

    // CALCULATE THE UNKNOWN ---------------------------------------------------------------
        String[] splitName = name.split(" ");    // Splits input by " " to isolate names; 2 or 3

        // Sets first and last name
        String firstName = splitName[0];                    // Sets first element to firstName
        String lastName = splitName[splitName.length - 1];  // Sets last element to lastName

        String middleName;                           // Initializes middleName variable

        // Sets middleName based on input
        if (splitName.length == 3) {                // If first + middle + last name

            middleName = splitName[1];              // Sets middleName to middle element
        }

        else {                                      // Else only first + last name

            middleName = "(none)";                  // Sets middleName to (none)
        }

    // DISPLAYS THE FULL NAME ---------------------------------------------------------------
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}