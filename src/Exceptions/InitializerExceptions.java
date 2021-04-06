package Exceptions;

import java.io.IOException;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Exceptions, Out of Ordingary
Sub-Topic:  Exceptions in Initializers
*/
class StaticTest {
    public static String currentMessage;

    // Initialized to 0
    public static int currentVal;

    // Static Initializer
    static {
        System.out.println("Initializing class StaticTest");
        try {
            // We force an error for demonstration purposes
            if ((10 / currentVal) > 0) {
                System.out.println("Whoops");
            }
        } catch (Exception e) {
            System.out.println("Caught the error");
            // though we declare main method from where this static initializer being called is declared to catch the exception
            // the code fails to propagate this exception to main method. Because with static initializer, exceptions will not
            // propagate they must be handled in static initializer itself otherwise the code stops here and it throws this exception
            throw new RuntimeException("Some other exception");
        } finally {
            // it always execute even after the runtime exception
            // but the exception thrown in catch block will propagate to calling place after this finally block execution
            System.out.println("Inside finally");
            currentVal = 1;
        }
        currentMessage = "Inside Static Initializer";
    }
}

public class InitializerExceptions {

    // Create a subclass of InitializerExceptions
    class SubClass extends InitializerExceptions {

        SubClass() throws Exception {
            super();  // Note that call to super() is redundant statement
        }

    }

    // Create an instance initializer block that throws a checked exception
//    {
//        int i = 0;
//        // compiler error: unhandled exception but as this exception is thrown in instance block,
//        // if we don't wrap this statement inside try catch here then we've to declare constructor of this class
//        // to throw this exception
//        if (i == 0) throw new IOException("Whoops");
//    }

    //Unhandled exception: java.io.IOException
//    InitializerExceptions() {
//    }

    {
        int i = 0;
        // compiler error: unhandled exception but as this exception is thrown in instance block,
        // if we don't wrap this statement inside try catch here then we've to declare constructor of this class
        // to throw this exception
        if (i == 0) throw new IOException("Whoops");
    }

    // constructs declares to throw IOException which satisfies catch specify requirements of line#70
    // where exception thrown from an instance block
    InitializerExceptions() throws IOException{}

    // Second constructor without a throws clause
//    InitializerExceptions(String parameterOne)  {
//        try {
//
//        } catch (IOException e) {
//            System.out.println("I'm ignoring the error");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Executing main()");
        try {
            System.out.println(StaticTest.currentMessage);
            InitializerExceptions ie = new InitializerExceptions();
        } catch (Exception e) {
            System.out.println("Ignoring the error, " + e.getMessage());
        }

    }
}
