package Methods;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: Overloaded Methods
*/

// Method match works in 3 phases as follows. Note if method match found in one phase it won't go to other phase it simply
// picks and calls the matched method.
// Phase#1: exact match of parameters first if not it checks for super type
// Phase#2: auto boxing and unboxing match
// Phase#3: var args
class WhichOne {
    public String thisOne(Integer i) {
        return "Integer matched";
    }

    public String thisOne(long i) {
        return "long matched";
    }

    public String thisOne(short s) {
        return "short matched";
    }

    public String thisOne(char... c) {
        return "char matched";
    }

    // Adding a method with matching wrapper
    public String thisOne(Character c) {
        return "Character matched";
    }
}

public class Overloading {
    public static void main(String[] args) {
        WhichOne whichOne = new WhichOne();
        char c = 'a';
        System.out.println("Method (" + whichOne.thisOne(c) +
                ") was executed for " + c); // "long matched" because char is a subtype of int

    }
}
