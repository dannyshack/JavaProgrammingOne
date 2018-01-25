package Chapter3;

import java.util.Scanner;

/**
 * Program tells facts about 2 numbers entered by user
 *
 * @author Danny Shackford
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        if (first < second) {
            System.out.println("The first number is less than the second");
        }
        if (first > second) {
            System.out.println("The first number is greater than the second");
        }
        if (first == second) {
            System.out.println("The first number is equal to the second");
        }
        if (first <= second) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (first != second) {
            System.out.println("The first number is not equal to the second");
        }
        if (second == 0) {
            System.out.println("Cannot divide by zero");
        } else if (first / second < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");
        } else if (first >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (second >= 1 && second <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
