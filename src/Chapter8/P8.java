package Chapter8;

import java.util.Scanner;

/**
 * Program inserts number of money sold for each employee on each day
 *
 * @author Danny Shackford
 */
public class P8 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double array[][] = new double [4][5];
        char salesman;
        char day;
        char cont;
        boolean salecont;
        boolean daycont;
        do {
            do {
                System.out.print("Enter the salesman ID as \"A\", \"B\", \"C\", or \"D\". ");
                String a = input.next().toUpperCase();
                salesman = a.charAt(0);
                if(salesman == 'A' || salesman == 'B' || salesman == 'C' || salesman == 'D')
                    salecont = true;
                else {
                    salecont = false;
                    System.out.println("Invalid input. Reenter the salesman ID.");
                }
            }while(salecont == false);
            do {
                System.out.print("Enter the day of the week as \"M\", \"T\", \"W\", \"H\", or \"F\". ");
                String b = input.next().toUpperCase();
                day = b.charAt(0);
                if(day == 'M' || day == 'T' || day == 'W' || day == 'H' || day == 'F')
                    daycont = true;
                else {
                    daycont = false;
                    System.out.println("Invalid input. Reenter the day of the week.");
                }
            }while(daycont == false);
            System.out.print("Enter the amount of the sale. ");
            double salePrice = input.nextDouble();
            do {
                System.out.print("More data? Enter \"Y\" for more or \"N\" for stop. ");
                String c = input.next().toUpperCase();
                cont = c.charAt(0);
                if(cont != 'Y' && cont != 'N')
                    System.out.println("Invalid input. Reenter \"Y\" or \"N\"");
            }while(cont != 'Y' && cont != 'N');
            arrayvalue(array, salesman, day, salePrice);
        }while(cont == 'Y');
        System.out.println("\n\n    Salesman\tM\tT\tW\tH\tF");
        char saleguychar = 'A';
        for(int i = 0; i < array.length; i++) {
            System.out.print("\t"+saleguychar+"\t");
            saleguychar++;
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    /**
     * Method assigns amount of money to the day and employee
     *
     * @param array the array
     * @param salesman the employee
     * @param day the day of the week
     * @param salePrice amount of money
     * @return amount of money assigned to place in array based on employee and day
     */
    public static double arrayvalue(double array[][], char salesman, char day, double salePrice) {
        int a = 0;
        int b = 0;
        switch(salesman) {
            case 'A': a = 0; break;
            case 'B': a = 1; break;
            case 'C': a = 2; break;
            case 'D': a = 3; break;
        }
        switch(day) {
            case 'M': b = 0; break;
            case 'T': b = 1; break;
            case 'W': b = 2; break;
            case 'H': b = 3; break;
            case 'F': b = 4; break;
        }
        return (array[a][b] += salePrice);
    }
}
