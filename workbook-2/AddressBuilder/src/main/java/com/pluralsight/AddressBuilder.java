package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Billing Street: ");
        String street = scanner.nextLine();


        StringBuilder address = new StringBuilder();


      address.append(fullName);
      address.append("\n\n");

      address.append("Billing Address:\n");
        address.append("");

    }
}
