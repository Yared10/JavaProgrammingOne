package Chapter6;

import java.util.Scanner;

/**
 * Program allows user to input how many euros, pound sterling, and yen a dollar
 * would buy, then the user will input how many dollars they have and the
 * program will print how much money the user would get
 *
 * @author Jared Sachs
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter how much euros a dollar will buy: ");
        double buy1 = input.nextDouble();
        System.out.println(" Enter how much pound sterling a dollar will buy: ");
        double buy2 = input.nextDouble();
        System.out.println(" Enter how much Yen a dollar will buy: ");
        double buy3 = input.nextDouble();
        String answer;

        do {
            System.out.println(" enter how much money in dollars you have : ");
            double dol = input.nextDouble();
            System.out.println(" enter E to change the amount to euros, P to change the amount to pound sterling or Y to change the amount into yen: ");
            String a = input.next();

            char b;
            b = a.charAt(0);
            if (b == 'E') {
                double Euro = Convert(dol, buy1);
                System.out.printf("For %.2f dollars you will get %.2f euros", dol, Euro);
            } else if (b == 'e') {
                double Euro = Convert(dol, buy1);
                System.out.printf("For %.2f dollars you will get %.2f euros", dol, Euro);
            } else if (b == 'P') {
                double Pound = Convert(dol, buy2);
                System.out.printf("For %.2f dollars you will get %.2f yen", dol, Pound);
            } else if (b == 'p') {
                double Pound = Convert(dol, buy2);
                System.out.printf("For %.2f dollars you will get %.2f yen", dol, Pound);
            } else if (b == 'Y') {
                double Yen = Convert(dol, buy3);
                System.out.printf("For %.2f dollars you will get %.2f yen", dol, Yen);
            } else if (b == 'y') {
                double Yen = Convert(dol, buy3);
                System.out.printf("For %.2f dollars you will get %.2f yen", dol, Yen);
            }
            do {
                System.out.println(" do you to continue? enter yes to contiune or no to end the program: ");
                answer = input.next();
            } while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
        } while (!answer.equalsIgnoreCase("no"));
    }

    /**
     * Method to convert currency to dollars
     *
     * @param dol the amount of dollars we are converting
     * @param buy the currency we are converting
     * @return the amount of dollars the currency is equivalent to
     */
    public static double Convert(double dol, double buy) {

        double reduction = 0.95;
        double bigreduction = .9;
        double dolls = 0;
        double total;

        if (dol > 100) {
            dolls = dol * reduction;
            total = dolls * buy;

        } else {
            dolls = dol * bigreduction;
            total = dolls * buy;

        }
        return total;

    }

}
