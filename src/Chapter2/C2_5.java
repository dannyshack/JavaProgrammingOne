package Chapter2;

import java.util.Scanner;

/**
 * Program calculates a tip
 *
 * @author Danny Shackford
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("gratuity rate: ");
        double gratuityRate = input.nextDouble();
        double gratuity = gratuityRate / 100 * subtotal;
        System.out.println("gratuity: " + gratuity);
        double total = subtotal + gratuity;
        System.out.println("total: " + total);
    }
}
