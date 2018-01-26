package Chapter7;

import java.util.*;

/**
 * Program asks the user how many number they are entering, then it asks what
 * are the number, then the program finds and displays the average and contents
 * of the array
 *
 * @author Jared Sachs
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter how many numbers you are doing: ");
        double[] numbers = new double[input.nextInt()];

        System.out.println("The average is " + method1(numbers, input));
        method2(numbers);

    }

    /**
     * Method asks the user to enter the numbers and then it adds the numbers
     * together and assigns it to sum
     *
     * @param numbers hold the numbers entered
     * @param input its the scanner input
     * @return the sum divided by the number of number.
     */
    public static double method1(double[] numbers, Scanner input) {
        double sum = 0;
        System.out.print("enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        return (sum / numbers.length);
    }

    /**
     * Method prints the contents of the array.
     *
     * @param numbers holds the numbers entered
     */
    public static void method2(double[] numbers) {
        System.out.print("Contents of the array " + Arrays.toString(numbers));
    }
}
