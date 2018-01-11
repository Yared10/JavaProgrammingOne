package Chapter2;

import java.util.Scanner;

/**
 * Program to let user input a subtotal and a gratuity to find the total and the
 * total gratuity and display " The gratuity is $" + actualgratuity +" and the
 * total is $" + total +"."
 *
 * @author Jared Sachs
 */

public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter your subtotal and the gratuity: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double actualgratuity = gratuity / 10;
        double total = actualgratuity + subtotal;
        System.out.print(" The gratuity is $" + actualgratuity + " and the total is $" + total + ".");
    }
}
