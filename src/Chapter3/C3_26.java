package Chapter3;

import java.util.Scanner;

/**
 * Program to let user input a heads or tails and display whether they won or
 * not to the console
 *
 * @author Jared Sachs
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 2);
        System.out.print("choose heads or tails by entering a 0 for heads or a 1 for tails: ");
        int fakenews = input.nextInt();
        if (fakenews == number1) {
            System.out.print("you win");
        } else {
            System.out.print("you lose");
        }
    }
}
