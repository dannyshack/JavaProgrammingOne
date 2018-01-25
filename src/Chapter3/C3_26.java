package Chapter3;

import java.util.Scanner;

/**
 * Program says if integer entered by user is divisible by 5 and/or/xor 6
 *
 * @author Danny Shackford
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        boolean first = (integer % 5 == 0 && integer % 6 == 0);
        System.out.println("Is " + integer + " divisible by 5 and 6? " + first);
        boolean second = (integer % 5 == 0 || integer % 6 == 0);
        System.out.println("Is " + integer + " divisible by 5 or 6? " + second);
        boolean third = (integer % 5 == 0 ^ integer % 6 == 0);
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + second);
    }
}
