//I is Pratika Eswaran
public class BigMacWalk {
    public static void main(String args[]){
        //Problem 1
        int numBigMacs = 3;
        //Problem 2
        System.out.print("number of calories consumes ---> ");
        System.out.println(numBigMacs * 590);
        System.out.println();
        System.out.print("miles necessary to walk if you wanna burn them all of ---> ");
        System.out.println(numBigMacs * 590 / 94);
        System.out.println();
        //Problem 3
        int friesAndDrinkCals = numBigMacs;
        System.out.print("rip you actually at a big mac meal so calories consumed ---> ");
        System.out.println(numBigMacs * 590 + friesAndDrinkCals * 400);
        System.out.println();
        System.out.print("miles necessary to walk if you wanna burn them all of ---> ");
        System.out.println((numBigMacs * 590 + friesAndDrinkCals * 400) / 94);




    }
}
