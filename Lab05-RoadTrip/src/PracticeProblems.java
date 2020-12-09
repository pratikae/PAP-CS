//Pratika
import java.util.*;

public class PracticeProblems {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter a whole number >>> ");
        int num1 = console.nextInt();
        console.nextLine();
        System.out.println("Ten more than your number is >>> " + (num1 + 10));
        System.out.println();

        //Problem 2
        System.out.print("What is your name? >>> ");
        String name1 = console.nextLine();
        System.out.println("Hello, " + name1);
        System.out.println();

        //Problem 3
        System.out.print("Enter a number with a decimal >>> ");
        double something = console.nextDouble();
        System.out.println("That number squared is >>> " + (something * something));
        System.out.println();

        //Problem 4- your name

        //Problem 5
        System.out.print("Enter a name >>> ");
        String name2 = console.next();
        System.out.print("Enter an age >>> ");
        int age = console.nextInt();
        console.nextLine();
        System.out.println(name2 + " is " + age + " year" + (age > 1 ? "s" : "") + " old.");
        System.out.println();

        //Problem 6
        System.out.print("Enter the radius of a circle (decimals are allowed) >>> ");
        double radius = console.nextDouble();
        double pi = 3.1415;
        System.out.println("The area of that circle is " + (radius * radius) * pi);
        System.out.println();

        //Problem 7
        System.out.print("Enter the number of seconds of free fall (decimals are allowed) >>> ");
        double time = console.nextDouble();
        console.nextLine();
        double gravityConstant = (32.174 * (time * time)/2);
        System.out.println("Distance traveled (in feet) >>> " + gravityConstant);
        System.out.println();

        //Problem 8
        System.out.print("Who is your favorite person? >>> ");
        name1 = console.next();
        System.out.println(name1 + name1 + name1);
    }
}

