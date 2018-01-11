package Chapter5;

import java.util.Scanner;

/**
 * Program allows user to input rock, paper, or scissors, and the program will
 * print whether you won, lost, or tied
 *
 * @author Jared Sachs
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int player = 0;
        int choice = 0;
        int computer = 0;
        int comguess = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("enter 2 for scissors, 1 for paper, or 0 for rock: ");
            choice = input.nextInt();
            comguess = (int) (Math.random() * 3);

            // If computer guesses rock
            if (comguess == 0) {
                switch (choice) {
                    case 0:
                        System.out.println(" you tied, you both chose rock");
                        break;
                    case 1:
                        System.out.println(" you win, the computer chose rock and you chose paper");
                        player += 1;
                        break;
                    case 2:
                        System.out.println(" you lose, the computer chose rock and you chose scissors");
                        computer += 1;
                        break;
                }

            } // If computer guesses paper
            else if (comguess == 1) {
                switch (choice) {
                    case 0:
                        System.out.println(" you lose, the computer chose paper and you chose rock");
                        computer += 1;
                        break;
                    case 1:
                        System.out.println(" you tied, you both chose paper");
                        break;
                    case 2:
                        System.out.println(" you win, the computer chose paper and you chose scissors");
                        player += 1;
                        break;
                }
            } // If computer guesses scissor
            else if (comguess == 2) {
                switch (choice) {
                    case 0:
                        System.out.println(" you win, the computer chose scissors and you chose rock");
                        player += 1;
                        break;
                    case 1:
                        System.out.println(" you lose, the computer chose scissors and you chose paper");
                        computer += 1;
                        break;
                    case 2:
                        System.out.println(" you tied, you both chose scissor");
                        break;
                }

            }
        } while (computer < 3 && player < 3);
    }
}
