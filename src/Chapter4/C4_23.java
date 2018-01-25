package Chapter4;

import java.util.Scanner;

/**
 * Program computes the net pay
 *
 * @author Danny Shackford
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter empoyee's name: ");
        String employee = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: $");
        double hourly = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();
        System.out.println();
        System.out.println("Employee Name: " + employee);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Pay Rate: $%.2f \n", hourly);
        System.out.printf("Gross Pay: $%.2f \n", hours * hourly);
        System.out.println("Deductions:");
        System.out.printf("\t Federal Withholding (%.2f", (federal * 100));
        System.out.print("%");
        System.out.printf("): $%.2f\n", (hours * hourly * federal));
        System.out.printf("\t State Withholding (%.2f", (state * 100));
        System.out.print("%");
        System.out.printf("): $%.2f\n", (hours * hourly * state));
        System.out.printf("\t Total Deduction: $%.2f\n", ((hours * hourly * federal) + (hours * hourly * state)));
        System.out.printf("Net Pay: $%.2f\n", ((hours * hourly) - ((hours * hourly * federal) + (hours * hourly * state))));
    }
}
