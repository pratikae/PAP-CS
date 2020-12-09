import java.util.*;

public class HailstoneSeries {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer from 1 to 1000 >>> ");
        int n = console.nextInt();
        System.out.println();
        int steps = 0;
        System.out.println(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
            steps++;
        }
        System.out.println("Series took " + steps + " steps to reach a value of 1");
    }
}
