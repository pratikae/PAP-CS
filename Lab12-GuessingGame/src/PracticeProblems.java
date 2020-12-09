import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter an integer >>> ");
        int n = console.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        //Problem 2
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();
        int sum = 0;
        i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of all numbers from 1 to " + n + " >>> " + sum);
        System.out.println();

        //Problem 3
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();
        sum = 0;
        i = 2;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of all even numbers from 1 to 56 >>> " + sum);
        System.out.println();

        //Problem 4- normal...

        //Problem 5
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();
        sum = 0;
        i = 7;
        while (i <= n) {
            sum += i;
            i += 7;
        }
        System.out.println("Sum of all multiples of 7 from 1 to 56 >>> " + sum);
        System.out.println();

    }
}
