package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String fullname;
        int age;
        String profession;

        // Get person info from user
        System.out.print("What is the person's full name? ");
        fullname = scanner.nextLine();

        System.out.print("What is the person's age? ");
        age = scanner.nextInt();
        scanner.nextLine();  // clears the CRLF

        System.out.print("What is the person's profession? ");
        profession = scanner.nextLine();

        // Create a person
        Person thePerson = new Person (fullname, age, profession);

        // Get person info from user
        System.out.print("What is the person's full name? ");
        fullname = scanner.nextLine();

        System.out.print("What is the person's age? ");
        age = scanner.nextInt();
        scanner.nextLine();  // clears the CRLF

        System.out.print("What is the person's profession? ");
        profession = scanner.nextLine();

        // Create a person
        Person theOtherPerson = new Person (fullname, age, profession);

        theOtherPerson.haveABirthday();

        // Displays person's fullname using class method
        System.out.println(thePerson.getFullname());

        System.out.println(theOtherPerson.getFullname());


        displayPerson(thePerson);
        displayPerson(theOtherPerson);

    }


    public static void displayPerson (Person person){
//        System.out.printf("Person %s is a %s and is %d years old.\n",
//                person.getFullname(),
//                person.getProfession(),
//                person.getAge());

        System.out.println(person.toString());
    }

    // Saves a person to the database
    public static void savePerson(String fullname, int age, String profession) {


    }
}