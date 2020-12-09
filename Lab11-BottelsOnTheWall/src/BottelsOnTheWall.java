import java.util.*;

public class BottelsOnTheWall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your age (whole number only) >>> ");

        int age = console.nextInt();
        if (age > 21) {
            System.out.print("Do you prefer beer or Coke (enter 1 for beer, 2 for Coke) >>> ");

            int drink = console.nextInt();
            System.out.println();
            System.out.println();
            if (drink == 1) {
                song("beer");
            } else {
                song("Coke");
            }
        } else {
            song("Coke");
        }

    }

    static void song(String beverage) {
        int bottles = 99;
        while (bottles > 0) {
            if (bottles == 2) {
                System.out.println(bottles + " bottles of " + beverage + " on the wall");
                System.out.println(bottles + " bottles of " + beverage);
                System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottle of " + beverage + " on the wall!");
                System.out.println();
            }
            else if (bottles == 1) {
                System.out.println("1 bottle of " + beverage + " on the wall");
                System.out.println("1 bottle of " + beverage);
                System.out.println("Take one down, pass it around, no more bottles of " + beverage + " on the wall!");
                System.out.println();
            } else {
                System.out.println(bottles + " bottles of " + beverage + " on the wall");
                System.out.println(bottles + " bottles of " + beverage);
                System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of " + beverage + " on the wall!");
            }

            bottles--;
        }
    }
}
