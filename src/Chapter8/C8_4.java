package Chapter8;

import java.util.*;

/**
 * Program displays the number of hours for the week and their totals for eight
 * workers and displays who worked the most from greatest to least.
 *
 * @author Jared Sachs
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //numbers and totals
        String days[] = {"Su", "M", "T", "Th", "F", "Sa", "total"};
        int[][] numbers = {
            {2, 4, 3, 4, 5, 8, 8, 34},
            {7, 3, 4, 3, 3, 4, 4, 28},
            {3, 3, 4, 3, 3, 2, 2, 20},
            {9, 3, 4, 7, 3, 4, 1, 31},
            {3, 5, 4, 3, 6, 3, 8, 32},
            {3, 4, 4, 6, 3, 4, 4, 28},
            {3, 7, 4, 8, 3, 8, 4, 37},
            {6, 3, 5, 9, 2, 7, 9, 41}};

        System.out.println("            Su   M   T   W   Th   F   Sa  Total");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Employee " + i + "   ");
            for (int column = 0; column < numbers[i].length; column++) {
                System.out.print(numbers[i][column] + "   ");

            }
            System.out.println();
        }
        //System.out.println(numbers);
    }
}
