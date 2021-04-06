package Interfaces;

// compiler error: interfaces can only be public or default
//private interface a{};
//protected interface a{};

import java.util.ArrayList;

interface a{
    int test = 10;
    // this is public by default don't confuse default with package private it is not. It is always public
    // default we can assume like a default implementation for this interface
    default void print(){
        System.out.println("Interface a");
        print1();
        print2();
    }
    // interface can contain static methods
    // public by default
    static void print1(){
        System.out.println("static method inside an Interface a");
    }
    //interface can contain private methods too
    private void print2(){
        System.out.println("Private method inside an Interface a");
    }
    // this method is public abstract by default
//    void print1();

    //Interface can't contain protected methods
//    protected void print2(){
//        System.out.println("Private method inside an Interface a");
//    }
}

interface b {
    //compiler error: type argument of collection interfaces can't be of primitive type
    // it must be a class
//    List<int> ls = new ArrayList<>();
    int test = 20;
    // this is public by default don't confuse default with package private it is not. It is always public
    // default we can assume like a default implementation for this interface
    default void print(){
        System.out.println("Interface b");
    }
}

// interesting: interface can be declared with abstract keyword. Any interface is implicitly abstract by default
// so if we specify it explicitly or not it is going to be abstract
abstract interface abInterface{
    void greeting();
}

//compiler error: Interfaces.c inherits unrelated defaults for print() from types Interfaces.a and Interfaces.b
// both interfaces a and b have the method print with same signature
// to overcome this error remove one of interface or override the method
//class c implements a, b{
//}

class c implements a, b{
    // compiler error: weaker access privileges it was public in interface but package private here
//    void print(){}
//    protected void print(){}
    public void print(){
        // compiler error: reference test is ambiguous both a.test and b.test match
//        System.out.println("Class c implements a and b"+test+ test);

        int test = 40;
        System.out.println("Class c implements a and b: "+a.test+" "+ b.test);
    }
}

public class InterfaceOverrideMethods {
    public static void main(String... args){
        a c1 = new c();
        System.out.println(c1.test); //10 variables are not inherited so it access 'a' interface test variable
        c1.print();
    }
}
