package Exceptions;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Catch Examples
*/

import java.io.IOException;

class CustomThrowable extends Throwable {
    CustomThrowable(String message) {
        super(message);
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class SuperClass {
    public void methodSuperClass() throws CustomException {

    }
}

class SubClass extends SuperClass {
    public void methodSubClass() {
        try {
            methodSuperClass();
        } catch (Exception CustomException) {
            // ignore it
        }
    }
}
public class CatchExamples {
    public static void main(String[] args) {
        CatchExamples ce = new CatchExamples();

        // Reminder, Throwable or custom subclasses of Throwable and any
        // RuntimeException descendants are checked.

        try {
            SubClass c = new SubClass();
            c.methodSuperClass();
//            ce.testError();

        }
        // interesting: though ArithmeticException is never thrown by any code in corresponding try block, as it is a
        // unchecked exception type (RuntimeException type), you won't get any compiler error
        catch (ArithmeticException e) {
            // interesting: the variable 'e' here can be changed means it is NOT final
            e = new ArithmeticException("This works");
            throw e;
        }
        // Interesting: compiler error: Exception 'java.io.IOException' is never thrown in the corresponding try block
        // Any checked exception if it is not throwing by any of the code in try block then compiler will throw the error
        // this exception is never thrown in corresponding try block
//        catch(IOException e){
//
//        }
        // interesting: compiler error: Types in multi-catch must be disjoint: 'Exceptions.CustomException' is a subclass of 'java.lang.Throwable'
//        catch (CustomException | RuntimeException | Throwable e) {

        catch (CustomException | RuntimeException e) {
            // interesting: the variable 'e' here can't be changed it is final
            // the point to note here is catch block handling multiple exceptions comes with a final variable
            // catch block with only one exception handling is not final
            // compiler error: can't assign value to a final variable 'e'
//            e = new RuntimeException("This works");

            throw new RuntimeException("So many exceptions, so little time");
        }
    }

    private void testError() throws IOException {
        // We'll complete this later
    }
}
