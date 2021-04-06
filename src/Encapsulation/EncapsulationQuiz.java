//package Encapsulation;
//
//import Encapsulation.pkga.SuperClass;
//
//public class EncapsulationQuiz extends SuperClass {  // Line 1
//    private String text;   // Line 2
//    // compiler error: there is no default constructor available in Super() class which is public or protected
//    EncapsulationQuiz(String text ) {   //Line 3
//        // as we know compiler inserts call to super class default constructor here as Super() by default , it checks for default
//        // constructor that is accessible. We've one but that's not accessible as it is package-private hence we get compiler error here
//        setText(text);
//    }
//    public void setText(String text) { this.text = text; }
//
//    public static void main(String[] args) {
//        System.out.println(new EncapsulationQuiz("text"));  // Line 4
//    }
//}
