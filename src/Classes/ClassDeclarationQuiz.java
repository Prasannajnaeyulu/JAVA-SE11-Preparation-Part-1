package Classes;

// compiler error: modifier static not allowed here
//final static class GreatStuff {  // Line 1
//    public final static String APP_NAME = "GreatApp";
//    public static int counter = 1;  // Line 2
//
//    public final static int helpfulMethod() {  // Line 3
//        return counter++;  // Line 4
//    }
//}

public class ClassDeclarationQuiz {
    // it is OK here. 'static' modifier only applies to nested classes but not to TOP level classes
    final static class GreatStuff {  // Line 1
        public final static String APP_NAME = "GreatApp";
        public static int counter = 1;  // Line 2

        public final static int helpfulMethod() {  // Line 3
            return counter++;  // Line 4
        }
    }
    public static void main(String[] args) {
        System.out.println(GreatStuff.APP_NAME + " " + GreatStuff.helpfulMethod() + " " + GreatStuff.counter);
    }

}
