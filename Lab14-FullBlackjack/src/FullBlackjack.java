import java.util.*;
public class FullBlackjack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Pratika's casino! Let's play blackjack!");
        System.out.println();
        boolean playAgain = true;
        Random randomGen = new Random();
        int cardValue = randomGen.nextInt(10) + 2;
        do {
            // Deal Cards
            int playerTotal = 0;
            System.out.println("You are dealt a " + cardValue);
            playerTotal += cardValue;
            cardValue = randomGen.nextInt(10) + 2;
            System.out.println("You are dealt a " + cardValue);
            playerTotal += cardValue;
            cardValue = randomGen.nextInt(10) + 2;
            int dealerTotal = cardValue;
            cardValue = randomGen.nextInt(10) + 2;
            dealerTotal += cardValue;

            // Player takes their turn
            System.out.println("The dealer is also dealt 2 cards, but you can't see them.");
            System.out.println("Your hand total >>> " + playerTotal);
            int hitOrStand;
            do {
                System.out.print("Would you like to (1)Hit or (2)Stand? ");
                hitOrStand = console.nextInt();
                System.out.println();
                if (hitOrStand == 1) {
                    cardValue = randomGen.nextInt(10) + 2;
                    playerTotal += cardValue;
                    System.out.println("Your are dealt a " + cardValue);
                    System.out.println("Your new hand value >>> " + playerTotal);
                    System.out.println();
                }
            } while (playerTotal <= 21 && hitOrStand == 1) ;
            // Dealer takes its turn
            if (dealerTotal <= 21) {
                do {
                    System.out.println("Dealer shows >>> " + dealerTotal);
                    cardValue = randomGen.nextInt(10) + 2;
                    System.out.println("Dealer draws a " + cardValue);
                    dealerTotal += cardValue;
                    System.out.println("New dealer total >>> " + dealerTotal);
                    System.out.println();
                    if (dealerTotal <= 14) {
                        cardValue = randomGen.nextInt(10) + 2;
                        dealerTotal += cardValue;
                        System.out.println("Dealer draws a  " + cardValue);
                        System.out.println("New dealer value >>> " + dealerTotal);
                        System.out.println();
                    }
                } while (dealerTotal <= 14);
            }
            // Results
            System.out.println("Results :\nYour hand total >>> " + playerTotal + "\nDealer hand total >>> " + dealerTotal);
            if (playerTotal > 21 && dealerTotal > 21) {
                System.out.println("Player and dealer busted. Tie.");
            } else if (playerTotal > 21 && dealerTotal <= 21) {
                System.out.println("Player busted. Dealer wins.");
            } else if (playerTotal <= 21 && dealerTotal > 21) {
                System.out.println("Dealer busted. Player wins.");
            } else if (21 - playerTotal < 21 - dealerTotal) {
                System.out.println("Player wins");
            } else if (21 - playerTotal > 21 - dealerTotal) {
                System.out.println("Dealer wins.");
            } else if (playerTotal == dealerTotal) {
                System.out.println("Tie.");
            }
            System.out.print("Play again? (1)Yes or (2)No? ");
            int playAgainAnswer = console.nextInt();
            if (playAgainAnswer == 1) {
                playAgain = true;
            } else if (playAgainAnswer == 2) {
                playAgain = false;
            }
            System.out.println();
        } while (playAgain);

        System.out.println("Goodbye. Thank you for play at Pratika's casino.");
    }
}
