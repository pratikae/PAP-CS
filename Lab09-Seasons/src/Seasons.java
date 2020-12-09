//Pratika
import java.util.*;
public class Seasons {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter month as integer >>> ");
        int month = console.nextInt();
        System.out.print("Enter day as integer >>> ");
        int day = console.nextInt();

        if (month % 12 <= 3) {
            if (month > 12 || day > 31) {
                System.out.println("Invalid date");
            } else if (month == 12 && day <= 15) {
                System.out.println("Season: Fall");
            } else if (month == 3 && day >= 16) {
                System.out.println("Season: Spring");
            } else {
                System.out.println("Season: Winter");
            }
        } else if (month >= 4 && month <= 6) {
            if (month > 12 || day > 31) {
                System.out.println("Invalid date");
            } else if (month == 6 && day >= 16) {
                System.out.println("Season: Summer");
            } else {
                System.out.println("Season: Spring");
            }
        } else if (month >= 7 && month <= 11) {
            if (month > 12 || day > 31) {
                System.out.println("Invalid date");
            } else if (month == 9 && day <= 15) {
                System.out.println("Season: Summer");
            } else if (month == 8) {
                System.out.println("Season: Summer");
            } else {
                System.out.println("Season: Fall");
            }
        }
        if (month > 12 || day > 31) {
            System.out.println("Invalid date");
        }

    }
}
