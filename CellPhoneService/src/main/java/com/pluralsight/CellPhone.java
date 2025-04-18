package com.pluralsight;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class CellPhone {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        CellPhoneApplication cellPhone = new CellPhoneApplication();

    // GETS USER'S CELLPHONE INFO
        System.out.print("What is the serial number? ");
        double serialNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

    // SETS USER VALUES
        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setOwner(owner);
        cellPhone.setPhoneNumber(phoneNumber);

    // DISPLAYS USER'S PHONE INFO

        System.out.printf("%s's Phone Details: \n    Model: %s\n    Carrier: %s\n    Phone Number: %s\n    Serial Number: %.0f\n",
                cellPhone.getOwner(), cellPhone.getModel(), cellPhone.getCarrier(), cellPhone.getPhoneNumber(), cellPhone.getSerialNumber());


    }
}
