package Chapter6;

import java.util.Scanner;

/**
 * Program allows user to input a password and the program will print whether
 * the password is valid or not
 *
 * @author Jared Sachs
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter a password that is only letters and number and that it has at least 8 letters and it must have 2 digits:");
        String password = input.next();
        password1(password);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param password to see if password is valid
     */
    public static void password1(String password) {

        int counter = 0;

        // Check the length of the password
        if (password.length() < 8) {
            System.out.println("invalid");
            System.exit(0);
        }
        // Check that the password has no illegal characters
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("invalid");
                System.exit(0);
            }
        }
        // Check that the password has atleast 2 digits      
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            System.out.println("invalid");
            System.exit(0);
        }
        System.out.println("valid");

    }

}
