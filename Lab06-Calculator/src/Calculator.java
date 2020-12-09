//Pratika
import java.util.*;

public class Calculator {
    public static void main(String[] args){

        //Problem 1
        Scanner console = new Scanner(System.in);
        System.out.println("1 – addition (+)");
        System.out.println("2 – subtraction (-)");
        System.out.println("3 – multiplication (*)");
        System.out.println("4 – division (/)");
        System.out.println("5 – modulus (%)");
        System.out.println();
        System.out.print("Choose an operation from the menu >>> ");
        int operation = console.nextInt();

        //Problem 2
        System.out.print("Enter first number >>> ");
        double first = console.nextDouble();
        System.out.print("Enter second number >>> ");
        double second = console.nextDouble();
        if (operation == 1){
            System.out.println(first + " + " + second + " = " + (first + second));
        }
        else if (operation == 2){
            System.out.println(first + " - " + second + " = " + (first - second));
        }
        else if (operation == 3){
            System.out.println(first + " * " + second + " = " + (first * second));
        }
        else if (operation == 4){
            System.out.println(first + " / " + second + " = " + (first / second));
        }
        else{
            System.out.println(first + " % " + second + " = " + (first % second));
        }


    }
}
