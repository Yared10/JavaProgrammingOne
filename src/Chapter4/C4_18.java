package Chapter4;

import java.util.Scanner;

/**
 * Program to let user input a letter and a number and displays what department
 * and year they are in to the console
 *
 * @author Jared Sachs
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter whether you are in computer science, mathematics, or information technology and what year you are in like so, M1: ");
        String a = input.next();
        char b, c;
        b = a.charAt(0);
        c = a.charAt(1);
        if (b == 'M') {
            switch (c) {
                case '1':
                    System.out.println(" you are a mathematics freshman.");
                    break;
                case '2':
                    System.out.println(" you are a mathematics sophomore.");
                    break;
                case '3':
                    System.out.println(" you are a mathematics junior.");
                    break;
                case '4':
                    System.out.println(" you are a mathematics senior.");
                    break;
                default:
                    System.out.println("invalid");
            }
        } else if (b == 'C') {
            switch (c) {
                case '1':
                    System.out.println(" you are a computer science freshman.");
                    break;
                case '2':
                    System.out.println(" you are a computer science sophomore.");
                    break;
                case '3':
                    System.out.println(" you are a computer science junior.");
                    break;
                case '4':
                    System.out.println(" you are a computer science senior.");
                    break;
                default:
                    System.out.println("invalid");
            }
        } else if (b == 'I') {
            switch (c) {
                case '1':
                    System.out.println(" you are a information technology freshman.");
                    break;
                case '2':
                    System.out.println(" you are a information technology sophomore.");
                    break;
                case '3':
                    System.out.println(" you are a information technology junior.");
                    break;
                case '4':
                    System.out.println(" you are a information technology senior.");
                    break;
                default:
                    System.out.println("invalid");
            }
        } else {
            System.out.println("invalid");
        }

    }
}
