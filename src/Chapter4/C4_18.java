package Chapter4;

import java.util.Scanner;

/**
 * Program says what major and year the student is in based on their input
 *
 * @author Danny Shackford
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two digits: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        if ((b != 'M' && b != 'C' && b != 'I') || (c != '1' && c != '2' && c != '3' && c != '4')) {
            System.out.println("Invalid Input");
        } else {
            switch (b) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Information Technology ");
                    break;
            }
            switch (c) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
                    break;
            }
        }
    }
}
