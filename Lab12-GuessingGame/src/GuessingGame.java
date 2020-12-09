//generate r
//guesses = 7
//prompt user 1 to 1000
//n = user input
//while n != r
//r - n > 0?
//too low
//guesses - 1

//else r - n < 0?
//too low
//guesses - 1
//^ended up changing while coding because the more i thought about it, the less it made sense^

import javax.naming.PartialResultException;
import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();

        int r = randomGen.nextInt(1000) + 1;
        System.out.println("Let's play a guessing game!\nThe number to guess will be from 1 to 1000\nYou have 7 attempts to guess the number correctly.");
        System.out.println();
        int g = 7;
        int n;

        while (g > 0) {
            System.out.print("Enter your guess (whole number from 1 to 1000) >>> ");
            n = console.nextInt();
            if (n == r) {
                System.out.println("Correct! The number was >>> " + r);
                break;
            } else if (r - n > 0) {
                if (g == 1) {
                    System.out.println("Out of guesses! You lose! Number was >>> " + r);
                    break;
                } else {
                    g -= 1;
                    System.out.println("Too low! Guesses remaining >>> " + g);
                }
            } else {
                if (g == 1) {
                    System.out.println("Out of guesses! You lose! Number was >>> " + r);
                    break;
                } else {
                    g -= 1;
                    System.out.println("Too high! Guesses remaining >>> " + g);
                }
            }
            System.out.println();
        }

    }
}
