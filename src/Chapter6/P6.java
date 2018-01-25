package Chapter6;

import java.util.Scanner;

/**
 * Program converts money
 *
 * @author Danny Shackford
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        final double euro = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        final double pound = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        final double yen = input.nextDouble();
        boolean cont = true;
        while (cont == true) {
            System.out.print("Enter the number of dollars you want to convert: $");
            double total = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen: ");
            String a = input.next().toUpperCase();
            char b = a.charAt(0);
            switch (b) {
                case 'E':
                    buy(total, euro);
                    System.out.println("Euros.");
                    break;
                case 'P':
                    buy(total, pound);
                    System.out.println("Pound Sterling.");
                    break;
                case 'Y':
                    buy(total, yen);
                    System.out.println("Yen");
                    break;
            }
            System.out.print("Are there any more conversions to perform? ");
            String c;
            do {
                c = input.next();
                if (c.equalsIgnoreCase("yes")) {
                    cont = true;
                } else if (c.equalsIgnoreCase("no")) {
                    cont = false;
                } else {
                    System.out.print("Enter \"yes\" to continue or \"no\" to stop: ");
                }
            } while (!(c.equalsIgnoreCase("yes")) && !(c.equalsIgnoreCase("no")));
        }
    }

    /**
     * Method does the converting
     *
     * @param total amount of money being converted
     * @param exchangeRate the currency the money is being converted into
     * @return the amount of dollars the currency is converted into
     */
    public static double buy(double total, double exchangeRate) {
        double bought = 0;
        if (total > 100) {
            bought = (.95 * total * exchangeRate);
            System.out.printf("For $%.2f, you will be able to buy %.2f ", total, bought);
        } else {
            bought = (.9 * total * exchangeRate);
            System.out.printf("For $%.2f, you will be able to buy %.2f ", total, bought);
        }
        return bought;
    }
}
