package Chapter3;

import java.util.Scanner;

/**
 * Program to let user input a weight and price for two package and display
 * which had the better price to the console
 *
 * @author Jared Sachs
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter a weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print(" enter the weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double package1 = price1 / weight1;
        double package2 = price2 / weight2;
        if (package1 > package2) {
            System.out.print(" package 2 has the better price than package 1");
        }
        if (package1 < package2) {
            System.out.print(" package 1 has the better price than package 2");
        }
        if (package1 == package2) {
            System.out.print(" package 1 is the same price as package 2");
        }
    }
}
