package Chapter4;

import java.util.Scanner;

/**
 * Program compares two companies' cost for a project
 *
 * @author Danny Shackford
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("name of the first bidder: ");
        String first = input.next();
        System.out.print("hours of work the first bidder requires: ");
        int work1 = input.nextInt();
        System.out.print("how much the first bidder charges per hour: $");
        double charge1 = input.nextDouble();
        System.out.println("\n");
        System.out.print("name of the second bidder: ");
        String second = input.next();
        System.out.print("hours of work the second bidder requires: ");
        int work2 = input.nextInt();
        System.out.print("how much the second bidder charges per hour: $");
        double charge2 = input.nextDouble();
        double cost1 = (work1 * charge1);
        double cost2 = (work2 * charge2);
        System.out.println("\n");
        if (cost1 < cost2) {
            System.out.println("winner: " + first);
            System.out.printf("total cost: $%.2f\n", cost1);
        }
        if (cost2 < cost1) {
            System.out.println("winner: " + second);
            System.out.printf("total cost: $%.2f\n", cost2);
        }
        if (cost1 == cost2 && work1 < work2) {
            System.out.println("winner: " + first);
            System.out.printf("total cost: $%.2f\n", cost1);
            System.out.println("number of hours: " + work1);
        }
        if (cost2 == cost1 && work2 < work1) {
            System.out.println("winner: " + second);
            System.out.printf("total cost: $%.2f\n", cost2);
            System.out.println("number of hours: " + work2);
        }
        if (cost1 == cost2 && work1 == work2) {
            System.out.println(first + " and " + second + " have identical bids");
            System.out.println("both of their number of hours: " + (int) work1);
            System.out.printf("both of their cost per hour: $%.2f\n", charge1);
            System.out.printf("both of their total cost: $%.2f\n", cost1);
        }
    }
}
