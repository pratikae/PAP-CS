//Pratika
import java.util.*;

public class BasicBlackjack {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        System.out.print("Player 1 enter hand value >>> ");
        int hand1 = console.nextInt();
        System.out.print("Player 2 enter hand value >>> ");
        int hand2 = console.nextInt();

        if (hand1 > 0 && hand2 >0) {
            if (hand1 > 21 && hand2 > 21 ) {
                System.out.println("Bust!");
            } else if (hand1 > 21 && hand2 <= 21) {
                System.out.println("Player 2 wins!");
            } else if (hand1 <= 21 && hand2 > 21) {
                System.out.println("Player 1 wins!");
            } else if (21 - hand1 < 21 - hand2) {
                System.out.println("Player 1 wins!");
            } else if (21 - hand1 > 21 - hand2) {
                System.out.println("Player 2 wins!");
            } else if (hand1 == hand2) {
                System.out.println("Tie!");
            }
        } else {
            System.out.println("You entered bad numbers.");
        }
    }
}
