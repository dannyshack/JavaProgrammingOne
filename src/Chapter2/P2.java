package Chapter2;

import java.util.Scanner;

/**
 * Program calculates total price of an order
 *
 * @author Danny Shackford
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("price of meal: ");
        double meal = input.nextDouble();
        System.out.print("price of drink: ");
        double drink = input.nextDouble();
        System.out.print("price of dessert: ");
        double dessert = input.nextDouble();
        double food = meal + drink + dessert;
        System.out.println("price of food: " + food);
        double salesTax = food * .1;
        System.out.println("price of sales tax: " + salesTax);
        double tip = (food + salesTax) * .15;
        System.out.println("price of tip: " + tip);
        double totalCost = food + salesTax + tip;
        System.out.println("total cost: " + totalCost);
    }
}
