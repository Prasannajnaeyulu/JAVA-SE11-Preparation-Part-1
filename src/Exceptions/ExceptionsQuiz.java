package Exceptions;


public class ExceptionsQuiz {
    public static void main(String[] args) {
        int i;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {
        } finally {
            // compiler error: uninitialized local variable 'i'
            // Variable 'i' might not have been initialized
            // try catch acts like an if/else. 'i' would end up be a partial initialization
//            System.out.println("i = " + i);
        }
    }
}

/*
Which of the following are checked exceptions.  Pick all that apply

A. Any class that extends RuntimeException

B. ArithmeticException

C. NullPointerException

D. A custom exception that extends the Throwable class

E. CastClassException

F. All of the above

G. None of the above.

Answer: D
Correct Answer. A checked exception is one the compiler 'checks' for and forces the developer to either handle the
exception or declare it in the enclosing method. A custom class that extends the Throwable class is a checked exception,
as well as any class that extends Exception but is NOT part of the RuntimeException branch.
 */
