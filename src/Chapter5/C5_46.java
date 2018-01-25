package Chapter5;

import java.util.Scanner;

/**
 * Program reverses a string
 *
 * @author Danny Shackford
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));
    }
}
