package com.example;

import java.util.Scanner;

public class App {

    public static double calculateBill(String plan, double dataUsage) {

        double basePrice;
        double dataLimit;
        double extraRate;

        switch (plan.toLowerCase()) {

            case "basic":
                basePrice = 300;
                dataLimit = 10;
                extraRate = 20;
                break;

            case "standard":
                basePrice = 500;
                dataLimit = 25;
                extraRate = 15;
                break;

            case "premium":
                basePrice = 800;
                dataLimit = 50;
                extraRate = 10;
                break;

            default:
                throw new IllegalArgumentException("Invalid plan");
        }

        double bill = basePrice;

        if (dataUsage > dataLimit) {
            double extraData = dataUsage - dataLimit;
            bill += extraData * extraRate;
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        System.out.print("Enter data usage in GB: ");
        double dataUsage = sc.nextDouble();

        double bill = calculateBill(plan, dataUsage);

        System.out.println("\n----- INTERNET DATA BILL -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Plan          : " + plan);
        System.out.println("Data Usage    : " + dataUsage + " GB");
        System.out.println("Monthly Bill  : Rs. " + bill);

        sc.close();
    }
}
