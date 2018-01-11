package Chapter4;

import java.util.Scanner;

/**
 * Program to let user input a name, a number of hours worked, hourly pay rate,
 * federal tax without rate, and state tax without rate and displays a payroll
 * statement to the console
 *
 * @author Jared Sachs
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter your name: ");
        String name = input.next();
        System.out.println(" now enter the number of hours you work in a week: ");
        double hours = input.nextDouble();
        System.out.println(" next, enter your hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.println(" then enter your federal tax without the rate: ");
        double federalrate = input.nextDouble();
        System.out.println(" finally enter your state tax without the rate: ");
        double staterate = input.nextDouble();
        double grosspay = payrate * 10;
        double truefederalrate = federalrate * 100;
        double truestaterate = staterate * 100;
        double federaltotal = federalrate * grosspay;
        double statetotal = staterate * grosspay;
        double totaldeduction = federaltotal + statetotal;
        double netpay = grosspay - totaldeduction;
        System.out.printf(" employee name: %s\n", name);
        System.out.printf(" hours worked: %.2f\n", hours);
        System.out.printf(" pay rate: $%.2f\n", payrate);
        System.out.printf(" gross pay: $%.2f\n", grosspay);
        System.out.printf(" Deduction: \n");
        System.out.printf("\tfederal withholding (%.2f%%): $%.2f\n", truefederalrate, federaltotal);
        System.out.printf("\tstate withholding (%.2f%%): $%.2f\n", truestaterate, statetotal);
        System.out.printf("\ttotal deduction: " + " $%.2f\n", totaldeduction);
        System.out.printf(" Net pay: $%.2f\n", netpay);

    }
}
