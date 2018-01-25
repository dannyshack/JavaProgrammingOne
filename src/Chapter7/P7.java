package Chapter7;

import java.util.Scanner;

/**
 * Program prints all values entered by user
 *
 * @author Danny Shackford
 */
public class P7 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int numbers = input.nextInt();
        double[] array = new double[numbers];
        System.out.print("Enter "+numbers+" elements: ");
        elements(array);
        System.out.println("The average is "+average(array));
        list(array);
        
    }
    
    /**
     * Method makes the array
     *
     * @param array the array
     */
    public static void elements(double[] array) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();
        
    }
    
    /**
     * Method finds average of all values
     *
     * @param array the array
     * @return the average of all values
     */
    public static double average(double[] array) {
        double total = array[0];
        for(int i = 1; i < array.length; i++)
            total += array[i];
        return (total / array.length);
    }
    
    /**
     * Method prints the array
     *
     * @param array the array
     */
    public static void list(double[] array) {
        System.out.println("Array "+java.util.Arrays.toString(array));
    }    
}
