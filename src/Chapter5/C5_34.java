package Chapter5;

import java.util.Scanner;

/**
 * Program runs a rock, paper, scissors simulation
 *
 * @author Danny Shackford
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerwins = 0;
        int humanwins = 0;
        do {
            int computer = (int) (Math.random() * 2);
            System.out.print("Enter your pick (scissor is 0, rock is 1, paper is 2): ");
            int human = (input.nextInt());
            if (human > 2) {
                System.out.println("Invalid input\n");
                continue;
            }
            if (computer == 0) {
                System.out.print("The computer is scissor. ");
            } else if (computer == 1) {
                System.out.print("The computer is rock. ");
            } else {
                System.out.print("The computer is paper. ");
            }
            if (human == 0) {
                System.out.print("You are scissor");
            } else if (human == 1) {
                System.out.print("You are rock");
            } else {
                System.out.print("You are paper");
            }
            if (computer == human) {
                System.out.println(" too. It is a draw.\n");
            } else {
                System.out.print(". ");
                if ((computer == 0 && human == 1) || (computer == 1 && human == 2) || (computer == 2 && human == 0)) {
                    System.out.println("You won.\n");
                    humanwins++;
                } else {
                    System.out.println("The computer won.\n");
                    computerwins++;
                }
            }
        } while ((computerwins <= 2) && (humanwins <= 2));
        if (computerwins > 2) {
            System.out.println("The computer wins.");
        }
        if (humanwins > 2) {
            System.out.println("You won.");
        }
    }
}
