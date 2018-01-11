package Chapter2;

import java.util.Scanner;

/**
 * Program to let user input a degree and display the degree in celcius and
 * fahrenheit (" "+ celcius + " celsious is " + fahrenheit + " in fahrenheit")
 * to the console
 *
 * @author Jared Sachs
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a degree: ");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;
        System.out.println(" " + celcius + " celsious is " + fahrenheit + "  in fahrenheit");
    }
}
