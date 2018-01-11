package Chapter5;

import java.util.Scanner;

/**
 * Program allows user to input a string and the program will print it in
 * reverse
 *
 * @author Jared Sachs
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter something: ");
        String si = input.nextLine();
        System.out.print("The reverse string is " + (new StringBuffer(si).reverse().toString()));
    }
}
