package Objects;


public class ObjectDeclarationQuiz {
    public static void main(String[] args) {
        //compiler error:
        // Both of these statements are invalid. Line 1 is an invalid declaration statement,
        // because b1 is not considered initialized in this statement when it is assigned to a1
        // (Declarators - or declaration statements - are processed in order from left to right in a compound statement)
        // Line 2 is an invalid declaration statement because it's not actually a compound declaration statement,
        // because b2 is not actually declared in this statement and therefore you get a compiler error that that b2 cannot be resolved.
//        Object a1 = b1, b1 = new Object();      // Line 1
//        Object a2 = b2 = new Object();       // Line 2

        Object a3 = new String("testing"), b3 = new Object();   // Line 3
        Object a4 = new Object(), b4 = a4;   // Line 4
    }
}
