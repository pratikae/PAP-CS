import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Problem 1
        System.out.print("Enter an integer >>> ");
        int n = console.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print("salsa ");
            i++;
        }
        System.out.println();
        System.out.println();

        // Problem 2
        System.out.print("Enter an integer >>> ");
        n = console.nextInt();
        i = 1;
        while (i <= n) {
            int j = 0;
            while (j < n) {
                System.out.print("salsa ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        // Problem 3
        boolean messageAgain = true;
        String answer;
        while (messageAgain) {
            System.out.print("Want to see this message again? (true or false) >>> ");
            answer = console.next();
            if (answer.equals("true")) {
                messageAgain = true;
            }
            else {
                messageAgain = false;
            }
        }
        System.out.println("Very well.  I was getting bored with this anyway.");
        System.out.println();

        // Problem 4
        System.out.print("Enter first integer (or 0 to quit) >>> ");
        int num = console.nextInt();
        if (num == 0) {
            System.out.print("No integers entered. Thanks for nothing, skrub.");
        } else {
            int sum = num;
            while (num != 0) {
                System.out.print("Enter another integer (or 0 to quit) >>> ");
                num = console.nextInt();
                sum += num;
            }
            System.out.println("Sum of integers >>> " + sum);
        }
        System.out.println();

        // Problem 5- Jo is 8

        // Problem 6
        double potency = 100.0;
        int month = 0;
        while (potency >= 50.0) {
            System.out.println("Month " + month + ":\tPotency: " + potency);
            potency *= 1.0 - 0.07;
            month++;
        }

        System.out.println("Month " + month + ":\tPotency: " + potency + " <<< DISCARD");




    }
}
