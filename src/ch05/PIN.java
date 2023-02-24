package ch05;

import java.util.Scanner;

/**
 * When you use an automated teller machine (ATM) with your bank card, you need
 * to use a personal identification number (PIN) to access your account. If a
 * user fails more than three times when entering the PIN, the machine will
 * block the card. Assume that the user’s PIN is "1234" and write a program that
 * asks the user for the PIN no more than three times.
 *
 * @bj.project P5.13
 */
public class PIN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter PIN: ");

            if (in.nextInt() == 1234) {
                System.out.println("Your PIN is correct");
                break;
            }

            System.out.println("Your PIN is incorrect");
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Your bank card is blocked");
        }

        in.close();
    }
}
