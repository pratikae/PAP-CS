import java.util.*;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int checkAgain;
        do {
            System.out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
            checkAgain = console.nextInt();
            if (checkAgain == 1) {
                System.out.print("Please enter an integer to check >>> ");
                int n = console.nextInt();
                if (isPrime(n)) {
                    System.out.println(n + " is a prime number");
                } else {
                    System.out.println(n + " is NOT a prime number");
                }
                System.out.println();
            }
        } while (checkAgain != 2);
        System.out.println("Goodbye");
    }

    static int abs(int n) {
        if (n >= 0) {
            return n;
        }
        return -n;
    }

    static boolean isPrime(int n) {
        n = abs(n);
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        long l = n;

        for (long i = 3; i * i <= l; i += 2) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}
