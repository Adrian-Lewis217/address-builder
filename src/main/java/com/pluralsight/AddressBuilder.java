package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        // User full name
        System.out.print("Full name: ");
        String fullName = userInput.nextLine();

        // Values for address for billing
        System.out.print("Billing street: ");
        String billStreet = userInput.nextLine();
        System.out.print("Billing city: ");
        String billCity = userInput.nextLine();
        System.out.print("Billing state: ");
        String billState = userInput.nextLine();
        System.out.print("Billing zip: ");
        String billZip = userInput.nextLine();
        System.out.println();

        // Values for address for shipping
        System.out.print("Shipping street: ");
        String shipStreet = userInput.nextLine();
        System.out.print("Shipping city: ");
        String shipCity = userInput.nextLine();
        System.out.print("Shipping state: ");
        String shipState = userInput.nextLine();
        System.out.print("Shipping zip: ");
        String shipZip = userInput.nextLine();
        System.out.println();

        // The StringBuilder
        StringBuilder addressString = new StringBuilder();
        addressString.append(fullName).append("\n\n");

        addressString.append("Billing Address:\n");
        addressString.append(billStreet).append("\n");
        addressString.append(billCity).append(",");
        addressString.append(billState).append(" ");
        addressString.append(billZip).append("\n\n");

        addressString.append("Shipping Address:\n");
        addressString.append(shipStreet).append("\n");
        addressString.append(shipCity).append(",");
        addressString.append(shipState).append(" ");
        addressString.append(shipZip).append("\n");

        String addressBuilderString = addressString.toString();

        System.out.println(addressBuilderString);

        userInput.close();
    }
}
