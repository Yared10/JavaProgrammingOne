package Chapter2;

import java.util.Scanner;

/**
 * Program to let user input a radius and a length to find the area and volume
 * of an object and display " The area is " + area + " and the volume is " +
 * volume +"" to the console
 *
 * @author Jared Sachs
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and the Length: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println(" The area is " + area + " and the volume is " + volume + "");
    }
}
