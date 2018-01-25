package Chapter3;

import java.util.Scanner;

/**
 * Program says which package is cheaper based on weight and price
 *
 * @author Danny Shackford
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("package 1 weight = ");
        double package1Weight = input.nextDouble();
        System.out.print("package 1 price = ");
        double package1Price = input.nextDouble();
        System.out.print("package 2 weight = ");
        double package2Weight = input.nextDouble();
        System.out.print("package 2 price = ");
        double package2Price = input.nextDouble();
        if (package1Weight / package1Price < package2Weight / package2Price) {
            System.out.println("package 1 is cheaper");
        } else if (package1Weight / package1Price > package2Weight / package2Price) {
            System.out.println("package 2 is cheaper");
        } else {
            System.out.println("they're the same price");
        }
    }
}
