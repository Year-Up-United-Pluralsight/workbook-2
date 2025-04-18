package com.pluralsight;

public class CellPhoneApplication {

    double serialNumber; // (ex: 1000000 - 9999999)
    String model; // (ex: iPhone X)
    String carrier; // (ex: AT&T)
    String phoneNumber; // (ex: 800-555-5555);
    String owner; // (ex: Dana Wyatt)

    // Parameterless constructor with default values
    public CellPhoneApplication(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

// GETTER & SETTER FUNCTIONS

    // Serial Number
    public double getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(double serialNumber){
        this.serialNumber = serialNumber;
    }

    // Model
    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    // Carrier
    public String getCarrier(){
        return this.carrier;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    // Phone Number
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Owner
    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }








}
