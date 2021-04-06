package Encapsulation;

// compiler error: we can't created top level classes/interfaces/enums with protected or private access
//protected class AccessModifiersTest {
//}
//
//protected interface a{
//
//}
//
//protected enum ab{
//
//}

//private class AccessModifiersTest {
//}
//
//private interface a{
//
//}
//
//private enum ab{
//
//}

interface intface{
    int a = 10;
    // compiler error: private methods inside interface should have a body
//    private void method();
    private void method1(){};
    // interface methods can't be protected
//    protected void method2(){};
    // by default all methods declared in an interface without any access modifier are public
    // so the class implements this interface must implement the following two methods
    void method3();
    public void method4(); // by default interface method is public so no need to specify as public
}

abstract class Test implements intface{
    // package-private variable
    int a = 10;
    public int b = 20;
    protected int c = 40;
    private int d = 50;
    //compiler error: abstract method can't be private
//    private abstract void greetings();
    // compiler error: toString() in java.lang.Object class is public so we can't declare this with more restrictive access
//    String toString(){
//        return "a: "+a+" b: "+b+" c: "+c+" d: "+d;
//    }
    public String toString(){
        return "a: "+a+" b: "+b+" c: "+c+" d: "+d;
    }
}

// it has to override method3 and method4
class Test1 extends Test{
    //compiler error: attempting to assign weaker access privileges ('package-private'); was 'public'
    // it was public in an interface so we can't make this method more restrictive in child class
//    void method3(){};
    //compiler error: attempting to assign weaker access privileges ('package-private'); was 'public'
    // it was public in an interface so we can't make this method more restrictive in child class
//    void method4();
    //compiler error: attempting to assign weaker access privileges ('protected'); was 'public'
    // it was public in an interface so we can't make this method more restrictive in child class
//    protected void method3(){};
    //compiler error: attempting to assign weaker access privileges ('protected'); was 'public'
    // it was public in an interface so we can't make this method more restrictive in child class
//    protected void method4(){};

    // variables of a parent class can be hidden by child class by declaring them with the same name
    // in this case the variables of child class can be more restrictive or less restrictive it doesn't matter
    private int a = 20;
    protected int b = 10;
    public int c = 50;
    public int d = 60;
    public void method3(){};
    public void method4(){};
    public String toString(){
        return "a: "+a+" b: "+b+" c: "+c+" d: "+d;
    }
}

//compiler error:
enum enum1{
    //compiler error: enum attributes no modifiers allowed for enum constants
//    public SUN, private MON, protected TUE;
    //compiler error: public and protected not allowed for enum constructor
//    public AccessModifiersTest(){}
//      protected AccessModifiersTest(){}
    AccessModifiersTest(){}; // it is private by default
//    private AccessModifiersTest(){}; // we can specify private explicitly which is OK but it is just redundant
}

public class AccessModifiersTest{
    public static void main(String... args){
        Test1 test1 = new Test1();
        // compiler error: it is private in Test1 class so can't access
//        System.out.println("a in Test1 class"+ test1.a);
        System.out.println("b in Test1 class: "+ test1.b);
        System.out.println("c in Test1 class: "+ test1.c);
        System.out.println("d in Test1 class: "+ test1.d);
        // it calls toString in child class Test1
        System.out.println(test1.toString());

        Test t = test1;
        System.out.println("a in Test class: "+ t.a);
        System.out.println("b in Test class: "+ t.b);
        System.out.println("c in Test class: "+ t.c);
        // compiler error: it is private in Parent class Test so can't access
//        System.out.println("a in Test1 class"+ t.d);
        // it calls toString in child class Test1
        // as toString is overridden in child class as per inheritance it picks the most specific one which is
        // obviously the child class one hence it calls child class toString() method though the reference is of type parent
        // but this reference pointing to child class object
        System.out.println(t.toString());
    }
}