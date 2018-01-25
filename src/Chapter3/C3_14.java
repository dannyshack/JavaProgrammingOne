package Chapter3;

import java.util.Scanner;

/**
 * Program flips a coin, and says if the user's prediction is correct
 *
 * @author Danny Shackford
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter guess (0 for heads, or 1 for tails):");
        double guess = input.nextDouble();
        int coin = (int) (Math.random() * 2);
        System.out.println(coin);
        if (coin == 0 && guess == 0) {
            System.out.println("correct");
        } else if (coin == 1 && guess == 1) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
