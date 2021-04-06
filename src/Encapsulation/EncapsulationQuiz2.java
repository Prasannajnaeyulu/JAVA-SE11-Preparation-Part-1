package Encapsulation;

//compiler error: protected can't be applied to top level class
//protected class SuperClass {  // Line 1
//    static void testMe() { System.out.println("SuperClass"); }
//}

//public class EncapsulationQuiz2 extends SuperClass {
//    protected static void testMe() { System.out.println("Test"); }  //Line 2
//
//    public static void main(String[] args) {
//        testMe();  // Line 3
//        //compiler error: super can't be referenced from a static context
////        super.testMe();  // Line 4
//    }
//}