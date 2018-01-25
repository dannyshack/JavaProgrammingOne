package Chapter8;

import java.util.Scanner;

/**
 * Program prints an array
 *
 * @author Danny Shackford
 */
public class C8_4 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\tSu\tM\tT\tW\tTh\tF\tSa\tTotal\n");
        int array[][] =
            {{2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}};
        for(int i = 0; i < array.length; i++) {
            System.out.print("employee "+i+"\t");
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j]+"\t");
            System.out.print(total(array, i)+"\n");
        }
    }
    
    /**
     * Method gets total of each line
     *
     * @param array the array
     * @param i the row
     */
    public static int total(int array[][], int i) {
        int tot = 0;
        for(int j = 0; j < array[i].length; j++)
            tot += array[i][j];
        return tot;
    }
}
