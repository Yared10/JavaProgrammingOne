package Chapter4;

import java.util.Scanner;

/**
 * Program to let user input two different things and displays whether or not
 * the second is from the first string to the console
 *
 * @author Jared Sachs
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter something: ");
        String thing1 = input.next();
        System.out.println(" now enter something else thats shorter: ");
        String thing2 = input.next();
        if (thing1.contains(thing2)) {
            System.out.println(" it has been found that the second thing you enter is in the first thing you enter");
        } else {
            System.out.println("nothing was found");
        }
    }
}
