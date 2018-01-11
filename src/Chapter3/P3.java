package Chapter3;

import java.util.Scanner;

/**
 * Program to let user inputs two numbers and displays if the numbers are
 * greater, less than, or equal to each other t to the console
 *
 * @author Jared Sachs
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1-100: ");
        int number1 = input.nextInt();
        System.out.print("Etner a second number from 1-100: ");
        int number2 = input.nextInt();
        {
            if (number1 > number2) {
                System.out.println(" the first number is greater thant the second number");
            }
        }
        {
            if (number1 < number2) {
                System.out.println(" the first number is less than the second number");
            }
        }
        {
            if (number1 == number2) {
                System.out.println("the first number is equal to the second number");
            }
        }
        {
            if (number1 != number2) {
                System.out.println("the first number is not equal to the second number");
            }
        }
        {
            if (number1 <= number2) {
                System.out.println("the first number is less than or equal to the second number");
            }
        }
        {
            if (number2 == 0) {
                System.out.println(" cannot divide by zero");
            } else if (number1 / number2 < 1) {
                System.out.println(" proper fraction");
            } else {
                System.out.println("improper fraction");
            }
        }
        {

            if (number1 >= 90.0) {
                System.out.println("A");
            } else if (number1 >= 80.0) {
                System.out.println("B");
            } else if (number1 >= 70.0) {
                System.out.println("C");
            } else if (number1 >= 60.0) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            if (number2 >= 1 && number2 <= 100) {
                System.out.println("in range");
            } else {
                System.out.println("out of range");
            }
        }
    }
}
