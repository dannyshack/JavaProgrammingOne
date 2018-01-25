package Chapter2;

import java.util.Scanner;

/**
 * Program converts Celcius to Fahrenheit
 *
 * @author Danny Shackford
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Celcius: ");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
