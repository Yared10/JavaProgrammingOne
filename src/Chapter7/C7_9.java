package Chapter7;

import java.util.*;

/**
 * Program asks the user to enter ten numbers and the program will display the
 * minimum number
 *
 * @author Jared Sachs
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        Arrays.sort(array);
        System.out.print("the minimun number is: " + array[0] + ".");
    }
}
