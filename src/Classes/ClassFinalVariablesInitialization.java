package Classes;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Final Fields
*/

class Constants {
    // Final static class variables are considered constants.
    // There is one reference to them (static)
    // they cannot be altered (final)
    final static String ONE = "final static field ONE = one";
    final static String TWO = "final static field TWO = two";

    // Compile error if static intitializer removed
    final static String THREE;

    static {
        THREE = "final static field THREE = three";
    }

}

public class ClassFinalVariablesInitialization {

    // You can create final instance variables that are not static.
    // final Instance variables must be initialized along with the declaration or in non-static block or in constructor
    // final Class variables (static variables) must be initialized along with the declaration or in a static block

    // class variable str initializing in static block Otherwise it results in a compiler error
    static {
        str = "hello";
    }
    final String FOUR;
    final static String str;

    // initializer sets final field four
    {
        FOUR = "final field FOUR = four";
        // If we uncomment the following line here then FIVE gets initialized here. So line#51 and line#57 results in compiler errors
        // because final variable might already have been assigned
//        FIVE = "final field FIVE =  five";
    }

    final String FIVE;

    // constructor sets final field five
    // instance variable FIVE initializing in constructor; Otherwise it results in a compiler error
    ClassFinalVariablesInitialization() {
        FIVE = "final field FIVE =  five";
    }

    // new constructor takes an argument
    // instance variable FIVE initializing in constructor; Otherwise it results in a compiler error
    ClassFinalVariablesInitialization(String value) {
        FIVE = "final field FIVE =  " +value;
    }

    public static void main(String[] args) {

        // Access and print the constants.
        System.out.println(Constants.ONE);
        System.out.println(Constants.TWO);
        System.out.println(Constants.THREE);

        System.out.println((new ClassFinalVariablesInitialization()));

        System.out.println("----------------------------");
        System.out.println((new ClassFinalVariablesInitialization("six")));
    }

    public String toString() {
        return FOUR + "\n" + FIVE;
    }
}