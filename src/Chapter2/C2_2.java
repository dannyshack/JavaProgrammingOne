package Chapter2;

import java.util.Scanner;

/**
 * Program gives area and volume of a cylinder
 *
 * @author Danny Shackford
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("length of the cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * pi;
        System.out.println("area of the cylinder: " + area);
        System.out.println("volume of the cylinder: " + area * length);
    }
}
