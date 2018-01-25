package Chapter7;

import java.util.Scanner;

/**
 * Program tells which number is the minimum
 *
 * @author Danny Shackford
 */
public class C7_9 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();
        System.out.println("The minimum number is: "+min(array));
    }
    
    /**
     * Method finds the smallest number
     *
     * @param array the array
     * @return the smallest number
     */
    public static double min(double[] array) {
        double minimum = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minimum)
                minimum = array[i];
        }
        return minimum;
    }
}
