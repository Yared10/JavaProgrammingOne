package Chapter8;

import java.util.*;

/**
 * Program asks the user to choose a salesmen, a day, and the amount of sale,
 * then when the user says they are done entering data the program then prints
 * the information.
 *
 * @author Jared Sachs
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] letters = {{"A", "B", "C", "D"}, {"M", "T", "W", "H", "F"}, {"Y", "N"}};
        double[][] name = new double[4][5];
        boolean jews = true;
        while (jews) {
            boolean holo = true;
            boolean ger = true;
            boolean les = true;
            String id = "";
            while (holo) {
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                id = input.next().toUpperCase();
                if (tsring(letters[0], id) == -1) {
                    System.out.println("thats wrong now enter what i told you to enter. ");
                } else {
                    holo = false;
                }
            }
            int idIndex = tsring(letters[0], id);
            String id2;
            while (ger) {
                System.out.println("Enter the day as M, T, W, H, F: ");
                id2 = input.next().toUpperCase();
                if (tsring(letters[1], id2) == -1) {
                    System.out.println("thats wrong now enter what i told you to enter. ");
                } else {
                    int dayIndex = tsring(letters[1], id2);
                    System.out.println("enter the amount of sale: ");
                    double sale = input.nextDouble();
                    name[idIndex][dayIndex] += sale;
                    ger = false;
                }

            }
            System.out.println("more data? Enter Y for more or N to stop: ");
            while (les) {
                String answer = input.next().toUpperCase();
                if (answer.equals("N")) {
                    jews = false;
                    les = false;
                } else if (answer.equals("Y")) {
                    les = false;

                } else {
                    System.out.println("you entered it wrong. now enter what i said to enter.");
                }
            }
        }
        System.out.println(" M   T   W   Th   F");
        for (int i = 0; i < name.length; i++) {
            System.out.print(letters[0][i] + " ");
            for (int column = 0; column < name[i].length; column++) {
                System.out.print(name[i][column] + " ");

            }
            System.out.print("\n");
        }
    }

    /**
     * Method check if the list is equal to the array
     *
     * @param list holds the amount holds the length of the array
     * @param id hold the salesman id
     * @return 1 if true or -1 if false
     */
    public static int tsring(String[] list, String id) {
        for (int i = 0; i < list.length; i++) {
            if (id.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }
}
