public class Tester09 extends TestGUI.TestData{ 
    public static void main (String[] args) {        
        new TestGUI();   
    }

    /**
     * Run customized tests of various classes/method and custom build your GUI

     * TO CREATE A HEADER IN THE GUI
     *     void header(String name)
     *   
     *     Example:
     *     header("Histogram");

     * TO CREATE A MESSAGE/NOTE IN THE GUI
     *     void message(String information)
     *     void message(String information, boolean correct)
     *   
     *     Example:
     *     message("This portion of the assignment is optional and for extra credit only."); //default grey color
     *     message("I'm requesting that this method have a green background.", true) //green color
     *     message("I'm requesting that this method have a red background.", false) //red color
     *     

     * TO CREATE A BUTTON FOR LOADING SOURCE CODE / DATA FILES
     *     void srcButton(String sourceFileNamesCommaDelimited)
     *     void srcButton(String[] sourceFileNames)
     *     
     *     Example:
     *     srcButton("PracticeProblems, Data.txt");  //If file has no extension, .java is assumed
     *     srcButton(new String[]{"Car.java", "Truck.java", "DataFile.in"}

     * TO TEST A CONSTRUCTOR AND RECEIVE THE INSTANTIATED OBJECT:
     *     Object makeObject(String className, Object[] args)
     *     Object makeObject(String className, Object[] args, String inputScript)
     *
     *     Parameters:
     *     className - Name of the constructor you are calling
     *     args - arguments you are passing to the constructor.  null can be used if calling a default 
     *            (no parameter) constructor
     *     inputScript - data that will be fed through System.in in the event that the constructor
     *         requests user input
     *      
     *     Returns:
     *     the object constructed from the call
     *      
     *     Example usage:
     *     //Using this...                                              // is similar to using this... 
     *     Object o = makeObject("Person", new Object[]{"Fred", 27});   // Object o = new Person("Fred", 27);
     *     Object o = makeObject("Person", null, "Fred\n27");           // Object o = new Person(); (provides user input)          

     * TO TEST A METHOD  (The testMethod method is very overloaded.  You have several options.)
     *     Object testMethod(Object o,     String mName, Object[] args)
     *     Object testMethod(String cName, String mName, Object[] args)
     *     Object testMethod(Object o,     String mName, Object[] args, String expOut)
     *     Object testMethod(String cName, String mName, Object[] args, String expOut)
     *     Object testMethod(Object o,     String mName, Object[] args, String expOut, String inputScript)
     *     Object testMethod(String cName, String mName, Object[] args, String expOut, String inputScript)
     *   
     *     Parameters:
     *     o - the object invoking the method you want to test (for non-static methods)
     *     cName - name of the class invoking the method you want to test (for static methods)
     *     mName - name of the method being invoked
     *     args - arguments being passing to the method.  null can be used if the method being testing
     *            does not require any parameters.
     *     expOut - the expected output or return value from running the method
     *            If an expOut is provided the GUI will compare this against the actual output/return
     *            value from the test and make a comparison.  Leave this off or pass null if you don't want
     *            to make a red light/green light comparison against the actual output.)
     *     inputScript - data that will be fed through System.in in the event that the method
     *         requests user input
     *   
     *     Returns:
     *     the return value of the method being invoked (as Object)
     *     or null when testing void methods or the student code fails to run/throws exception
     *   
     *     Example usage:
     *     //Using this...                                               // is similar to using this... 
     *     testMethod(myHistogram, "encounter", new Object[]{7});        // myHistogram.encounter(7);
     *     testMethod("Practice", "printXs", new Object[]{4}, "xxxx")    // Practice.printXs(4); 
     *     int s = testMethod(myCar, "getSpeed", null, "55");            // int s = myCar.getSpeed();

     * TO GET A CLASS OBJECT FROM ITS NAME       
     *     Class getClassFromName(String className)
     *     
     *     Example usage:
     *     Class c = getClassFromName("Truck");  
     *     
     *     Note: Why would you want to do this?  This will allow you to collect various information about
     *     how students coded the class, useful for checking how well students understand class design and
     *     inheritance.  You can verify that the Truck class extends the Vehicle class. You can find out 
     *     how many declared fields the student included (vs how many fields were inherited.) Also, this is
     *     your only way to get a version of the Class object that uses the same ClassLoader as the TestGUI
     *     (in the event that you need to try to cast Object o as a student-coded Truck.)  For more info,
     *     read about the Class class here:  https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html 

     * TO SET HOW MANY SECONDS SHOULD BE WAITED BEFORE AN INDIVIDUAL TEST TIMES OUT
     *     setTimeOutSec(int seconds);  //how many seconds to wait before giving up.  (Default 2)
     *   
     */
    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        setTimeOutSec(1);

        srcButton("PracticeProblems, Seasons");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter left tire pressure (as whole num) >>> 36\nEnter right tire pressure (as whole num) >>> 36\n\nEnter new left tire pressure (as whole num) >>> 39\nEnter new right tire pressure (as whole num) >>> 36\n\nEnter your grade >>> 10\nLetter grade for 10.0 >>> F\n\nEnter a whole number to round >>> 124\nRounded to nearest 10 >>> 120",
            "36\n36\n39\n36\n10\n124"
        );
        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter left tire pressure (as whole num) >>> 36\nEnter right tire pressure (as whole num) >>> 35\nWarning! Low tire pressure\n\nEnter new left tire pressure (as whole num) >>> 39\nEnter new right tire pressure (as whole num) >>> 35\nWarning! Uneven tire pressure\n\nEnter your grade >>> 80\nLetter grade for 80.0 >>> B\n\nEnter a whole number to round >>> 555\nRounded to nearest 10 >>> 560",
            "36\n35\n39\n35\n80\n555"
        );
        header("Seasons - Input Data 1");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 2\nEnter day as integer >>> 2\nSeason: Winter",
            "2\n2"
        );
        header("Seasons - Input Data 2");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 12\nEnter day as integer >>> 16\nSeason: Winter",
            "12\n16"
        );
        header("Seasons - Input Data 3");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 9\nEnter day as integer >>> 15\nSeason: Summer",
            "9\n15"
        );
        header("Seasons - Input Data 4");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 9\nEnter day as integer >>> 16\nSeason: Fall",
            "9\n16"
        );        
    }    
}