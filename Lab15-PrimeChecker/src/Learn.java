import java.util.*;
public class Learn {
    static int memo[];
    public static void main(String[] args) {
        int numNums = 100000000;
        int[] nums = new int[numNums];
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
        }

        Arrays.sort(nums);
        int numSearch = 100;
        int[] search = new int[numSearch];
        for (int i = 0; i < numSearch; i++) {
            search[i] = r.nextInt();
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < numSearch; i++) {
            System.out.println(contains(nums, search[i]));
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < numSearch; i++) {
            System.out.println(betterContains(nums, search[i]));
        }
        System.out.println(System.currentTimeMillis() - start);
        System.exit(0);

//        memo = new int[100];
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println(i + ": " + fib(i));
//        }
//        System.out.println("\t\t\t" + (System.currentTimeMillis() - start));
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < 50; i++) {
//            System.out.println(i + ": " + betterFib(i));
//        }
//        System.out.println("\t\t\t" + (System.currentTimeMillis() - start));
//        System.exit(0);

//        int max = Integer.MAX_VALUE;
//        System.out.println(max);
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(isPrime(max));
//        }
//        long time = System.currentTimeMillis() - start;
//        System.out.println(time);
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(badIsPrime(max));
//        }
//        time = System.currentTimeMillis() - start;
//        System.out.println(time);
//        System.exit(0);


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

    static boolean badIsPrime(int n) {
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

        for (long i = 3; i < l; i += 2) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;


    }

    /**
     * good prime -> O(sqrt n)
     * bad prime -> O(n)
     *
     * n = 5 -> 4 -> 3 -> 2
     *                 -> 1
     *            -> 2
     *       -> 3 -> 2
     *            -> 1
     * n = 4 -> 13 + 5 = 18
     * n = 3 -> 5 + 1 = 6
     * n = 2 -> 1 + 1 = 2
     * fib -> O(3^n)
     *
     *
     *
     * @param n
     * @return
     */

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int downOne;
        int downTwo;
        if (memo[n - 1] != 0) {
            downOne = memo[n-1];
        } else {
            downOne = fib(n -1);
        }

        if (memo[n-2] != 0) {
            downTwo = memo[n - 2];
        } else {
            downTwo = fib(n - 2);
        }

        memo[n] = downOne + downTwo;
        return downOne + downTwo;
    }

    static int betterFib(int n) {
        int f0 = 1;
        int f1 = 1;
        for (int i = 2; i < n; i++) {
            int newFib = f0 + f1;
            f0 = f1;
            f1 = newFib;
        }

        return f1;
    }

    static boolean contains(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }

        return false;
    }

    static boolean betterContains(int[] arr, int n) {
        int hi = arr.length - 1;
        int lo = 0;
        while (true) {
            if (hi - 1 == lo) {
                return arr[lo] == n;
            }

            int mid = lo + (hi - lo) / 2;
            if (n < arr[mid]) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
    }
}
