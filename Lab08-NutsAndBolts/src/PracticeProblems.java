//Pratika

import java.util.*;
public class PracticeProblems{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter a whole number >>> ");
        int apples = console.nextInt();
        if (apples > 0){
            System.out.println("That's positive!");
            System.out.println();
        } else
            System.out.println();

        //Problem 2
        System.out.print("Enter a whole number >>> ");
        apples = console.nextInt();
        if (apples > 0 && (apples % 2 == 0)){
            System.out.println("Omg. It's positive AND even!");
            System.out.println();
        }

        //Problem 3
        else {
            System.out.println("I don't like that number!");
            System.out.println();
        }


        //Problem 4
        System.out.println("Enter your age >>> ");
        int votingAge = 18;
        int actualAge = console.nextInt();
        if(actualAge >= votingAge){
            System.out.println("You can vote");
            System.out.println();
        } else {
            System.out.println("You can't vote");
            System.out.println();
        }

        //Problem 5
        System.out.print("Enter angle #1 >>> ");
        int angle1 = console.nextInt();
        System.out.print("Enter angle #2 >>> ");
        int angle2 = console.nextInt();
        System.out.print("Enter angle #3 >>> ");
        int angle3 = console.nextInt();

        if ((angle1 + angle2 + angle3 == 180) && (angle1 == angle2 && angle1 == angle3)) {
            System.out.println("That's an equilateral triangle.");
        } else if ((angle1 + angle2 + angle3 == 180) && (angle1 != angle2 && angle1 != angle3)) {
            System.out.println("That's a scalene triangle.");
        } else if ((angle1 + angle2 + angle3 == 180) && (angle1 != angle2 && angle1 == angle3) || (angle2 != angle1 && angle2 == angle3) || (angle1 == angle2 && angle1 != angle3)){
            System.out.println("That's an isosceles triangle.");
        } else
            System.out.println("Error");


    }
}



