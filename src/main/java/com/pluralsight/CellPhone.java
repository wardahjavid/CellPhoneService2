package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    public String getCarrier() { return carrier; }
    public String getModel() { return model; }
    public int getSerialNumber() { return serialNumber; }
    public String getOwner() { return owner; }
    public String getPhoneNumber() { return phoneNumber; }


    public void setSerialNumber(int serialNumber) { this.serialNumber = serialNumber; }
    public void setOwner(String owner) { this.owner = owner; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setModel(String model) { this.model = model; }


    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }


    public void dial(String phoneNumberToCall) {
        System.out.println(owner + "'s phone is calling " + phoneNumberToCall);
    }
}