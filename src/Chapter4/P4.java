package Chapter4;

import java.util.Scanner;

/**
 * Program to let user input two a names, a number of hours worked, and charge
 * per hour and displays which bidder was better to the console
 *
 * @author Jared Sachs
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your name bidder one: ");
        String bidderone = input.next();
        System.out.println(" now how many hours of work do you require bidder one: ");
        int hoursone = input.nextInt();
        System.out.println(" enter nhow much you charge per hour bidder one: ");
        double onecharge = input.nextDouble();
        System.out.println(" now then, enter your name bidder two: ");
        String biddertwo = input.next();
        System.out.println(" now how many hours of work do you require bidder two: ");
        int hourstwo = input.nextInt();
        System.out.println(" now enter how much you charge per hour bidder two: ");
        double twocharge = input.nextDouble();
        double costone = hoursone * onecharge;
        double costtwo = hourstwo * twocharge;
        if (costone < costtwo) {
            System.out.printf("" + bidderone + "is cheaper with a cost of %.2f", costone);
        } else if (costtwo < costone) {
            System.out.printf("" + biddertwo + "is cheaper with a cost of %.2f", costtwo);
        } else if (costone == costtwo && hoursone < hourstwo) {
            System.out.printf("" + bidderone + "is cheaper with a cost of %.2f, and hours of %d.", costone, hoursone);
        } else if (costone == costtwo && hourstwo < hoursone) {
            System.out.printf("" + biddertwo + "is cheaper with a cost of %.2f, and hours of %d.", costtwo, hourstwo);
        } else if (costone == costtwo && hoursone == hourstwo) {
            // System.out.printf(" welp it seems that " + bidderone + " and " + biddertwo +" have the same bid. you guys had " + hoursone + " for hours %d for cost per hour, and %f.2 ", costone, onecharge);
            System.out.printf("Bidder %s and bidder %s have identitcal bids.", bidderone, biddertwo);
            System.out.printf("\nBidder1 cost %.2f at %d and bidder2 %.2f at %d.", costone, hoursone, costtwo, hourstwo);
            System.out.printf("\nBidder1's cost per hour is %.2f and bidder2's is  %.2f.", onecharge, twocharge);
            System.out.printf("\nBidder1 required hours are %.2f and bidder2 %.2f.", costone, costtwo);
        }
    }
}
