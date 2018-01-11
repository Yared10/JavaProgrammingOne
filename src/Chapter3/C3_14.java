package Chapter3;

import java.util.Scanner;

/**
 * Program to let user input a number and display whether it is divisible or not
 * to the console
 *
 * @author Jared Sachs
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.print(" is " + number + " divisble by 5 and 6? true ");
        } else {
            System.out.print(" is " + number + " divisble by 5 and 6? false ");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.print(" is " + number + " divisble by 5 or 6? true ");
        } else {
            System.out.print(" is " + number + " divisble by 5 or 6? false ");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.print(" is " + number + " divisble by 5 or 6 but not both? true");
        } else {
            System.out.print(" is " + number + " divisble by 5 or 6 but not both? false");
        }
    }
}
