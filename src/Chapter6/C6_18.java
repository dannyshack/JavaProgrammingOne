package Chapter6;

import java.util.Scanner;

/**
 * Program deems if password is valid
 *
 * @author Danny Shackford
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValid(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Method checks if password is valid or not
     *
     * @param password the string entered by user that gets checked if it's
     * valid
     * @return if password is valid or invalid
     */
    public static boolean isValid(String password) {
        int counter = 0;
        // 8 characters
        if (password.length() < 8) {
            return false;
        }
        // digits and numbers only
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        // atleast 2 digits
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }
        return true;
    }
}
