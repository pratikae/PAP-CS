//Pratika
import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter left tire pressure (as whole num) >>> ");
        int leftPressure = console.nextInt();
        System.out.print("Enter right tire pressure (as whole num) >>> ");
        int rightPressure = console.nextInt();
        if (leftPressure < 36 || rightPressure < 36) {
            System.out.println("Warning! Low tire pressure");
            System.out.println();
        } else
            System.out.println();

        //Problem 2
        System.out.print("Enter new left tire pressure (as whole num) >>> ");
        leftPressure = console.nextInt();
        System.out.print("Enter new right tire pressure (as whole num) >>> ");
        rightPressure = console.nextInt();
        if (rightPressure - leftPressure >= 4 || leftPressure - rightPressure >= 4) {
            System.out.println("Warning! Uneven tire pressure");
            System.out.println();
        } else
            System.out.println();

        //Problem 3- ton

        //Problem 4
        System.out.print("Enter your grade >>> ");
        double grade = console.nextDouble();
        if (grade < 70) {
            System.out.println("Letter grade for " + grade + " >>> F");
            System.out.println();
        } else {
            if (grade >= 90) {
                System.out.println("Letter grade for " + grade + " >>> A");
                System.out.println();
            }
            if (grade >= 80 && grade <= 89) {
                System.out.println("Letter grade for " + grade + " >>> B");
                System.out.println();
            }
            if (grade <= 79 && grade >= 70) {
                System.out.println("Letter grade for " + grade + " >>> C");
                System.out.println();
            }
        }

        //Problem 5
        System.out.print("Enter a whole number to round >>> ");
        int num = console.nextInt();
        int ones = num % 10;
        num = (num / 10) * 10;
        if (ones >= 5) {
            num += 10;
        }
        System.out.print("Rounded to nearest 10 >>> " + num);



    }
}
