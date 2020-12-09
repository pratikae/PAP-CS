import java.util.*;

public class NutsAndBolts {
    private static int prompt(String thing, Scanner console) {
        System.out.print("Number of " + thing + " >>> ");
        return console.nextInt();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bolts = prompt("bolts", console);
        int nuts = prompt("nuts", console);
        int washers = prompt("washers", console);
        System.out.println();


        if (nuts >= bolts && washers >= (bolts * 2)) {
            System.out.println("Order OK!");
        } else {
            if (nuts < bolts) {
                System.out.println("Check order: too few nuts");
            }
            if (washers < (bolts * 2)) {
                System.out.println("Check order: too few washers");
            }
        }

        int cost = (bolts * 5) + (nuts * 3) + washers;
        System.out.println("Total cost (in cents) >>> " + cost);

    }
}
