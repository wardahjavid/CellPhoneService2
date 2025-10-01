package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first phone
        CellPhone cellPhone1 = new CellPhone();
        System.out.print("Enter info for Phone 1\n");
        System.out.print("Serial number ");
        int serialNumber1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Model ");
        String model1 = scanner.nextLine();

        System.out.print("Carrier ");
        String carrier1 = scanner.nextLine();

        System.out.print("Phone number ");
        String phoneNumber1 = scanner.nextLine();

        System.out.print("Owner ");
        String owner1 = scanner.nextLine();

        cellPhone1.setSerialNumber(serialNumber1);
        cellPhone1.setModel(model1);
        cellPhone1.setCarrier(carrier1);
        cellPhone1.setPhoneNumber(phoneNumber1);
        cellPhone1.setOwner(owner1);

        // Create second phone
        CellPhone cellPhone2 = new CellPhone();
        System.out.print("\nEnter info for Phone 2");
        System.out.print("Serial number ");
        int serialNumber2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Model ");
        String model2 = scanner.nextLine();

        System.out.print("Carrier ");
        String carrier2 = scanner.nextLine();

        System.out.print("Phone number ");
        String phoneNumber2 = scanner.nextLine();

        System.out.print("Owner ");
        String owner2 = scanner.nextLine();

        cellPhone2.setSerialNumber(serialNumber2);
        cellPhone2.setModel(model2);
        cellPhone2.setCarrier(carrier2);
        cellPhone2.setPhoneNumber(phoneNumber2);
        cellPhone2.setOwner(owner2);

        // Display both phones
        System.out.println("\nPhone 1 Info:");
        display(cellPhone1);

        System.out.println("\nPhone 2 Info:");
        display(cellPhone2);

        // Phone 1 dials phone 2
        System.out.println("\nDialing");
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        // Phone 2 dials phone 1
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();
    }


    public static void display(CellPhone phone) {
        System.out.println("Serial Number " + phone.getSerialNumber());
        System.out.println("Model " + phone.getModel());
        System.out.println("Carrier " + phone.getCarrier());
        System.out.println("Phone Number " + phone.getPhoneNumber());
        System.out.println("Owner " + phone.getOwner());
    }
}