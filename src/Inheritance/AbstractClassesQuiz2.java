package Inheritance;

abstract class AbstractClass1 {
    protected static int counter;  // Line 1
    // compiler error: abstract method can't be declared as static
//    protected static abstract int getCounter();     // Line 2
    // compiler error: abstract method can't be declared as static
//    static abstract void printCounter();  // Line 3

}

public class AbstractClassesQuiz2 extends AbstractClass1 {

    public static void main(String[] args) {
        AbstractClass1.counter++;   // Line 4
        printCounter();
    }

    public static int getCounter() {  // Line 5
        return AbstractClass1.counter; // Line 6
    }

    public static void printCounter() { // Line 7
        System.out.println("Counter = " + getCounter());
    }
}
