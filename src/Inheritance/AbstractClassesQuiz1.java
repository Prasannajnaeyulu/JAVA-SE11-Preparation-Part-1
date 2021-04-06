package Inheritance;

abstract class AbstractClass {

    final void myOwnMethod() {  // Line 1
        System.out.println("my own");
    }

    void familyMethod() {
        System.out.println("my family");
        printFamilyTree();  // Line 2
    }

    abstract void printFamilyTree();
}

abstract class Test extends AbstractClass {  // Line 3
    public static void main(String[] args) {
        printFamilyTrees();
    }

    protected static void printFamilyTrees() {   // Line 4
        // compiler error: Test is abstract so we can't create object of class Test
//        Test t = new Test();   // Line 5
//        t.printFamilyTree();  // Line 6
    }
}