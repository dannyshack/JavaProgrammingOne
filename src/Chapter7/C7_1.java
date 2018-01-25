package Chapter7;

import java.util.Scanner;

/**
 * Program gives grades to students
 *
 * @author Danny Shackford
 */
public class C7_1 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        System.out.print("Enter "+students+" scores: ");
        double[] scores = new double[students];
        for(int i = 0; i < scores.length; i++)
            scores[i] = input.nextDouble();
        double best = scores[0];
        for(int j = 0; j < scores.length; j++){
            if(scores[j] > best)
                best = scores[j];
        }
        for(int k = 0; k < scores.length; k++)
            System.out.println("Student "+k+" score is "+scores[k]+" and grade is "+grade(scores, best, k));
    }
    /**
     * Method calculates grades
     *
     * @param scores list of all scores
     * @param best highest score
     * @param k student number
     * @return letter grade
     */
    public static char grade(double scores[], double best, int k) {
        if(scores[k] >= (best - 10))
            return 'A';
        else if(scores[k] >= (best - 20))
            return 'B';
        else if(scores[k] >= (best - 30))
            return 'C';
        else if(scores[k] >= (best - 40))
            return 'D';
        else
            return 'F';
    }
}
