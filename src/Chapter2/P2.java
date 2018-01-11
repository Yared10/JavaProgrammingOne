package Chapter2;

import java.util.Scanner;

/**
 * Program to let user input how much the food , drink, dessert cost and display
 * the the total " The price of the food is $" + foodtogether +", the tax is $"
 * + foodandtax +", the tip is $" + foodtip +" and the total is $" + totalcost
 * +". " to the console
 *
 * @author Jared Sachs
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how much your food cost: ");
        double foodcost = input.nextDouble();
        System.out.print(" Enter how much your drink cost: ");
        double drinkcost = input.nextDouble();
        System.out.print(" Enter how much your dessert cost: ");
        double dessertcost = input.nextDouble();
        double tax = 0.10;
        double tip = 0.15;
        double foodtogether = foodcost + drinkcost + dessertcost;
        double foodandtax = foodtogether * tax;
        double foodtip = (foodandtax + foodtogether) * tip;
        double totalcost = foodandtax + foodtip + foodtogether;
        System.out.println(" The price of the food is $" + foodtogether + ", the tax is $" + foodandtax + ", the tip is $" + foodtip + " and the total is $" + totalcost + ". ");
    }
}
