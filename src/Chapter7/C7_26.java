package Chapter7;

import java.util.Scanner;

/**
 * Program compares two lists and says if they are identical
 *
 * @author Danny Shackford
 */
public class C7_26 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int list1[] = new int [input.nextInt()];
        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();
        System.out.print("Enter list2: ");
        int list2[] = new int [input.nextInt()];
        for(int i = 0; i < list1.length; i++)
            list2[i] = input.nextInt();
        if(equals(list1, list2) == true)
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");
    }
    
    /**
     * Method compares the two lists
     *
     * @param list1 first list
     * @param list2 second list
     * @return whether they are the same or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if(list1.length == list2.length) {
            for(int i = 0; i < list1.length; i++) {
                if(list1[i] != list2[i])
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}
