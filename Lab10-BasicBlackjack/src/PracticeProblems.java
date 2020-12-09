//Pratika
import java.util.*;
public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        //Problem 1
        System.out.print("Enter a value for num1 >>> ");
        double num1 = console.nextDouble();
        System.out.print("Enter a value for num2 >>> ");
        double num2 = console.nextDouble();

        //Problem 2
        boolean numsAreSame = (num1 == num2);

        //Problem 3
        System.out.println("num1 and num2 ar they same? >>> " + numsAreSame);
        System.out.println();

        //Problem 4
        System.out.print("Enter total bill amount >>> ");
        double totalBill = console.nextDouble();
        boolean discount10 = (totalBill >= 1000 && totalBill <= 1999);
        boolean discount15 = (totalBill >= 2000);
        if (discount10 && !discount15) {
            double discount10Amount = (totalBill * .10);
            totalBill = (totalBill - discount10Amount);
            System.out.println("10% discount >>> " + discount10Amount);
        } else if (discount15) {
            double discount15Amount = (totalBill * .15);
            totalBill = (totalBill - discount15Amount);
            System.out.println("15% discount >>> " + discount15Amount);
        } else {
            System.out.println("No discount");
            totalBill = totalBill;
        }
        System.out.println("New total after coupon (if applicable) >>> $" + totalBill);
        System.out.println();

        //Problem 5
        System.out.print("Costumer has a coupon? (Enter true or false) >>> ");
        boolean hasCoupon = console.nextBoolean();
        double coupon;
        if (hasCoupon) {
            totalBill = totalBill - (totalBill * .05);
            System.out.println("Coupon discount >>> $" + (totalBill * .05));
            System.out.println("New total after coupon (if applicable) >>> $" + totalBill);
        } else {
            System.out.println("Coupon discount >>> $0.00");
            System.out.println("New total after coupon (if applicable) >>> $" + totalBill);
        }


        //Problem 6- a cold?
    }
}
