package Chapter7;

import java.util.*;

/**
 * Program asks the a set of number for 2 arrays and then the program will check
 * if the arrays are identical or not.
 *
 * @author Jared Sachs
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a set of numbers for the first array: ");
        int[] array1 = new int[input.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("enter another set of numbers for the second array: ");
        int[] array2 = new int[input.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }
        equals(array1, array2);

    }

    /**
     * Method to check if the arrays are identical
     *
     * @param array1 holds the first array
     * @param array2 holds the second arrray
     * @return true if the string is identical or returns fals if not identical
     */
    public static boolean equals(int[] array1, int[] array2) {
        if (java.util.Arrays.equals(array1, array2)) {
            System.out.println("the two list are strictly identical");
            return true;
        } else {
            System.out.println("the two lines are not identical");
            return false;
        }

    }
}
