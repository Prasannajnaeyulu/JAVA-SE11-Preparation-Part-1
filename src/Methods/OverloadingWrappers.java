package Methods;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: Overload out of the ordinary
*/

// The Calculator class demonstrates overloading
// static methods.  Each method prints a unique message so we can
// understand which method was picked by the JVM
class Calculator {
    public static long add(int a, Double f) {
        System.out.println("int + Double");
        long result = (long) (a + f);
        return result;
    }

    public static long add(int a, long... b) {
        System.out.println("int a, Var args long b");
        int total = a;
        for (long val : b) {
            total += val;
        }
        return total;
    }

    public static long add(long... a) {
        System.out.println("Var args long a");

        int total = 0;
        for (long val : a) {
            total += val;
        }
        return total;
    }
    // Interesting: int will not match to a wrapper Long. But it will match to long primitive
    public static long add(int a, Long b) {
        System.out.println("int + Long");
        return a + b;
    }
}

public class OverloadingWrappers {
    public static void main(String[] args) {

        // Testing Calculator with multiple primitive data types
        // it prints
        //int a, Var args long b
        //result = 3
        //int a, Var args long b
        //result = 6
        //int + Long
        //result = 11
        //int + Double
        //result = 13
        var result = Calculator.add(1, 2); // it matches add(int a, long... b)
        System.out.println("result = " + result);

        result = Calculator.add(1, 2, 3); // it matches add(int a, long... b)
        System.out.println("result = " + result);

        result = Calculator.add(1, 10L); // it matches add(int a, Long b)
        System.out.println("result = " + result);

        result = Calculator.add(1, 12.3); // it matches add(int a, Double b)
        System.out.println("result = " + result);

        // compiler error: required float found java.lang.Double
        //Double d = 12.45f;
        // But It is OK you can't assign to wrapper but you can assign to primitive
        double d = 12.45f;

        // compiler error: cannot resolve method add(int, float)
        // float can't be matched with wrapper java.lang.Double hence add(int, Double) is not picked here
//        result = Calculator.add(1, 1.2f);
    }
}