//Pratika
import java.util.*;

public class PracticeProblems {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter a whole number >>> ");
        int a = console.nextInt();
        if (a == 9){
            System.out.println("Good Number!");
            System.out.println();
        }
        else
            System.out.println();


        //Problem 2
        System.out.print("Enter a whole number >>> ");
        int b = console.nextInt();
        if (b > 100){
            System.out.println("That's a big number");
            System.out.println();
        }
        else
            System.out.println();

        //Problem 3
        System.out.print("Enter a whole number >>> ");
        int c = console.nextInt();
        if (c == 0){
            System.out.print("Binary!");
            System.out.println();
        }
        else if (c == 1){
            System.out.print("Binary!");
            System.out.println();
        }
        else
            System.out.println();

        //Problem 4- 9 Lives of a Cat

        //Problem 5
        System.out.print("Enter a whole number >>> ");
        int d = console.nextInt();
        if (d != 4){
            System.out.println("That's not a 4");
            System.out.println();
        }
        else
            System.out.println();

        //Problem 6
        System.out.print("Enter a number >>> ");
        double e = console.nextDouble();
        if (e > 10){
            System.out.println("big");
            System.out.println();
        }
        else{
            System.out.println("small");
            System.out.println();
        }

        //Problem 7
        System.out.println("Welcome to a random game!");
        System.out.println("Assign stats to your character (max 15 points TOTAL)");
        System.out.print("Enter strength >>> ");
        int s = console.nextInt();
        System.out.print("Enter charm >>> ");
        int ch = console.nextInt();
        System.out.print("Enter a whole number >>> ");
        int m = console.nextInt();
        if (s + ch + m > 15){
            System.out.println("Point limit exceeded!  Default values assigned.");
            s = 5;
            ch = 5;
            m = 5;
            System.out.println("strength = " + s + ", charm = " + ch + ", magic = " + m);
            System.out.println();
        }
        else{
            System.out.println("strength = " + s + ", charm = " + ch + ", magic = " + m);
        }


    }
}
