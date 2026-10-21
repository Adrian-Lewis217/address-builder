package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // User full name
        System.out.print("Enter your full name: ");
        String fullName = userInput.nextLine();

        // Values for address for billing
        System.out.print("Enter your billing street: ");
        String billStreet = userInput.nextLine();
        System.out.print("Enter your billing city: ");
        String billCity = userInput.nextLine();
        System.out.print("Enter your billing state: ");
        String billState = userInput.nextLine();
        System.out.print("Enter your billing zip: ");
        String billZip = userInput.nextLine();
        System.out.println();

        // Values for address for shipping
        System.out.print("Enter your shipping street: ");
        String shipStreet = userInput.nextLine();
        System.out.print("Enter your shipping city: ");
        String shipCity = userInput.nextLine();
        System.out.print("Enter your shipping state: ");
        String shipState = userInput.nextLine();
        System.out.print("Enter your shipping zip: ");
        String shipZip = userInput.nextLine();
        System.out.println();

        // The StringBuilder
        StringBuilder addressString = new StringBuilder();
        addressString.append(billCity).append("\n");
        addressString.append(billState).append("\n");
        addressString.append(billStreet).append("\n");
        addressString.append(billZip).append("\n");
        addressString.append(shipCity).append("\n");
        addressString.append(shipState).append("\n");
        addressString.append(shipStreet).append("\n");
        addressString.append(shipZip).append("\n");

        System.out.println(addressString);
    }
}
