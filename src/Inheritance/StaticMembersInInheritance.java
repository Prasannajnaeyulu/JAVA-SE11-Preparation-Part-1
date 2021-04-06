package Inheritance;

import java.util.Arrays;

class A{
    protected static int a = 10;
    protected int b = 20;
}

class B extends A{
    static int a = 30;
    int b = 40;
}

public class StaticMembersInInheritance {
    public static void main(String... args){
        A a2 = null;
        A a1 = new B();
        int[] array  = new int[3];
        System.out.println(Arrays.toString(array)); // [0, 0 , 0]
        int[] array_1  = {};
        System.out.println(Arrays.toString(array_1)); // []

        // it prints 10. Irrespective of the type of the object the class A is pointing to ( in this case it is pointing to class B object)
        // static or instance variables access always refers to reference type here a1 is a reference of class A. So a1.a refers to A.a
        // a1.b refers to A class b
        System.out.println(a1.a); //10
        System.out.println(a1.b); //20
        // Runtime error: NullPointer exception as a2 is null
//        System.out.println(a2.b);
        // it increments variable a in a1 reference indeed it is equal to A.a++
        a1.a++;
        System.out.println(a1.a); // 11
    }
}
