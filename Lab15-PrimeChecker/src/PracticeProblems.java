import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Problem 1
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        // Problem 2
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 3
        for (int i = 2; i < 21; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 4
        for (int i = 20; i < 26; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 5
        for (int i = 20; i < 91; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 6- half

        // Problem 7
        for (int i = 0; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 8
        System.out.println();
        System.out.print("Enter an integer >>> ");
        int num = console.nextInt();
        for (int i = 0; i != num; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Problem 9
        System.out.println();
        int i = 1;
        for (int j = 3; i < 101; j += 2) {
            System.out.print(i + " ");
            i += j;
        }
        System.out.println();

        // Problem 10
        for (i = 1; i < 17; i++) {
            if (i % 3 == 0) {
                System.out.print("? ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Problem 11
        System.out.println();
        System.out.print("Enter an integer from 1 to 9 >>> ");
        int j = 1;
        int n = console.nextInt();
        for(i = 1; i <= n; i++){
            j = j * i;
        }
        System.out.println(n +"! is " + j);


    }
}
